package sanity;

import extentions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflows.DesktopFlows;

@Listeners(utilities.Listeners.class)
public class CalculatorTest extends CommonOps {

    @Test(description = "test01 - Calculate and Verify Addtion")
    @Description("This test Calculate and Verify Addition 1 + 8")
    public void test01_verifyCalc01(){
        DesktopFlows.CalculateAddition01();
        Verifications.verifyTextInElement(calcMain.field_result, "Display is 9");
    }
}
