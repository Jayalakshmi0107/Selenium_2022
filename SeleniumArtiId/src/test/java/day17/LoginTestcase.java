package day17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/* 1) Open browser
 * 2) open url
 * 3)provide user name
 * 4)provide password
 * 5)click on login
 * 
 */
public class LoginTestcase {

	public static void main(String[] args) 
	{
		/*//1) Open browser -- chrome
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium_Drivers\\chromedriver_win32\\chromedriver.exe");
		//ChromeDriver driver=new ChromeDriver();
		WebDriver driver= new ChromeDriver();// both are correct
		driver.manage().window().maximize();//to maximize the browser window*/
		
		/*//1) Open browser -- edge
				System.setProperty("webdriver.edge.driver", "F:\\Selenium_Drivers\\edgedriver_win64\\msedgedriver.exe");
				EdgeDriver driver=new EdgeDriver();
				//WebDriver driver= new EdgeDriver();// both are correct
				driver.manage().window().maximize();*/
				
				//1) Open browser -firefox
				 System.setProperty("webdriver.gecko.driver", "F:\\Selenium_Drivers\\geckodriver-v0.31.0-win64\\geckodriver.exe");
				 FirefoxDriver driver= new FirefoxDriver();
				 driver.manage().window().maximize();
				 
				 
		
		//2) open url
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//3)Provide user name
		//<input name="txtUsername" id="txtUsername" type="text">
		driver.findElement(By.name("txtUsername")).sendKeys("admin");
		
		//4)provide password
		//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
		
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");

		//5)click on login
		
		//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
		
		driver.findElement(By.id("btnLogin")).click();
		
		//6) validate login
		String expected_title="OrangeHRM";
		String actual_title=driver.getTitle();
		if(expected_title.equals(actual_title))
		{
			System.out.println("Login success test passed");
		}
		else
		{
			System.out.println("Login unsucess Test failed");
		}
		//7 ) close browser
		
		driver.quit();

	}

}
