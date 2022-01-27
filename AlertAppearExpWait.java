package week4.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.messages.types.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertAppearExpWait {

	public static void main(String[] args) {
		//Launch the Browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(5));
		
		//Load the URL
		driver.get("http://www.leafground.com/pages/alertappear.html");
		
		//Maximize the Browser
		driver.manage().window().maximize();
		
		WebDriverWait wait= new WebDriverWait(driver,java.time.Duration.ofSeconds(5));
		driver.findElement(By.xpath("//button[@id='alert']")).click();
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		alert.accept();
		driver.close();

	}

}
