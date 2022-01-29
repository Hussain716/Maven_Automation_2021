package Day4_121221;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Automation {

    public static void main(String[] args) {

        //set the property of the chrome driver we are using
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");

        //define the web driver you are using
        WebDriver driver = new ChromeDriver();

        //simply open the google website
        driver.navigate().to("https://www.google.com");

        //maximize my browser
        driver.manage().window().fullscreen();
        //driver.manage().window().maximize(); //for windows

        //close it
        // driver.close();


    }//end of main method


}//end of java
