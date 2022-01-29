package ActionItem;

import Day9_010822.Reusable_Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class ActionItem_011321 {

    //Driver
    WebDriver driver;


    @BeforeSuite
    public void SetTheDriver() {
        driver = Reusable_Actions.setDriver();
    }


    @Test(priority = 1)
    public void SearchForAKeyword() {

        //Email
        ArrayList<String> email = new ArrayList<>();
        email.add("ggfkvj@gmail.com");
        email.add("gjkkjj@yahoo.com");
        //Password
        ArrayList<String> password = new ArrayList<>();
        password.add("bbbbbbb");
        password.add("aaaaaaa");
        //Name
        ArrayList<String> name = new ArrayList<>();
        name.add("Hussain");
        name.add("Aker");
        //Birth Month
        ArrayList<String> birthMonth = new ArrayList<>();
        birthMonth.add("March");
        birthMonth.add("May");
        //Birth Day
        ArrayList<String> birthDay = new ArrayList<>();
        birthDay.add("'17'");
        birthDay.add("01");
        //Birth Year
        ArrayList<String> birthyear = new ArrayList<>();
        birthyear.add("1988");
        birthyear.add("2000");
        //Gender
        ArrayList<String> gender = new ArrayList<>();
        gender.add("Male");
        gender.add("Female");
        //ForLoop
        for (int i = 0; i < email.size(); i++) {
            //navigate to hulu
            driver.navigate().to("https://www.hulu.com");
            driver.manage().window().fullscreen();

            //by using if else to compare expected with actual title
            String actualTitle = driver.getTitle();
            if (actualTitle.equals("Stream TV and Movies Live and Online | Hulu")) {
                System.out.println("Title matches " + actualTitle);
            } else {
                System.out.println("Title doesn't match. Actual title is " + actualTitle);
            }

            //scroll method
            Reusable_Actions.scrollmethod(driver, "0", "3600", "scroll");

            //Select Button
            Reusable_Actions.clickMethod(driver, "//*[@aria-label='Get Hulu plan']", "selectbutton");
            //Email Address
            Reusable_Actions.sendKeysMethod(driver, "//*[@id='email']", email.get(i), "Email address");
            //Input Password
            Reusable_Actions.sendKeysMethod(driver, "//*[@id='password']", password.get(i), "password");
            //Input Name
            Reusable_Actions.sendKeysMethod(driver, "//*[@id='firstName']", name.get(i), "Name");
            //Input Month
            Reusable_Actions.clickMethod(driver, "//*[@aria-live='polite']", "Month");
            //Select Month
            Reusable_Actions.selectMethod(driver, "//*[@id = 'birthdayMonth-menu']", birthMonth.get(i), "Month");
            //Input/Select Birthday
            Reusable_Actions.clickMethod(driver, "//*[@class= 'selector-selected input__text placeholder']", "Birthday");
            Reusable_Actions.selectMethod(driver, "//*[@id= 'birthdayDay-menu']", birthDay.get(i), "Birthday");

            //Input Birth Year
            Reusable_Actions.clickMethod(driver, "//*[@class= 'selector-selected input__text placeholder']", "Birthyear");
            Reusable_Actions.selectMethod(driver, "//*[@id = 'birthdayYear-menu']", birthyear.get(i), "Birthyear");

            //Select Gender
            Reusable_Actions.clickMethod(driver, "//*[@class= 'selector-selected input__text placeholder']", "Gender");
            Reusable_Actions.selectMethod(driver, "//*[@id ='gender-menu']", gender.get(i), "Gender");

            //Click Continue
            Reusable_Actions.clickMethod(driver, "//*[@class='button button--continue ']", "Continue");

            //capture text $6.99
            String result = Reusable_Actions.getTextMethod(driver, "//*[@class= 'ledger__pricing']", "$6.99");
            System.out.println("The amount is " + result);
        //capture text $0.00
            String results = Reusable_Actions.getTextMethod(driver, "//*[@class= 'summary__price']", "$0.00");
            System.out.println("The amount is " + results);

            //delete cookies
            driver.manage().deleteAllCookies();
        } //end of ForLoop
    }//end of test1

    @Test(priority = 2)
    public void Login() {
        driver.navigate().to("https://www.hulu.com");
        driver.manage().window().fullscreen();
        Reusable_Actions.clickMethod(driver, "//*[text()='Log In']", "click Login");
        Reusable_Actions.sendKeysMethod(driver, "//*[@id='email_id']", "mike234324@yahoo.com", "Enter Email");
        Reusable_Actions.sendKeysMethod(driver, "//*[@id='password_id']", "2343", "Enter Password");
        Reusable_Actions.clickMethod(driver, "//*[@class='jsx-4282396490 button-dark login-button']", "clicking on login button");
        String username = Reusable_Actions.getTextMethod(driver, "//*[text()='Mike']", "Enter Name");
        System.out.println("The username is " + username);
    } //end of test 2

/*
    @AfterSuite
    public void endSession() {driver.quit();



    }


 */
}