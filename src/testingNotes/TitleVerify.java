// CONCEPT
	/*
	 * How to navigate seleniumhq.org url and to match the web page
	 * actualTitle with user defined title and print the correct statement using 
	 * conditional statements
	 */

// 1. List ToDo:
	/*
     * 1. open browser
     * 2. navigate to url
     * 3. get the title
     * 4. display title
     * 5. campare title with the expected title
     * 6. close browser
     */
 
// 2. System.setProperty:
     /*
      * It may be related to your test configuration. One way it is sometimes used in Selenium tests 
      * is to set a SYSTEM PROPERTY — specifically, to tell the JVM to use a proxy server — so that 
      * you can inspect or alter Webdriver traffic in your tests. System. setProperty("http.proxyHost", "proxy.example.com");
      */
        	
// 3. ChromeDriver:
     /*
      * ChromeDriver is a separate executable that WebDriver uses to control Chrome. 
      * This executable starts a server on local system to run the Selenium WebDriver Test Scripts
      */
        	
// 4. driver.navigate():
     /*
      * driver.navigate() is used to navigate to particular URL and does not wait to page load
      */
// 5. actualTitle:
	 /*
	  *  actualTitle is a variable in a String format to use to get the title of the web page
	  *  using getTitle()-(which retrieves the page title and assigns the retrieved 
	  *  title to a String object as shown: String page_title; //String object 'page_title' is created). 
	  *  method and stored into variable of actualTitle
	  */
// 6. expectedTitle:
	 /*
	  * It is a variable and it is used to match with user expected title with actual title retrieved by getTitle(); method
	  */



package testingNotes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleVerify {

        public static void main(String[] args) throws InterruptedException {
       
        System.setProperty("webdriver.chrome.driver", "/home/rajesh/Downloads/chromedriver");
        // Open Browser
        WebDriver driver=new ChromeDriver();  
        //  Open Application
        driver.navigate().to("http://seleniumhq.org"); 
        String actualTitle=driver.getTitle();
        System.out.println("Actual Title:"+actualTitle);
        String expectedTitle="seleniumhq";
        if(actualTitle.equals(expectedTitle))
                System.out.println("Title MAtched");
        else
                System.out.println("Title Does Not Matched");
        Thread.sleep(3000);
        
        driver.close();
        
        
                
        }
}

// EXAMPLE 1:
/*
 * package testingNotes;
 * import org.openqa.selenium.WebDriver;
 * public class TitleVerify{
 * 		public static void main(String[] args) throws InterruptedException {
 * 		System.setProperty("webdriver.chrome.driver", "/home/rajesh/Downloads/chromedriver");
 * 		WebDriver driver = new ChromeDriver();
 * 		driver.navigate().to("http://anaconda.org");
 * 		String actualTitle = driver.getTitle();
 * 			System.out.println("Actual Title:" +actualTitle);
 * 		String expectedTitle = "anaconda";
 * 		if(actualTitle.equals(expectedTitle))
 * 			System.out.println("TitleMatched");
 * 		else
 * 			System.out.println("Title Doesn't matched);
 * 		Thread.sleep(3000);
 * 		driver.close();
 * 
 * 		}
 * }
 */


