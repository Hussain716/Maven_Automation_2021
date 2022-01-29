package Express_Page_Object;


import Reusable_Library.Reusable_Annotations;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class BaseClass2 extends Reusable_Annotations {
    @Test
    public void Express_POMs() throws BiffException, IOException {
        Workbook readableFile = Workbook.getWorkbook(new File("src/main/resources/GoogleSearch.xls"));
        Sheet readableSheet = readableFile.getSheet(1);
        int rowCount = readableSheet.getRows();
        System.out.println("My row count is " + rowCount);
        WritableWorkbook writableFile = Workbook.createWorkbook(new File("src/main/resources/GoogleSearch_Results.xls"), readableFile);
        WritableSheet writableSheet = writableFile.getSheet(1);
        int rowCount2 = writableSheet.getRows();
        System.out.println("My writable row count is " + rowCount2);
        int i = 1;
        while (i < rowCount2) {
            String size = writableSheet.getCell(0, i).getContents();
            System.out.println("My values are " + size);
            String quantity = writableSheet.getCell(1, i).getContents();
            System.out.println("My values are " + quantity);
            String firstName = writableSheet.getCell(2, i).getContents();
            System.out.println("My values are " + firstName);
            String lastName = writableSheet.getCell(3, i).getContents();
            System.out.println("My values are " + lastName);
            String email = writableSheet.getCell(4, i).getContents();
            System.out.println("My values are " + email);
            String phoneNumber = writableSheet.getCell(5, i).getContents();
            System.out.println("My values are " + phoneNumber);
            String address = writableSheet.getCell(6, i).getContents();
            System.out.println("My values are " + address);
            String zipcode = writableSheet.getCell(7, i).getContents();
            System.out.println("My values are " + zipcode);
            String city = writableSheet.getCell(8, i).getContents();
            System.out.println("My values are " + city);
            String state = writableSheet.getCell(9, i).getContents();
            System.out.println("My values are " + state);
            String cardNumber = writableSheet.getCell(10, i).getContents();
            System.out.println("My values are " + cardNumber);
            String ExpMo = writableSheet.getCell(11, i).getContents();
            System.out.println("My values are " + ExpMo);
            String ExpYear = writableSheet.getCell(12, i).getContents();
            System.out.println("My values are " + ExpYear);
            String SecCode = writableSheet.getCell(13, i).getContents();
            System.out.println("My values are " + SecCode);
            String ErrorCode = writableSheet.getCell(14, i).getContents();
            System.out.println("My values are " + ErrorCode);
            driver.navigate().to("https://www.express.com");
            driver.manage().window().fullscreen();
            String actualTitle = driver.getTitle();
            if (actualTitle.equals("Express - Men's & Women's Clothing ")) {
                System.out.println("Title matches " + actualTitle);
            } else {
                System.out.println("Title doesn't match. Actual title is " + actualTitle);
            }/*
            BaseClass2.home().setHoverwomentab();
            BaseClass.homepage().setWomens();
            BaseClass.dresses().SecondDress();
            BaseClass.dresses().ClosePopup();
            BaseClass.sizes().Size();
            BaseClass.sizes().AddtoBag();
            BaseClass.sizes().View();
            BaseClass.quantities().Quantity();
            BaseClass.quantities().Checkout();
            BaseClass.quantities().CheckoutasGuest();
            BaseClass.infos().firstName("Ariful");
            BaseClass.infos().lastName("Islam");
            BaseClass.infos().email("ariful.islam42@gmail.com");
            BaseClass.infos().confirmEmail("ariful.islam42@gmail.com");
            BaseClass.infos().phoneNumber("3477437937");
            BaseClass.infos().Continue();
            BaseClass.infos().Continue1();
            BaseClass.infos().Address("7911 41st Ave");
            BaseClass.infos().zipcode("11373");
            BaseClass.infos().city("Elmhurst");
            BaseClass.infos().state("NY");
            BaseClass.infos().Continue3();
            BaseClass.infos().Continue4();
            BaseClass.infos().cardNumber("5555555555554440");
            BaseClass.infos().expMonth("12");
            BaseClass.infos().expYear("28");
            BaseClass.infos().cvv("618");
            BaseClass.infos().PlaceOrder();
            BaseClass.infos().Capture("Capture");
            BaseClass.infos().Error("Error");
        }
    }
}


*/
        }
    }
}