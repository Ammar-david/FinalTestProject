package pageObjects.calculator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MainPage {
    @FindBy(how = How.CLASS_NAME, using = "One")
    public WebElement btn_one;

    @FindBy(how = How.CLASS_NAME, using = "Five")
    public WebElement btn_five;

    @FindBy(how = How.CLASS_NAME, using = "Plus")
    public WebElement btn_plus;

    @FindBy(how = How.CLASS_NAME, using = "Minus")
    public WebElement btn_minus;

    @FindBy(how = How.CLASS_NAME, using = "Equals")
    public WebElement btn_equals;

    @FindBy(how = How.CLASS_NAME, using = "Clear")
    public WebElement btn_clear;
    @FindBy(how = How.CLASS_NAME, using = "Eight")
    public WebElement btn_eight;

    @FindBy(how = How.CLASS_NAME, using = "Six")
    public WebElement btn_six;

    @FindBy(how = How.XPATH, using = "//*[@AutomationId='CalculatorResults']")
    public WebElement field_result;
}
