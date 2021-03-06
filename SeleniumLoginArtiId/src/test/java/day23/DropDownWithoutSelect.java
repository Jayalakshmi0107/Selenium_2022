package day23;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownWithoutSelect {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();

		//Capture all the options and print them
		List<WebElement>allOptions=driver.findElements(By.xpath("//select[@id='input-country']/option"));
		
		//find total no of options
		System.out.println("Total no.of option are "+allOptions.size());
		/*for(WebElement option:allOptions) {
			System.out.println(option.getText());
		}*/
			
	
		// select options from dropdown
		for(WebElement option:allOptions) {
			if(option.getText().contentEquals("Angola"))
			{
				option.click();
				break;
			}
		}
		
	}
	
	
	

}
