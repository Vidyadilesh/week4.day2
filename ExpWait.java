package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExpWait {

	public static void main(String[] args) {
		
		//Launch the Browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		//Load the URL
		driver.get("http://www.leafground.com/pages/appear.html");
		
		//Maximize the Browser
		driver.manage().window().maximize();
		
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5));
		
		WebElement element = driver.findElement(By.xpath("//button[@id='btn']"));
		wait.until(ExpectedConditions.visibilityOf(element));
		System.out.println(element.getText());

	}

}
