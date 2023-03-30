package sanity;

import extentions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflows.WebFlows;

@Listeners(utilities.Listeners.class)
public class GrafanaWebDB extends CommonOps {

    @Test(description = "test01 - Login with DB Credentials")
    @Description("This test login with DB Credentials and verifes the main header")
    public void test01_loginAndverifyHeader(){
        WebFlows.loginDB();
        Verifications.verifyTextInElement(grafanaMain.head_Welcome, "Welcome to Grafana");
    }

}
