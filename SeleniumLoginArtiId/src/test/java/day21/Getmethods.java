package day21;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Getmethods {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard"); //open url on the browser
		
		System.out.println("Current Url " +driver.getTitle()); //returns little of the web page
		
		System.out.println("Current url is "+driver.getCurrentUrl());// returns current url
		
		//System.out.println("Page source........... "+driver.getPageSource());
		
		String windowId=driver.getWindowHandle();
		System.out.println("Window id " +windowId); //EAE5EC8ABEFAB7677E6A65EB0EE499FE
		                         //Window id CDwindow-0EE208232E100345BA74BB07D29C5CDA
		
		
		driver.getWindowHandles();
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click(); //click on the link
		
		Set<String> windowIds=driver.getWindowHandles();
		for(String winid:windowIds)
		{
			System.out.println(winid);
		}
		
		driver.close();
	}

}
