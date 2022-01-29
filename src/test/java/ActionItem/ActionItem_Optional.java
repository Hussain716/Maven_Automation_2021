package ActionItem;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class ActionItem_Optional {

    public static void main(String[] args) throws InterruptedException {



        ArrayList<String> zipcode = new ArrayList<>();
        zipcode.add("11111");
        zipcode.add("22222");
        zipcode.add("33333");

        ArrayList<Integer> milesRange = new ArrayList<>();
        milesRange.add(23);


        //call the webdrivermanager
        WebDriverManager.chromedriver().setup();
        //call chromeoptions
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("incognito");
        //options.addArguments("fullscreen");
        WebDriver driver = new ChromeDriver(options);

        for (int i = 0; i < zipcode.size(); i++) {


            try {
                driver.navigate().to("https://www.aetna.com");
                //driver.manage().window().fullscreen(); //for mac
                Thread.sleep(2500);
                WebElement attend = driver.findElement(By.xpath("//*[text()='Shop for a plan']"));
                attend.click();

            } catch (Exception e) {
                System.out.println("unable to click on shop for a plan " + e);
            }

            //System.out.println("Hi" +milesRange);

            try {
                driver.findElement(By.xpath("//*[text()='Medicare']")).click();
            } catch (Exception e) {
                System.out.println("Unable to click on Medicare Link " + e);
            }

            //Click on Find a Doctor
            try {
                driver.findElement(By.xpath("//*[contains(text(),'Find a doctor')]")).click();
            } catch (Exception e) {
                System.out.println("Unable to click on Find a Doctor " + e);
            }

            Thread.sleep(2000);

            //Click on 2022 Medicare plans you purchase
            try {
                Thread.sleep(4000);

                driver.findElement(By.xpath("//*[text()='2021 Medicare plans you purchase yourself']")).click();
            } catch (Exception e) {
                System.out.println("Unable to click on 2021 Medicare Plans " + e);
            }

            //Enter zipcode
            try {
                Thread.sleep(2000);

                driver.findElement(By.xpath("//*[@id='medZip]")).sendKeys(zipcode.get(0));

            } catch (Exception e) {
                System.out.println("Unable to click on 2021 Medicare Plans " + e);
            }


        }//end of loop

    }//end of main
}//end of java class
