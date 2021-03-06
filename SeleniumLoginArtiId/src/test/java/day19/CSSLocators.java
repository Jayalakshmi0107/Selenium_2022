package day19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSSLocators {

	public static void main(String[] args) {
		
		//Launch chrome browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//open a url
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		//css -with tag and id #
		//driver.findElement(By.cssSelector("input#search_query_top")).sendKeys("T-Shirts");
		//driver.findElement(By.cssSelector("#search_query_top")).sendKeys("T-Shirts");
		
		//css tag and class . 
		//driver.findElement(By.cssSelector("input.search_query")).sendKeys("T-Shirts");
		//driver.findElement(By.cssSelector(".search_query")).sendKeys("T-Shirts");
		
		//css tag and attribute
		
		//driver.findElement(By.cssSelector("input[name='search_query']")).sendKeys("T-Shirts");
		//driver.findElement(By.cssSelector("[name='search_query']")).sendKeys("T-Shirts");
		
		//css with tag class attribute
		//driver.findElement(By.cssSelector("input.search_query[name='search_query']")).sendKeys("T-Shirts");
		driver.findElement(By.cssSelector(".search_query[name='search_query']")).sendKeys("T-Shirts");
	}

}
