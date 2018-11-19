// CONCEPT:
	/*
	 * How to navigate to google.com and find the name element and type with user defined
	 * name for the result, also scroll down the result as user wish than hit the enter in a 
	 * particular path
	 */


// AutoCompleteFeature:
	/*
	 *  the Method findElement in Selenium. findElement is a method as part of SearchContext interface
	 */
package testingNotes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompleteFeature {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "/home/rajesh/Downloads/chromedriver");
		 	// Open Browser
	        WebDriver driver=new ChromeDriver();  
	        // open Applicationx`
	        driver.navigate().to("http://google.com");
	        // Locate the element using Name locator and enters test data "Software Testing Material"
	        driver.findElement(By.name("q")).sendKeys("Selenium");
	        Thread.sleep(3000);
	        driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
	        Thread.sleep(3000);
	        driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
	        Thread.sleep(3000);
	        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

	        
	}

}

// EXAMPLE 1:

/*
 * package testingNotes;

import org.openqa.selenium.By;

public class AutoCompleteFeature{
	public static void main(String[] args) thorws InterruptedException{
	System.setProperty("webdriver.chrome.driver", "/home/rajesh/Downloads/chromedriver");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://google.com");
	driver.findElement(By.name(q)).sendKeys("raspberry");
	Thread.sleep(3000);
	driver.findElement(By.name(q).sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(3000);
	driver.findElement(By.name(q).sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(3000);
	driver.findElement(By.name(q).sendKeys(Keys.ARROW_DOWN);
	driver.findElement(By.name(q).sendkeys(Keys.ENTER);
	
	}
}
	
	
	
	
 */
