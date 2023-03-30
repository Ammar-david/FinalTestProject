package extentions;

import com.google.common.util.concurrent.Uninterruptibles;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import utilities.CommonOps;

import java.security.Key;
import java.util.concurrent.TimeUnit;

public class UIActions extends CommonOps {

    @Step ("click on element")
    public static void click (WebElement elem){
        wait.until(ExpectedConditions.elementToBeClickable(elem));
        elem.click();

    }
    @Step("update text")
    public static void updateText (WebElement elem, String text){
        wait.until(ExpectedConditions.visibilityOf(elem));
        elem.sendKeys(text);

    }
    @Step("update text as Human")
    public static void updateTextHuman (WebElement elem, String text){
        wait.until(ExpectedConditions.visibilityOf(elem));
    for (char ch : text.toCharArray()){
        Uninterruptibles.sleepUninterruptibly(500, TimeUnit.MILLISECONDS);
        elem.sendKeys(ch + "");
        }
    }
    @Step("Insert key")
    public static void insertKey (WebElement elem, Keys value){
        elem.sendKeys(value);
    }

    @Step("select dropdown element")
    public static void updateDropdown (WebElement elem, String text){
        wait.until(ExpectedConditions.visibilityOf(elem));
        Select dropdown = new Select(elem);
        dropdown.selectByVisibleText(text);

    }
    @Step("Mouse hover an element and click")
    public static void mouseHover_click02(WebElement elem01, WebElement elem02){
        action.moveToElement(elem01).moveToElement(elem02).click().build().perform();
    }

    @Step("Mouse hover an element and click")
    public static void mouseHover_click02(WebElement elem01){
        action.moveToElement(elem01).click().build().perform();
    }

}
