package pageObjects.CreditCalculationMobile;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class CalculatorPage {

    private AppiumDriver mobileDriver;

    public CalculatorPage (AppiumDriver mobileDriver){
        this.mobileDriver = mobileDriver;
        PageFactory.initElements(new AppiumFieldDecorator(mobileDriver),this);
    }

    @AndroidFindBy(id = "editLoanFormAmt")
    public AndroidElement txt_amount;

    @AndroidFindBy(id = "editLoanFormDuration")
    public AndroidElement txt_duration;

    @AndroidFindBy(id = "editLoanFormIntRate")
    public AndroidElement txt_rate;

    @AndroidFindBy(id = "tvLoanFormDateVal")
    public AndroidElement btn_date;

    @AndroidFindBy(id = "button1")
    public AndroidElement btn_validDate;

    @AndroidFindBy(id = "btnCalculateLoan")
    public AndroidElement btn_calculate;

}
