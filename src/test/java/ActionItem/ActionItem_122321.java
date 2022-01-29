package ActionItem;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ActionItem_122321 {


    public static void main(String[] args) throws InterruptedException {

        //set an array
        String[] sports = new String[6];
        sports[0] = "NBA";
        sports[1] = "Football";
        sports[2] = "MLB";
        sports[3] = "MMA";
        sports[4] = "NHL";
        sports[5] = "MLS";
        //test for github Aker is gay

        //set the property of the chromedriver we are using
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");

        ChromeOptions options = new ChromeOptions();

        options.addArguments("incognito");


        //define the web driver you are using
        WebDriver driver = new ChromeDriver();



        for (int i = 0; i < sports.length; i++) {


            // open the bing web site
            driver.navigate().to("https://www.bing.com");

            //maximize my browser
            driver.manage().window().fullscreen(); //for mac
            // driver.manage().window().maximize(); //for windows

            //wait statement 2 sec
            Thread.sleep(2000);

            //searching for sports
            driver.findElement(By.xpath("//*[@name='q']")).sendKeys(sports[i]);

            //hit submit on bing
            driver.findElement(By.xpath("//*[@id='sb_form_go']")).submit();

            // wait 3 sec
            Thread.sleep(3000);

            //capture the search result and store it as a variable
            String result = driver.findElement(By.xpath("//*[@id='b_tween']")).getText();

            //declare the array variable to split the result
            String[] arrayResult = result.split(" ");

            //print
            System.out.println("My search result is " + sports[i] + " is " + arrayResult[0]);


        }//end of for loop

        //close it
        driver.quit();

    }//end of main method
}//end of java class
