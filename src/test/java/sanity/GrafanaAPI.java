package sanity;

import extentions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflows.APIFlows;

@Listeners(utilities.Listeners.class)
public class GrafanaAPI extends CommonOps {

    @Test(description = "Test 01 : Verify Teams Property")
    @Description("This Test Verify Team Property")
    public void test01_verifyTeam(){
        Verifications.verifyText(APIFlows.getTeamProperty("teams[1].name"), "MyTeam13");
    }

    @Test(description = "Test 02 : Add and Verify Team")
    @Description("This Test Add Team to Grafana And Verify")
    public void test02_addTeamAndVerify(){
//        APIFlows.postTeam("DavidTeam", "david@gmail.com");
        Verifications.verifyText(APIFlows.getTeamProperty("teams[0].name"), "DavidTeam");
    }
    @Test(description = "Test 03 : Update and Verify Team")
    @Description("This Test Update Team in Grafana And Verify")
    public void test03_updateTeamAndVerify(){
        String id = APIFlows.getTeamProperty("teams[0].id");
        APIFlows.updateTeam("DavidTeam", "david@ammare.com", id);
        Verifications.verifyText(APIFlows.getTeamProperty("teams[0].email"), "david@ammare.com");
    }
    @Test(description = "Test 04 : Delete and Verify Team")
    @Description("This Test Delete Team from Grafana And Verify")
    public void test04_deleteTeamAndVerify(){
        String id = APIFlows.getTeamProperty("teams[0].id");
        APIFlows.deleteTeam(id);
        Verifications.verifyText(APIFlows.getTeamProperty("totalCount"), "4");
    }
}
