
package testingNotes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleVerify {

        public static void main(String[] args) throws InterruptedException {
/*
 * 1. open browser
 * 2. navigate to url
 * 3. get the title
 * 4. display title
 * 5. campare title with the expected title
 * 6. close browser
 */
        System.setProperty("webdriver.chrome.driver", "/home/rajesh/Downloads/chromedriver");
        WebDriver driver=new ChromeDriver();        
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