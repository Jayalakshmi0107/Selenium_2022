package day23;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownSelectDemo {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();

		WebElement dropCountryEle=driver.findElement(By.xpath("//select[@id='input-country']"));
		
		Select dropcountry=new Select(dropCountryEle);
		
		//select option from dropdown
		//dropcountry.selectByVisibleText("India"); //india
		//dropcountry.selectByValue("3" );  //Algeria
		//dropcountry.selectByIndex(6);//Angola -- 6 is index
		
		//Finding number of options present in the drop down
		List<WebElement>alloptions=dropcountry.getOptions();
		System.out.println("Total no.of options present in drop down "+alloptions.size());//242
		
		//Print countries list in console
		/*for(int i=0;i<alloptions.size();i++)
		{
			System.out.println(alloptions.get(i).getText());
		}*/
		for(WebElement option:alloptions)
		{
			System.out.println(option.getText());
		}
		
		
	}
	
	
	

}
