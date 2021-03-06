package day24;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggesteddropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
		Thread.sleep(3000);
	/*List<WebElement> allOptions=driver.findElements(By.xpath("//*[@class='pcTkSc']"));
System.out.println(allOptions.size());*/

List<WebElement> allOptions=driver.findElements(By.xpath("//*[@class='sbct']//div[@role='option']"));
System.out.println("2nd accurate path "+allOptions.size());

/*for(int i=0;i<allOptions.size();i++)
{
	System.out.println(allOptions.get(i).getText());
}*/

for(WebElement option:allOptions)
{
	if(option.getText().equals("selenium tutorial"))
	{
		option.click();
		break;
		
	}
}

	}

}
