package day23_assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownPractiseWithoutSelect {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		
		//Capture all the options and print them
		List <WebElement>allOptions=driver.findElements(By.xpath("//select[@class='custom-select']/option"));
		System.out.println("No of options to travel " +allOptions.size());
		
		//Print countries list in console
		/*for(int i=0;i<allOptions.size();i++)
		{
			System.out.println("Available countries are   "+allOptions.get(i).getText());
		}*/
		
		for(WebElement options :allOptions)
		{
			System.out.println("List of countries "+options.getText());
		}
		
	
	}

}
