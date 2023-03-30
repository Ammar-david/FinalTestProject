package sanity;


import extentions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utilities.CommonOps;
import workflows.MobileFlows;


@Listeners(utilities.Listeners.class)
public class SefariaTest extends CommonOps {

    @Test (description = "test01 - Verify Search Result")
    @Description("This test verifes if the shabbat's book is displayed")
    public void test01_chooseBook(){
        MobileFlows.search_txt();
        Verifications.verifyTextInElement(SefariaContentPage01.txt_result, "Shabbat");
    }
}
