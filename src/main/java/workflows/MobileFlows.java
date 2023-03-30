package workflows;

import extentions.MobileActions;

import io.qameta.allure.Step;

import utilities.CommonOps;



public class MobileFlows extends CommonOps {

    @Step("Business Flow : Search Shabbat's Book")
    public static void search_txt(){
        MobileActions.click(SefariaMainPage.btn_menu);
        MobileActions.updateText(SefariaSearchPage.txt_search, "Shabbat");
        MobileActions.tap(SefariaSearchPage.txt_search);
        MobileActions.click(SefariaSearchPage.btn_expectedSearch);

    }
}
