package pageObjects.Sefaria;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {

    private AppiumDriver mobileDriver;

    public SearchPage (AppiumDriver mobileDriver){
        this.mobileDriver = mobileDriver;
        PageFactory.initElements(new AppiumFieldDecorator(mobileDriver),this);
    }

    @AndroidFindBy(className = "android.widget.EditText")
    public AndroidElement txt_search;

    @AndroidFindBy(className = "android.widget.TextView")
    public AndroidElement btn_expectedSearch;
}
