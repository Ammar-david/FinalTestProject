package sanity;

import extentions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflows.ElectronFlows;

@Listeners(utilities.Listeners.class)
public class TodoElectron extends CommonOps {
    @Test(description = "test01 - Add and Verify New Task")
    @Description("This test Add and Verify New Task")
    public void test01_verifyTask(){
        ElectronFlows.addNewTask("Learn QA");
        Verifications.verifyNumber(ElectronFlows.getNumberofTask(),1);
    }
    @Test(description = "test01 - Add and Verify New Tasks")
    @Description("This test Add and Verify New Tasks")
    public void test02_verifyTasks(){
        ElectronFlows.addNewTask("Learn QA");
        ElectronFlows.addNewTask("Learn AUTOMATION");
        Verifications.verifyNumber(ElectronFlows.getNumberofTask(),2);
    }
}
