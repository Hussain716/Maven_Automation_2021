package Day10_010922;

import Day9_010822.Reusable_Actions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class TestNG_Annotation_Google_loop {

    //declare the webdriver outside of the annotation methods so it can be called on all the methods
    WebDriver driver;

    @BeforeSuite
    public void SetTheDriver(){
        driver = Reusable_Actions.setDriver();
    }//end of precondition

    @Test
    public void googleSearchLoop(){
        ArrayList<String > cars = new ArrayList<>();
        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Tesla");

        for(int i = 0; i < cars.size(); i++){
            //navigating to google
            driver.navigate().to("https://www.google.com");
            //entering a unique keyword from array list
            Reusable_Actions.sendKeysMethod(driver,"//*[@name='q']",cars.get(i),"Search Field");

        }


    }//end of test

    @AfterSuite
    public void endSession(){
        driver.quit();
    }


}//end of java







