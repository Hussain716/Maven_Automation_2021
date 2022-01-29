package Express_Page_Object;

import Reusable_Library.Reusable_Actions_Loggers;
import Reusable_Library.Reusable_Actions_Loggers_POM;
import Reusable_Library.Reusable_Annotations;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Home extends Reusable_Annotations {

    ExtentTest logger;
    public Home(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger = Reusable_Annotations.logger;
    }//end of the constructor method

    //define all the WebElement we need for this page per use case
    @FindBy(xpath = "//*[contains(@href,'womens-clothing?W_HEADER_WOMENSCLOTHING')]")
    List<WebElement> Hover;
    @FindBy(xpath = "//*[text()='Dresses']")
    WebElement Click;

    /*public void ClickMethod(){
        Reusable_Actions_Loggers.mouseHover(driver,Hover,logger,"Hover");
        Reusable_Actions_Loggers_POM.clickMethod(driver,Click,logger,"Click");
    }//end of clicking on ship tab

*/

}

