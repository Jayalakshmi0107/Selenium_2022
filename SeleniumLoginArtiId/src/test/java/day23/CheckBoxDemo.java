package day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.tools.javac.util.List;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxDemo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		//sewlecting the check box
		driver.findElement(By.id("monday")).click();
		
		/*List<A> the total number of check boxes
		//List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@type='checkbox' and @class='form-check-input'));
		//System.out.println("Size of Checkbox is "+checkboxes.size());
				/*for(int i=0;i<checkboxes.size();i++
						{
					checkboxes.get(i).click();
						}*/
				
				/*for (WebElement chkbox:checkboxes)
				{
					chkbox.click();
				}
				
	//select last 2 check boxes
				for(int i=5;i<checkboxes.size();i++)
						{
					checkboxes.get(i).click();
						}
				//select first 2 check boxes			
				for(int i=0;i<2;i++)
				{
			checkboxes.get(i).click();
				}*/
						
						
					
	}

}
