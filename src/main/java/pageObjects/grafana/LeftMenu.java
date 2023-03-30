package pageObjects.grafana;

import com.google.gson.internal.bind.util.ISO8601Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;

public class LeftMenu {

    @FindBy(how = How.XPATH, using = "//li[@class='css-18dle9y'][3]")
    public WebElement btn_alerting;

    @FindBy(how = How.XPATH, using = "//li[@class='css-18dle9y'][4]")
    public WebElement btn_configuration;


    @FindBy(how = How.XPATH, using = "//li[@class='css-18dle9y'][5]")
    public WebElement btn_server;


}
