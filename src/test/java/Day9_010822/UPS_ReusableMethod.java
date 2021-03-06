package Day9_010822;

import org.openqa.selenium.WebDriver;

import static Day9_010822.Reusable_Actions.sendKeysMethod;

public class UPS_ReusableMethod {

    public static void main(String[] args) throws InterruptedException {


    WebDriver driver = Reusable_Actions.setDriver();

    //navigate to ups
        driver.navigate().to("https://www.ups.com/us");
        driver.manage().window().fullscreen(); //for mac

        Thread.sleep(3000);

    //click on Track
        Reusable_Actions.clickMethod(driver, "//*[text()='Tracking']", "Track");


    //click on track a package
        Reusable_Actions.clickMethod(driver, "//*[text()='Track a Package']", "Track a Package");

        Thread.sleep(3000);

    //enter any tracking number
        sendKeysMethod(driver, "//*[@id='stApp_trackingNumber']", "1111111111111", "Enter Tracking");


    //click on Track button
        Reusable_Actions.clickMethod(driver,"//*[@id='stApp_btnTrack']","Track Button");

        Thread.sleep(3000);

    //capture the error message and print out only 'We could not locate the shipment'
    String resultValue = Reusable_Actions.getTextMethod(driver,"//*[@id='stApp_error_alert_list0']","Error Message");


    //declare array and split
    String[] arrayResult = resultValue.split("details");
        System.out.println("My error info is " + arrayResult[0]);

        Thread.sleep(3000);

}//end of click getTextMethod
    }//click on Track button




