// CONCEPT:
	/*
	 * How to navigate to gmail and fill the email field with email id automatically and click on
	 * next button automatically
	 */

/*package testingNotes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLogin {

	public static void main(String[] args) throws InterruptedException {
		 	System.setProperty("webdriver.chrome.driver", "/home/rajesh/Downloads/chromedriver");
		 	// open browser
		 	//webDriver is the interface and driver is the object name and ChromeDriver is a class
	        WebDriver driver=new ChromeDriver();   
	        // open application
	        driver.navigate().to("http://gmail.com");
	        // driver.switchTo().frame(0);
            Thread.sleep(3000);
            // sendkeys is the method which'll insert text in the field
	        // By.name(By is the pre-defined class, name is the method) it's used to identify the web element
	        driver.findElement(By.name("identifier")).sendKeys("rajeshkumarkarra2@gmail.com");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//span[text()='Next']")).click();
	        // click is the method which is used to click on the web element
	        // xpath is used to identify the web element in a special case like 1. element in any HTML tags like %<Next%>
	}

}
*/

// EXAMPLE 1:
/*package testingNotes;
 * 

import org.openqa.selenium.By;

public class GmailLogin {

	public static void main(String[] args) throws InterruptedException{
	System.setProperty("webdriver.chrome.driver", "/home/rajesh/Downloads/chromedriver");
	WebDriver driver = new ChromeDriver();
	driver.naviagate().to("http://facebook.com");
	Thread.sleep(3000);
	driver.findElement(By.name("email")).sendKeys("rajeshkumarkarra");
	Thread.sleep(3000);
	driver.findElement(By.name("pass")).sendKeys("abc123");
	Thread.sleep(3000);
	driver.findElement(By.name("login")).click();
	
	}
	
}
*/


// EXAMPLE 2;

/*package testingNotes;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLogin {
	public static void main(String [] args) throws InterruptedException, IOException{
	// create the webdriver instance
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "/home/rajesh/Downloads/chromedriver");
	driver = new ChromeDriver();
	driver.navigate().to("http://facebook.com");
	Thread.sleep(3000);
	driver.manage().window().maximize();
	// Load the properties file
	Properties obj = new Properties();
	FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"userLoginDetails.properties");
	obj.load(objfile);
	//navigate to facebook login page
	driver.findElement(By.xpath(obj.getProperty("email")));
	Thread.sleep(3000);
	driver.findElement(By.xpath(obj.getProperty("pass")));
	Thread.sleep(3000);
	driver.findElement(By.xpath(obj.getProperty("login"))).click();
	
	}
}
	
*/
	


// EXAMPLE 4:
package testingNotes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLogin {

	public static void main(String[] args) throws InterruptedException, IOException {
		 	System.setProperty("webdriver.chrome.driver", "/home/rajesh/Downloads/chromedriver");
		 	// open browser
		 	//webDriver is the interface and driver is the object name and ChromeDriver is a class
	        WebDriver driver=new ChromeDriver();   
	        // open application
	        driver.navigate().to("http://gmail.com");
	        // driver.switchTo().frame(0);
            Thread.sleep(3000);
            // sendkeys is the method which'll insert text in the field
	        // By.name(By is the pre-defined class, name is the method) it's used to identify the web element
            
            String path=".//userLoginDetails.properties";
            File f=new File(path);
            FileInputStream src=new FileInputStream(f);
            Properties pro=new Properties();
            pro.load(src);
            String uname=pro.getProperty("email");
            System.out.println(uname);
	        driver.findElement(By.name("identifier")).sendKeys(uname);
	        driver.findElement(By.xpath("//span[text()='Next']")).click();
	        String upass=pro.getProperty("password");
            System.out.println(upass);
	        driver.findElement(By.name("password")).sendKeys(upass);
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//span[text()='Next']")).click();
	        // click is the method which is used to click on the web element
	        // xpath is used to identify the web element in a special case like 1. element in any HTML tags like %<Next%>
	}
}

// testing github integration on Intelli J IDEA
// testing github project branch (first_branch)
// ****
// *****

