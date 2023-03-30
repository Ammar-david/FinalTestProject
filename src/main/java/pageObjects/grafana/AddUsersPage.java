package pageObjects.grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddUsersPage {

    @FindBy(how = How.CSS, using = "input[id='name-input']")
    public WebElement txt_name;

    @FindBy(how = How.CSS, using = "input[id='email-input']")
    public WebElement txt_email;

    @FindBy(how = How.CSS, using = "input[id='username-input']")
    public WebElement txt_username;

    @FindBy(how = How.CSS, using = "input[id='password-input']")
    public WebElement txt_password;

    @FindBy(how = How.CSS, using = "button[class='css-17mrqt-button']")
    public WebElement btn_create;

}
