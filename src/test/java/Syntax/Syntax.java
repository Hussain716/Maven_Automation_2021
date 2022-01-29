package Syntax;

public class Syntax {


/*
    Setting Up Web Driver Environment:
            System.setProperty  ("webdriver.chrome.driver","src\\Resources\\chromedriver.exe");
    ChromeOptions options = new ChromeOptions();
options.addArguments("start-maximized","incognito","disable-inforbars");
    WebDriver driver = new ChromeDriver(options);
driver.get().to("h ttps://www.ABM.com");

    Creating simple String:
    String message = “All the syntax are listed here”:

    Creating variables for numbers and some math:
    Int X = 1000;
    Int Y = 500;
System.out.println("The total is " + (V+X));

    Capturing Title of Page:
    String actualTitle = driver.getTitle();

    Capturing Text from a Page:
    String message = driver.findElement(By.xpath(“//*[@class=’donkey’]”).getText();

            Splitting the text from a String:
    String[] resultArrays = message.split(" ");
System.out.println("My search number is " + resultArray[2]);

    User Input:
            driver.findElement(By.xpath(“locator”).sendKeys(“What’s Up Google?”);

    Customized User Input:
    To clear the search field, locate the element first:
    WebElement textField = driver.findElements(By.xpath(“fun-stuff”)).get(0);
textField.clear();
textField.sendKeys(“Fuck-off”);

    Drop Down Method (Drop down by visible text, value, index):
    WebElement element = driver.findElement(By.xpath(“location”));
    Select dDown = new Select(element);
dDown.selectByVisibleText(userValue);

    Mouse Hover Method:
    Actions mouseMove = new Actions(driver);
    WebElement element = driver.findElement(By.xpath(“location”));
mouseMove.moveToElement(element).perform();
(to click after mouse hover):
            mouseMove.moveToElement(element).perform().click();

    Click method:
    WebElement element = driver.findElement(By.xpath(“button-location”));
element.click();

    Switching Tabs:
    ArrayList<String> tabs = new ArrayList<> (driver.getWindowHandles());
//switch to second tab
driver.switchTo().window(tabs.get(1));
driver.switchTo().window(tabs.get(0)).quit();

    Listing All Tabs:
    List<WebElement>tabsCount=driver.findElements(By.xpath(“//*[@id=’mega-bottombar’]”));
            System.out.println(“tab count is “ + tabsCount.size());


    Xpath (and):
            driver.findElement(By.xpath("//*[@title='john_cena' and @name='abm']")).sendKeys("gay");

    Xpath (contains):
            driver.findElements(By.xpath(“//*[contains@property= ‘you-stupid-don’]”));

    Xpath (text):
            driver.findElements(By.xpath(“//*[contains(text(), ‘likeasumboody’)]”));

    Implicit Wait:
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    Explicit Wait:
    WebDriverWait eXwait = new WebDriverWait(driver,10);
eXwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator))).get(indexNumber).click();

    Hard Coded Wait:
            Thread.sleep(2000);

    Linear Arrays:
    String[] zipcodes = new String[] {“11218”, “11219”, “11220”};

int[] zipcodes = new int[] {11218,11219,11220};
        System.out.println(“I live in ” + zipcodes[1]);

        Dynamic Arrays:
        String[] zipcodes;
        zipcodes = new String[2];
        zipcodes[0] = "11218";
        zipcodes[1] = "11219";
        zipcodes[2] = "11220";

        int[] zipcodes;
        zipcodes = new int[2];
        zipcodes[0] = "11218";
        zipcodes[1] = "11219";
        zipcodes[2] = "11220";
        System.out.println(“I live in zipcode ” + zipcodes[1]);


        While Loop:
        int i = 0;
        while (i < zipcodes.length) {
        repetitive arguments, methods, test cases, etc.
        i = i + 1; //same as i++
        }

        For Loop:
        for (int i = 1; i < zipcodes.length; i++) {
        repetitive arguments, methods, test cases, etc.
        }

        Alerts (Pop-ups within current page):
        Alert verification = driver.switchTo().alert();
        verification.accept(); or verification.dismiss();

        Delete All Cookies:
        driver.manage().deleteAllCookies();

        Scroll:
        JavascriptExecutor JscrollE = (JavascriptExecutor)driver;
        JscrollE.executeScript(0,3000);

        Overwriting Writable Workbook:
        Label ErrorLabel = new Label(17,i,ErrorMessage);
        writeSheet.addCell(cardLabel);
        }
        writeFile.write();


        FindBy method:
@FindBy(xpath = "//*[@property='element']")
public static WebElement locatorNickname:

        Super Constructors:
public Avatar_Class(WebDriver driver) {
        super();
        PageFactory.initElements(driver, this);
        }

public static First_Element  Water_Class() {
        First_Element  Water_Class = new First_Element(driver);
        return Water_Class;
        }

public static Second_Element Earth_Class() {
        Second_Element Earth_Class = new Second_Element(driver);
        return Earth_Class;
        }

public static Thrid_Element Fire_Class() {
        Third_Element Fire_Class = new Third Element(driver);
        return Fire_Class;
        }

public static Fourth_Element Air_Class() {
        Fourth_Element Air_Class = new Fourth_Element(driver);
        return Air_Class;
        }

        Verification Message Captcha iFrame:
        driver.switchTo().frame("recaptcha-iframe");
        (different from alerts, windows and tabs)

        Conditional Statements (if, else if, else):
        if (argument1) {
        System.out.println(“ “);
        } else if (argument2) {
        System.out.println(“ “);
        else (argument3) {
        System.out.println(“ “);
        }

        Exception Handling Statements (try/catch):
        try {
        the step or method you’re trying
        } catch (Exception err) {
        System.out.println("catching the error " + err);

        Assertion Statements (Soft/Hard Assert):
        Soft Assert:
        SoftAssert saException  = new SoftAssert();
        saException.assertEquals(“Google”,driver.getTitle());
        saException.assertAll();

        Hard Assert:
        assert.assertEquals(“Google”,driver.getTitle());

        Boolean Asserts:
        assert.assertFalse(condition, message)//this is only if we want the condition to be false
        assert.assertTrue(condition, message)//this is only if we want the condition to be true

        True/False Statements (Boolean True/False):
        boolean elementState = driver.findElement(“By.xpath(//*[“@type=’checkbox’”])).isSelected();
        System.out.println(“is element selected? “ + elementState);







*/
}//end of java

