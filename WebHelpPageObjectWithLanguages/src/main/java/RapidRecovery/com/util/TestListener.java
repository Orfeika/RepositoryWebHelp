package RapidRecovery.com.util;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;


public class TestListener implements ITestListener {


    WebDriver driver;


    String filePath = "E:/";//src/ErrorsScreenshots/
    @Override
    public void onTestFailure(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            System.out.println("***** Error " + result.getName() + " test has failed *****");
            String methodName = result.getName().toString().trim();
            takeScreenShot(methodName);
        }
    }

    public void takeScreenShot(String methodName) {
        //get the driver
        driver= DriverManager.getInstance().getDriver();
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        //The below method will save the screen shot in d drive with test method name
        try {
            FileUtils.copyFile(scrFile, new File(filePath+methodName+".png"));
            System.out.println("***Placed screenshot in "+filePath+" ***");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void onFinish(ITestContext context) {}

    public void onTestStart(ITestResult result) {   }

    public void onTestSuccess(ITestResult result) {   }

    public void onTestSkipped(ITestResult result) {   }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {   }

    public void onStart(ITestContext context) {   }
}