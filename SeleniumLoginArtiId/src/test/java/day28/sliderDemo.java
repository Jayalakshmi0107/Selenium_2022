package day28;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sliderDemo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		
		Actions act= new Actions(driver);
		WebElement min_slider=driver.findElement(By.xpath("//span[1]"));
		System.out.println("Loction of min Slider "+min_slider.getLocation());
		act.dragAndDropBy(min_slider, 100, 0).perform();
		System.out.println("Loction of min Slider after moving "+min_slider.getLocation());

		WebElement max_slider=driver.findElement(By.xpath("//span[2]"));
		System.out.println("Loction of min Slider "+max_slider.getLocation());
		act.dragAndDropBy(max_slider, -250, 0).perform();
		System.out.println("Loction of min Slider after moving "+max_slider.getLocation());

		
	}

}
