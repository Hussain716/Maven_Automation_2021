package ActionItem;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;
import java.util.List;

public class ActionItem_123121 {

    public static void main(String[] args) throws InterruptedException {


        ArrayList<String> zipcode = new ArrayList<>();
        zipcode.add("14214");
        zipcode.add("22222");
        zipcode.add("33333");


        //call the webdrivermanager
        WebDriverManager.chromedriver().setup();
        //call chromeoptions
        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito");
        options.addArguments("fullscreen");
        WebDriver driver = new ChromeDriver(options);

        for (int i = 0; i < zipcode.size(); i++) {

            //open browser and click on attend
            try {
                driver.navigate().to("https://www.weightwatchers.com");
                //driver.manage().window().fullscreen(); //for mac
                Thread.sleep(2500);
                WebElement attend = driver.findElement(By.xpath("//*[text()='Attend']"));
                attend.click();
            } catch (Exception e) {
                System.out.println("unable to click on Attend " + e);
            }

            //Click on Unlimited Workshops
            try {
                driver.findElement(By.xpath("//*[@class='MenuItem_subtitle__3LoiE']")).click();

            } catch (Exception e) {
                System.out.println("Unable to click on workshops" + e);
            }


            //Click on Studio
            try {
                driver.findElement(By.xpath("//*[text()='Studio']")).click();

            } catch (Exception e) {
                System.out.println("Unable to click on studio" + e);
            }

            //Click and enter zipcodes
            try {
                WebElement click = driver.findElement(By.xpath("//*[@id='location-search']"));
                click.click();
                click.sendKeys(zipcode.get(i));

            } catch (Exception e) {
                System.out.println("Unable to click on enter location and enter zipcodes" + e);
            }

            //Click on right arrow
            try {
                driver.findElement(By.xpath("//*[contains(@class,'rightArrow-daPRP')]")).click();


            } catch (Exception e) {
                System.out.println("Unable to click on arrow" + e);
            }
            Thread.sleep(2000);


            //Conditional for iteration
            try {

                List<WebElement> studio = driver.findElements(By.xpath("//*[contains(@class,'wrapperLink-2NobU')]"));
                if (i == 0) {
                    studio.get(1).click();
                }
                if (i == 1) {
                    studio.get(3).click();
                }
                if (i == 2) {
                    studio.get(0).click();
                }


            } catch (Exception e) {
                System.out.println("Unable to select studio" + e);
            }

            //wait 2sec
            Thread.sleep(2000);

            try {
                //Capture entire address on a variable and print out the address
                String result = driver.findElement(By.xpath("//*[@class='address-2PZwW']")).getText();
                System.out.println("The address is " + result);
            } catch (Exception e) {
                System.out.println("Unable to capture address" + e);
            }


            JavascriptExecutor jse = (JavascriptExecutor) driver;
            //scroll to the view by pixels
            jse.executeScript("scroll(0,450)");

            //Click on business hours
            try {
                driver.findElement(By.xpath("//*[contains(@class,'title-3o8Pv')]")).click();


            } catch (Exception e) {
                System.out.println("Unable to click on Business hours" + e);

            }

            try {
                //Days and Hours
                String hours = driver.findElement(By.xpath("//*[@class='hoursWrapper-1KHIv show-1db4o']")).getText();
                System.out.println("The business hours are " + hours);
            } catch (Exception e) {
                System.out.println("Unable to capture days and hours " + e);
            }

        }//end of for loop
    }//end of main
}//end of java
