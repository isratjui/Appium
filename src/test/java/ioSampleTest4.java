import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.touch.offset.PointOption.point;
//import static java.time.Duration.ofSeconds;

public class ioSampleTest4 {

    public AppiumDriver<MobileElement> driver;
    public WebDriverWait wait;
    //    WebDriver augmentedDriver = new Augmenter().augment(((WrapsDriver)driver).getWrappedDriver());
//((Rotatable)augmentedDriver).rotate(ScreenOrientation.LANDSCAPE);
    //Elements
    String secondNewJob = "//android.widget.FrameLayout[2]/android.widget.LinearLayout/" +
            "android.widget.RelativeLayout/android.widget.ImageView";

    FileInputStream fstream = new FileInputStream("C:\\Users\\Ishrat Zahan Jui\\Downloads\\address.txt");
    BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

    public ioSampleTest4() throws FileNotFoundException {
    }


    @BeforeMethod
    public void setup () throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Symphony P9 API 25");
        caps.setCapability("udid", "P9170614004302"); //DeviceId from "adb devices" command 192.168.22.101:5555
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "7.0");

        // caps.setCapability("deviceName", "OPPO F5 API 25");
        // caps.setCapability("udid", "G6R4ZSGAJJ9S4L8D"); //DeviceId from "adb devices" command 192.168.22.101:5555
        //caps.setCapability("platformName", "Android");
        //caps.setCapability("platformVersion", "7.1.1");

//        caps.setCapability("skipUnlock","true");
        caps.setCapability("appPackage", "com.obhai");
        caps.setCapability("appActivity","com.obhai.SplashNewActivity");
//        caps.setCapability("noReset","false");
//        driver = new AndroidDriver<MobileElement>(new URL("htt p://127.0.0.1:4723/wd/hub"),caps);
        driver = new AndroidDriver<MobileElement>(
                new URL("http://0.0.0.0:4725/wd/hub"),
                caps);
//        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),caps);
        wait = new WebDriverWait(driver, 600);
        caps.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS,true);
    }

    @Test
    public void basicTest () throws InterruptedException, IOException {
        //Click and pass Splash
//        wait.until(ExpectedConditions.visibilityOfElementLocated
//                (By.id("com.isinolsun.app:id/animation_view"))).click();

        //Click and pass Tutorial
//        wait.until(ExpectedConditions.visibilityOfElementLocated
//                (By.id("com.isinolsun.app:id/btn_skip"))).click();

        //Click to "Is Ariyorum" Button
//        wait.until(ExpectedConditions.visibilityOfElementLocated
//                (By.id("com.isinolsun.app:id/bluecollar_type_button"))).click();


//        //Notification Allow
        if (driver.findElements(By.id("com.android.packageinstaller:id/permission_allow_button")).size()>0) {
            driver.findElements(By.id("com.android.packageinstaller:id/permission_allow_button")).get(0).click();
        }


        WebDriverWait wait = new WebDriverWait(driver,600);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.Button[1]")));

        driver.findElements(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.Button[1]")).get(0).click();

        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[2]")));


        if (driver.findElements(By.id("com.android.packageinstaller:id/permission_allow_button")).size()>0) {
            driver.findElements(By.id("com.android.packageinstaller:id/permission_allow_button")).get(0).click();
        }
        if (driver.findElements(By.id("com.android.packageinstaller:id/permission_allow_button")).size()>0) {
            driver.findElements(By.id("com.android.packageinstaller:id/permission_allow_button")).get(0).click();
        }

        driver.findElements(By.id("com.obhai:id/emailEt")).get(0).sendKeys("01685794967");
        driver.findElements(By.id("com.obhai:id/passwordEt")).get(0).sendKeys("123456");
        driver.findElements(By.id("com.obhai:id/signInBtn")).get(0).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.ImageView")));

        TimeUnit.SECONDS.sleep(3);
        new TouchAction(driver).tap(point(216, 202)).perform();
        TimeUnit.SECONDS.sleep(3);


        String strLine;

        while ((strLine = br.readLine()) != null) {
            // Print the content on the console
            System.out.println(strLine);

            driver.findElements(By.id("com.obhai:id/etLocationDest")).get(0).sendKeys(strLine);
            //driver.findElements(By.id("android:id/navigationBarBackground")).get(0).click();
            driver.navigate().back();
           // driver.pressKey(new KeyEvent(AndroidKey.BACK));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[1]")));
            TimeUnit.SECONDS.sleep(5);

            new TouchAction(driver).tap(point(644, 305)).perform();

            //moto screen

        }

    }





    @AfterMethod
    public void teardown(){
        driver.quit();
    }

}