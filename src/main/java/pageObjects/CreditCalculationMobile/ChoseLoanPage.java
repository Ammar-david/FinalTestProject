package pageObjects.CreditCalculationMobile;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class ChoseLoanPage {
    private AppiumDriver mobileDriver;

    public ChoseLoanPage (AppiumDriver mobileDriver){
        this.mobileDriver = mobileDriver;
        PageFactory.initElements(new AppiumFieldDecorator(mobileDriver),this);


    }

    @AndroidFindBy(id = "tuketici_img_button")
    public AndroidElement btn_personalLoan;



}
