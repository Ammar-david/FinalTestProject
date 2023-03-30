package utilities;

import io.appium.java_client.AppiumDriver;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Screen;
import org.testng.asserts.SoftAssert;
import pageObjects.CreditCalculationMobile.*;
import pageObjects.grafana.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class Base {
//    WEB
    protected static WebDriver driver;
    protected static WebDriverWait wait;
    protected static Actions action;
    protected static SoftAssert softAssert;
    protected static Screen screen;
    protected static String platform;

//    MOBILE
    protected static  AppiumDriver mobileDriver;
    protected static DesiredCapabilities dc = new DesiredCapabilities();

    //page Objects - WEB
    protected static LoginPage grafanaLogin;
    protected static MainPage grafanaMain;
    protected static LeftMenu grafanaLeftMenu;
    protected static ServerAdminMenuPage grafanaServerAdmin;
    protected static ServerAdminMainPage grafanaServerAdminMain;
    protected static AddUsersPage grafanaAddUser;
    protected static EditUsersPage grafanaEditUser;

    //page Objects - MOBILE
    protected static ChoseLoanPage CCMChoseLoanPage;
    protected static CalculatorPage CCMCalculatorPage;

//    page Objects - MOBILE 02
    protected static pageObjects.Sefaria.MainPage SefariaMainPage;
    protected static pageObjects.Sefaria.SearchPage SefariaSearchPage;
    protected static pageObjects.Sefaria.ContentsPage01 SefariaContentPage01;

//    REST API
    protected static RequestSpecification httpRequest;
    protected static Response response;
    protected static JSONObject params = new JSONObject();
    protected static JsonPath jp;

//    DataBase
    protected static Connection con;
    protected static Statement stmt;
    protected static ResultSet rs;

//    page Objects - Electron
    protected static pageObjects.todo.MainPage todoMain;

    //Page Object - Desktop
    protected static pageObjects.calculator.MainPage calcMain;
}
