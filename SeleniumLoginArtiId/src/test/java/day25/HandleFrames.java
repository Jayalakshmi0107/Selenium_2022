package day25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleFrames {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?index-all.html");
		driver.manage().window().maximize();

		driver.switchTo().frame("packageListFrame");		
		driver.findElement(By.linkText("org.openqa.selenium")).click();//1st frame
		driver.switchTo().defaultContent();//go back to the page
		
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.linkText("WebDriver")).click();//2nd frame
		driver.switchTo().defaultContent();//go back to the page
		
		driver.switchTo().frame("classFrame");
		driver.findElement(By.xpath("//*[text()=Index")).click();//3rd frame

}
}

