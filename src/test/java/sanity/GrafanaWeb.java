package sanity;

import extentions.UIActions;
import extentions.Verifications;
import io.qameta.allure.Description;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pageObjects.grafana.EditUsersPage;
import utilities.CommonOps;
import workflows.WebFlows;

import java.util.List;

@Listeners(utilities.Listeners.class)
public class GrafanaWeb  extends CommonOps {

    @Test(description = "test01 - Verify Header")
    @Description("This test login and verifes the main header")
    public void test01_verifyHeader(){
        WebFlows.login("admin", "admin");
        Verifications.verifyTextInElement(grafanaMain.head_Welcome, "Welcome to Grafana");
    }
    @Test(description = "test02 - Verify Users")
    @Description("This test verifies the users list")
    public void test02_verifyUsers(){
        UIActions.mouseHover_click02(grafanaLeftMenu.btn_server, grafanaServerAdmin.link_users);
        Verifications.numberOfElements(grafanaServerAdminMain.rows,3);
    }
    @Test(description = "test03 - Verify New Users")
    @Description("This test verifies the creation of new user")
    public void test03_verifyNewUsers(){
        UIActions.mouseHover_click02(grafanaLeftMenu.btn_server, grafanaServerAdmin.link_users);
        WebFlows.add_user("david", "david.ammar5751@gmail.com", "dav,", "ammar");
        Verifications.numberOfElements(grafanaServerAdminMain.rows,4);
    }
    @Test(description = "test04 - Verify Delete Users")
    @Description("This test verifies the delete of user")
    public void test04_verifyDeleteUsers(){
        UIActions.mouseHover_click02(grafanaLeftMenu.btn_server, grafanaServerAdmin.link_users);
        WebFlows.delete_LastUser();
        Verifications.numberOfElements(grafanaServerAdminMain.rows,3);
    }
    @Test(description = "test05 - Verify Head Menu")
    @Description("This test verifies the head menu")
    public void test05_verifyHeadMenu(){
        Verifications.visibilityofElements(grafanaMain.list_headMenu);

    }
    @Test(description = "test06 - Verify Avatar Icon")
    @Description("This test verifies the avatar image (using sikuli tool")
    public void test06_verifyAvatarIcon(){
       Verifications.visualElement("GrafanaAvatar");
    }

    @Test(description = "test07 - Search Users", dataProvider = "data-provider-user", dataProviderClass = utilities.ManageDTT.class)
    @Description("This test searches users Using DTT")
    public void test07_searchUsers(String user, String shouldExists) {
        UIActions.mouseHover_click02(grafanaLeftMenu.btn_server, grafanaServerAdmin.link_users);
        WebFlows.searchAndVerifyUser(user, shouldExists);
   }
}
