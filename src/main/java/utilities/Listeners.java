package utilities;

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;

public class Listeners extends CommonOps implements ITestListener {
    public void onStart(ITestContext execution){
        System.out.println("-------------- Starting Test ---------------");
    }

    public void onFinish(ITestContext execution){
        System.out.println("------------- Ending Test ----------------");
    }

    public void onTestStart(ITestResult test){
        System.out.println("-------------- Starting Test :" + test.getName() + "started ------------");
    }

    public void onTestSuccess(ITestResult test){
        System.out.println("-------------- Test " + test.getName() + "passed --------------");
//        Stop Recording
        if (!platform.equalsIgnoreCase("API")){
            try {
                MonteScreenRecorder.stopRecord();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
//        Delete recorded File
            File file = new File("./test-recordings/"+test.getName()+".avi");
            if(file.delete())
                System.out.println("File deleted successfuly");
            else System.out.println("failed to delete file");
        }
    }

    public void onTestFailure(ITestResult test){
        System.out.println("-------------- Test " + test.getName() + "failed --------------");
        //        Stop Recording
        if (!platform.equalsIgnoreCase("API")){
            try {
                MonteScreenRecorder.stopRecord();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            saveScreenshot();
        }

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult test) {
        // TODO Auto-generated method stub
    }

    public void onTestSkipped(ITestResult test){
        System.out.println("---------------- Skipping Test :" + test.getName() + " ---------------");
    }
    @Attachment(value = "Page screenshot", type = "image/png) ")
        public byte [] saveScreenshot(){
        if(!platform.equalsIgnoreCase("mobile"))
            return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        else
            return ((TakesScreenshot)mobileDriver).getScreenshotAs(OutputType.BYTES);
    }
}
