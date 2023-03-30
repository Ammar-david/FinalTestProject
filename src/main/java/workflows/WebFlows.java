package workflows;

import com.google.common.util.concurrent.Uninterruptibles;
import extentions.DBActions;
import extentions.UIActions;
import extentions.Verifications;
import io.qameta.allure.Step;
import utilities.CommonOps;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class WebFlows extends CommonOps {
    @Step("Business Flow : Login to grafana")
    public static void login(String user, String pass){
        UIActions.updateText(grafanaLogin.txt_username, user);
        UIActions.updateText(grafanaLogin.txt_password, pass);
        UIActions.click(grafanaLogin.btn_login);
        Uninterruptibles.sleepUninterruptibly(500, TimeUnit.MILLISECONDS);
        UIActions.click(grafanaLogin.btn_skip);
    }

    @Step("Business Flow : Login to grafana with DB credentials")
    public static void loginDB(){
        String query = "SELECT name, password FROM Employees WHERE id='3'";
        List<String> cred =DBActions.getCredentials(query);
        UIActions.updateText(grafanaLogin.txt_username, cred.get(0));
        UIActions.updateText(grafanaLogin.txt_password, cred.get(1));
        UIActions.click(grafanaLogin.btn_login);
        Uninterruptibles.sleepUninterruptibly(500, TimeUnit.MILLISECONDS);
        UIActions.click(grafanaLogin.btn_skip);
    }
    @Step("Business Flow : Add User")
    public static void add_user(String name, String email, String user, String pass){
        UIActions.click(grafanaServerAdminMain.btn_addUser);
        Uninterruptibles.sleepUninterruptibly(500, TimeUnit.MILLISECONDS);
        UIActions.updateText(grafanaAddUser.txt_name, name);
        UIActions.updateText(grafanaAddUser.txt_email, email);
        UIActions.updateText(grafanaAddUser.txt_username, user);
        UIActions.updateText(grafanaAddUser.txt_password, pass);
        UIActions.click(grafanaAddUser.btn_create);

    }

    @Step("Business Flow : Delete User")
    public static void delete_LastUser(){
        UIActions.click(grafanaServerAdminMain.rows.get(2));
        UIActions.click(grafanaEditUser.btn_delete);
        UIActions.click(grafanaEditUser.btn_confirm);
    }

    @Step("Business Flow : Search and Verify User")
    public static void searchAndVerifyUser(String user , String shouldExists){
        UIActions.updateTextHuman(grafanaServerAdminMain.txt_search, user);
        if (shouldExists.equalsIgnoreCase("exists"))
            Verifications.existanceofElement(grafanaServerAdminMain.rows);
        else if (shouldExists.equalsIgnoreCase("not-exist"))
            Verifications.nonExistanceofElement(grafanaServerAdminMain.rows);
        else
            throw new RuntimeException("Invalid Expected Output in Data Driven Testing, Should be exists or not-exist");

    }


}
