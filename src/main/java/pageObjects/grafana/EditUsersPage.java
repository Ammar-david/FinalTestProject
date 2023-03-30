package pageObjects.grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EditUsersPage {
    @FindBy(how = How.CSS, using = "button[class='css-jsblcn-button']")
    public WebElement btn_delete;

    @FindBy(how = How.XPATH, using = "//button[@aria-label='Confirm Modal Danger Button']")
    public WebElement btn_confirm;
}
