package ActionItem;

import Day9_010822.Reusable_Actions;
import Reusable_Library.Reusable_Actions_Loggers;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class ActionItem_Express {


    WebDriver driver;
    //your extentreport and extenttest command should be declared outside so it can be reusable among all annotations
    ExtentReports reports;
    ExtentTest logger;

    @BeforeSuite
    public void SetTheDriver() {
        driver = Reusable_Actions.setDriver();
        //set the path of the report once
        reports = new ExtentReports("src/main/java/HTML_Report/Automation_Report.html", true);
    }//end of precondition


    @Test()
    public void ExpressDataDriven() throws IOException, BiffException, WriteException, InterruptedException {

        //Step 1: read the data from the excel sheet you created
        Workbook readableFile = Workbook.getWorkbook(new File("src/main/resources/GoogleSearch.xls"));
        //Step 2: locating the worksheet that you created for the workbook
        //Sheet readableSheet = readableFile.getSheet(0);
        //will return the physical rows present on the sheet
        //int rowCount = readableSheet.getRows();
        //System.out.println("My row count is " + rowCount);

        //Step 3: create a writable file to mimic readable but you can also write back the results to this file
        WritableWorkbook writableFile = Workbook.createWorkbook(new File("src/main/resources/GoogleSearch_Results.xls"), readableFile);
        WritableSheet writableSheet = writableFile.getSheet(1);
        //will return the physical rows present on the sheet
        int rowCount2 = writableSheet.getRows();

        //System.out.println("My writable row count is " + rowCount2);
        int i = 1;
        while (i < rowCount2) {


            //store the values as a variable
            String Sizes = writableSheet.getCell(0, i).getContents();
            System.out.println("My size is " + Sizes);

            String Quantity = writableSheet.getCell(1, i).getContents();
            System.out.println("My quantity is " + Quantity);

            String FirstName = writableSheet.getCell(2, i).getContents();
            System.out.println("My first name is " + FirstName);

            String LastName = writableSheet.getCell(3, i).getContents();
            System.out.println("My last name is " + LastName);

            String Email = writableSheet.getCell(4, i).getContents();
            System.out.println("My email is " + Email);

            String PhoneNumber = writableSheet.getCell(5, i).getContents();
            System.out.println("My phone number " + PhoneNumber);

            String Address = writableSheet.getCell(6, i).getContents();
            System.out.println("My address is " + Address);

            String Zipcode = writableSheet.getCell(7, i).getContents();
            System.out.println("My zipcode is " + Zipcode);

            String City = writableSheet.getCell(8, i).getContents();
            System.out.println("My city is " + City);

            String State = writableSheet.getCell(9, i).getContents();
            System.out.println("My state is " + State);

            String CardNumber = writableSheet.getCell(10, i).getContents();
            System.out.println("My card number is " + CardNumber);

            String ExpirationMo = writableSheet.getCell(11, i).getContents();
            System.out.println("My expiration month is " + ExpirationMo);

            String ExpirationYear = writableSheet.getCell(12, i).getContents();
            System.out.println("My expiration year is " + ExpirationYear);

            String SecCode = writableSheet.getCell(13, i).getContents();
            System.out.println("My security code is " + SecCode);

            String ErrorCode = writableSheet.getCell(14, i).getContents();
            System.out.println("My error code is  " + ErrorCode);

            logger = reports.startTest("Shop for a Womans dress");

            //Navigate to http://www.express.com
            logger.log(LogStatus.INFO, "Navigate to Express home page");
            driver.navigate().to("https://www.express.com");

            //2. Verify we are on following page title contains ‘Men’s and Women’s Clothing
            String actualTitle = driver.getTitle();
            if (actualTitle.equals("Express - Men's & Women's Clothing")) {
                System.out.println("Title matches " + actualTitle);
            } else {
                System.out.println("Title doesn't match. Actual title is " + actualTitle);
            }


            //3: Hover on ‘Women’ tab using Actions //use contains @href proper
            Reusable_Actions_Loggers.mouseHover(driver, "//*[contains(@href,'womens-clothing?W_HEADER_WOMENSCLOTHING')]", logger, "Women");
            //4: click on ‘Dresses’ link //use contains @href property or you can use texi() prope!
            Reusable_Actions_Loggers.clickMethod(driver, "//*[text()='Dresses']", logger, "Click on Dresses");

            Thread.sleep(2000);
            //5: wait few seconds using Thread.sleep and Scroll about 400 to 500 pixels|

            Reusable_Actions.scrollmethod(driver, "400", "500", "scroll");

            // Close POP UP
            Reusable_Actions_Loggers.clickMethod(driver,"//*[@name='bluecoreCloseButton']",logger,"pop-up");

            //6. Click on second image //use @class property with index number as 1. you can use click Bylndex() method from your reusable}
            Reusable_Actions_Loggers.clickByIndex(driver, "//*[@class='_1vuRDTYH _3jxErwTw']", 1, logger, "Click");
            //7: wait few seconds on next page}
            Thread.sleep(3000);

            //8 On size page click on specific size(choose different size each time on excel) and the value should be passed as a locator as text or value prope!
            Reusable_Actions_Loggers.clickMethod(driver, "//*[text()='" + Sizes + "']", logger, "Size");

            //9: Click on ‘Add to Bag’ button|
            Reusable_Actions_Loggers.clickMethod(driver, "//*[text()='Add to Bag']", logger, "Add to bag");

            //10: on pop up to the right side click on ‘View Bag’ tab then wait few seconds
            Reusable_Actions_Loggers.clickMethod(driver, "//*[text()='View Bag']", logger, "View Bag");
            Thread.sleep(2000);

            //11: Select a quantity(choose different one each time)
            Reusable_Actions_Loggers.clickMethod(driver, "//*[text()='" + Quantity + "']", logger, "Quantity");

            //12: Click on ‘Checkout?’ button then wait few seconds|
            Reusable_Actions_Loggers.clickMethod(driver, "//*[text()='Checkout']", logger, "Checkout");

            //13: on pop up click on ‘Continue as Guest’ button then wait few seconds|
            Reusable_Actions_Loggers.clickMethod(driver, "//*[text()='Checkout as Guest']", logger, "Guest Checkout");

            //14: Enter first name’
            Reusable_Actions_Loggers.sendKeysMethod(driver, "//*[@name='firstname']", FirstName, logger, "First Name");


            //15: Enter last name}
            Reusable_Actions_Loggers.sendKeysMethod(driver, "//*[@name='lastname']", LastName, logger, "Last Name");

            //16: Enter Email address(put invalid address)}

            Reusable_Actions_Loggers.sendKeysMethod(driver, "//*[@name='email']", Email, logger, "Email");

            //17: Re-enter Email address(put same email above)
            Reusable_Actions_Loggers.sendKeysMethod(driver, "//*[@name='confirmEmail']", Email, logger, "Confirm Email");

            //18: enter phone number(invalid numeric 10 digit number)
            Reusable_Actions_Loggers.sendKeysMethod(driver, "//*[@name='phone']", PhoneNumber, logger, "Phone");

            //19: Click on ‘Continue’ button|
            Reusable_Actions_Loggers.clickMethod(driver, "//*[text()='Continue']", logger, "Continue");

            //21: Enter address(invalid one. For instance, 111, 222, etc...)
            Reusable_Actions_Loggers.sendKeysMethod(driver, "//*[@name='shipping.line1']", Address, logger, "Address");

            //22: Enter zipcode(different boroughs zipcode);
            Reusable_Actions_Loggers.sendKeysMethod(driver, "//*[@name='shipping.postalCode']", Zipcode, logger, "Postal Zipcode");
            //23: Enter city(different boroughs)}
            Reusable_Actions_Loggers.sendKeysMethod(driver, "//*[@name='shipping.city']", City, logger, "City");
            //24: Select state(keep as NY for zip codes);
            Reusable_Actions_Loggers.clickMethod(driver,"//*[@name='shipping.state']",logger,"clicking on state dropdown");
            Reusable_Actions_Loggers.selectByVisibleText(driver,"//*[@name='shipping.state']",State,logger,"state");
            //25: click on continue button;
            Reusable_Actions_Loggers.clickMethod(driver, "//*[text()='Continue']", logger, "Continue");
            Reusable_Actions_Loggers.clickMethod(driver, "//*[text()='Continue']", logger, "Continue");


            //26: Clear and Enter card number(use invalid card number for different card type. Look into examples of American express, discover, master & visa)}
            Reusable_Actions_Loggers.sendKeysMethod(driver, "//*[@name='creditCardNumber']", CardNumber, logger, "Credit Card");

            Reusable_Actions_Loggers.selectByVisibleText(driver, "//*[@name='expMonth']", ExpirationMo, logger, "expMonth");
            Reusable_Actions_Loggers.selectByVisibleText(driver, "//*[@name='expYear']", ExpirationYear, logger, "ExpYear");

            Reusable_Actions_Loggers.sendKeysMethod(driver, "//*[@name='cvv']", SecCode, logger, "cvv");

            // 27. Click on ‘Place Order’ button
            Reusable_Actions_Loggers.clickMethod(driver, "//*[text()='Place Order']", logger, "Place Order");

            //28: capture the error message for card number field and send it back to errorMessage column in excel
            String result = Reusable_Actions_Loggers.getTextMethod(driver,"//*[@class='_2paT8dZ2 _1gNCYBQ3']", logger, "Error");
            System.out.println("The error is "+result);


            //Storing the values to the writable excel sheet
            Label label = new Label(14,i,result);

            /*29. type on your @Test method inside loop at the end ‘ so your address info and cart items doesn’t get stored once you navigate
            again to the site and checkout. It will delete the cache*/
            //I need to write back to the writable sheet

            writableSheet.addCell(label);
            driver.manage().deleteAllCookies();

            i = i + 1;
        }//end of loop
        reports.endTest(logger);
        writableFile.write();
        writableFile.close();
    }
    @AfterSuite
    public void endSession () {
        driver.quit();
        reports.flush();
    }
}//end of java














