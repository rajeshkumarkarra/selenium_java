package testingNotes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompleteFeature {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "/home/rajesh/Downloads/chromedriver");
	        WebDriver driver=new ChromeDriver();        
	        driver.navigate().to("http://google.com");
	        driver.findElement(By.name("q")).sendKeys("Selenium");
	        Thread.sleep(3000);
	        driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
	        Thread.sleep(3000);
	        driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
	        Thread.sleep(3000);
	        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

	        
	}

}
