package day27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightclickMouseHover {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();

		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();

		WebElement button=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		//Right clcik action

		Actions act=new Actions(driver);

		//act.contextClick(button).build().perform();

		act.contextClick(button).perform();

		driver.findElement(By.xpath("//span[normalize-space()='Copy']")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().dismiss();
	}

}
