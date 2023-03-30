package utilities;

import org.openqa.selenium.support.PageFactory;
import pageObjects.Sefaria.SearchPage;
import pageObjects.grafana.AddUsersPage;
import pageObjects.grafana.EditUsersPage;
import pageObjects.grafana.ServerAdminMainPage;
import pageObjects.grafana.ServerAdminMenuPage;

public class ManagePages extends Base {

    public static void initGrafana(){
        grafanaLogin = PageFactory.initElements(driver, pageObjects.grafana.LoginPage.class);
        grafanaMain = PageFactory.initElements(driver, pageObjects.grafana.MainPage.class);
        grafanaLeftMenu = PageFactory.initElements(driver, pageObjects.grafana.LeftMenu.class);
        grafanaServerAdmin = PageFactory.initElements(driver, ServerAdminMenuPage.class);
        grafanaServerAdminMain = PageFactory.initElements(driver, ServerAdminMainPage.class);
        grafanaAddUser = PageFactory.initElements(driver, AddUsersPage.class);
        grafanaEditUser = PageFactory.initElements(driver, EditUsersPage.class);
    }
    public static void initCCM(){
        CCMChoseLoanPage = new pageObjects.CreditCalculationMobile.ChoseLoanPage(mobileDriver);
        CCMCalculatorPage = new pageObjects.CreditCalculationMobile.CalculatorPage(mobileDriver);
    }
    public static void initSefaria() {
        SefariaMainPage = new pageObjects.Sefaria.MainPage(mobileDriver);
        SefariaSearchPage = new pageObjects.Sefaria.SearchPage(mobileDriver);
        SefariaContentPage01 = new pageObjects.Sefaria.ContentsPage01(mobileDriver);
    }

    public static void  initTodo(){
        todoMain = PageFactory.initElements(driver, pageObjects.todo.MainPage.class);
    }
    public static void  initCalc(){
        calcMain = PageFactory.initElements(driver, pageObjects.calculator.MainPage.class);
    }
}
