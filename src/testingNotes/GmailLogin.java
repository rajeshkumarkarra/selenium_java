package testingNotes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLogin {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "/home/rajesh/Downloads/chromedriver");
		 // System.setProperity is used to set the path of the chrome driver
	        WebDriver driver=new ChromeDriver();   //to open chrome browser
	        //webDriver is the interface and driver is the object name and ChromeDriver is a class
	        driver.navigate().to("http://gmail.com");//navigate is used to to open the URL
	       // driver.switchTo().frame(0);
            Thread.sleep(3000);
	        driver.findElement(By.name("identifier")).sendKeys("rajeshkumarkarra2@gmail.com");
	        // sendkeys is the method which'll insert text in the field
	        // By.name(By is the pre-defined class, name is the method) it's used to identify the web element
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//span[text()='Next']")).click();
	        //click is the method which is used to click on the web element
	        //xpath is used to identify the web element in a special case like 1. element in any HTML tags like %<Next%>
	}

}
