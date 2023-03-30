package workflows;

import extentions.UIActions;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import utilities.CommonOps;

public class ElectronFlows extends CommonOps {

    @Step ("Add New Task to the List")
    public static void addNewTask(String taskname){
        UIActions.updateText(todoMain.txt_create, taskname);
        UIActions.insertKey(todoMain.txt_create, Keys.RETURN);
    }

    @Step ("Get and Return number of Tasks")
    public static int getNumberofTask(){
       return todoMain.list_tasks.size();
    }

    @Step ("Empty List from Tasks")
    public static void emptyList() {
        for (int i = 0; i < getNumberofTask(); i++) {
            UIActions.mouseHover_click02(todoMain.btn_delete);
        }
    }
}
