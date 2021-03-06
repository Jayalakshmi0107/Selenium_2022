package day24;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Thread.sleep(5000);
		//driver.switchTo().alert().dismiss(); //directly closing without doing any operation
		Alert myalert=driver.switchTo().alert();
		System.out.println(myalert.getText());//get  test from alert window
		myalert.sendKeys("Welcome");//pass value inside input box
		myalert.accept();//close alert window by using OK  button
		String exp_text="You entered: welcome";
		String act_text=driver.findElement(By.id("result")).getText();
		
		if(exp_text.equals(act_text))
		{
			System.out.println("Sucessfully Presses OK button");
		}
		else
		{
			System.out.println("OK button Not Pressed");
		}
		
		
		//myalert.dismiss();//close alert window by using cancel button
	}

}
