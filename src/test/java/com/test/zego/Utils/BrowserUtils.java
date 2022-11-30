package com.test.zego.Utils;


import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Set;

public class BrowserUtils {


    public static void selectBy(WebElement location, String value, String methodName) {
        Select select = new Select(location);
        switch (methodName) {
            case "text":
                select.selectByVisibleText(value);
                break;
            case "value":
                select.selectByValue(value);
                break;
            case "index":
                select.selectByIndex(Integer.parseInt(value));
                break;
            default:
                System.out.println("Method name is not available, Use text, value or index");

        }
    }
     public static String getText(WebElement element){
      return element.getText().trim();

     }

    public static void scrollWithJS(WebDriver driver, WebElement button4) {
    }

    public static void switchByTitle(WebDriver driver, String title) {
        Set<String> allPagesIds = driver.getWindowHandles();
        for (String id : allPagesIds) {
            driver.switchTo().window(id);
            if (driver.getTitle().contains(title)) {
                break;
            }
        }
    }

    public static void getScreenShot(WebDriver driver, String packageName) {
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String location = System.getProperty("/src/java/screenshot" + packageName);


    }

    public static void getScreenShotCucumber(Scenario scenario, WebDriver driver){
        Date currentDate= new Date();
        String screenShotFileName = currentDate.toString().replace(" ","-")
                .replace(":","-");
        if(scenario.isFailed()){
            File screenShotFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            try {
                FileUtils.copyFile(screenShotFile, new File("src/test/java/screenshot/"+screenShotFileName+".png"));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

}



