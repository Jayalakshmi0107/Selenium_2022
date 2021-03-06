package day23_assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownPractiseSelect {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();

			driver.get("https://itera-qa.azurewebsites.net/home/automation");
			driver.manage().window().maximize();
			
		/*WebElement dropCountryEle=driver.findElement(By.xpath("//select[@class='custom-select']"));
		Select dropCountry=new Select(dropCountryEle);*/
		
		Select dropCountry=new Select(driver.findElement(By.xpath("//select[@class='custom-select']")));
		
		//Finding number of options present in the drop down
		List <WebElement>allOptions=dropCountry.getOptions();
		System.out.println("No of country option to travel "+allOptions.size());
		
		////select option from dropdown
		dropCountry.selectByVisibleText("Italy");
		Thread.sleep(5000);
		dropCountry.selectByValue("3"); //Turkey
		
		Thread.sleep(5000);  
		dropCountry.selectByIndex(4);//greece
		
		//Print countries list in console
		/*for(int i=0;i<allOptions.size();i++)
		{
		System.out.println(allOptions.get(i).getText());
		}*/
		
		for (WebElement printcountry : allOptions )
		{
			System.out.println(printcountry.getText());
		}
		
		}
	}

