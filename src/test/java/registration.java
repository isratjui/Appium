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

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.touch.offset.PointOption.point;
//import static java.time.Duration.ofSeconds;

public class registration {

    public AppiumDriver<MobileElement> driver;
    public WebDriverWait wait;
    //    WebDriver augmentedDriver = new Augmenter().augment(((WrapsDriver)driver).getWrappedDriver());
//((Rotatable)augmentedDriver).rotate(ScreenOrientation.LANDSCAPE);
    //Elements
    String secondNewJob = "//android.widget.FrameLayout[2]/android.widget.LinearLayout/" +
            "android.widget.RelativeLayout/android.widget.ImageView";




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
                new URL("http://0.0.0.0:4723/wd/hub"),
                caps);
//        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),caps);
        wait = new WebDriverWait(driver, 6000);
        caps.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS,true);
    }

    @Test
    public void basicTest () throws InterruptedException {
       
        if (driver.findElements(By.id("com.android.packageinstaller:id/permission_allow_button")).size() > 0) {
            driver.findElements(By.id("com.android.packageinstaller:id/permission_allow_button")).get(0).click();
        }



        WebDriverWait wait = new WebDriverWait(driver, 6000);

         //   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.Button[1]")));
//
            driver.findElements(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.Button[1]")).get(0).click();

            //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[2]")));


            if (driver.findElements(By.id("com.android.packageinstaller:id/permission_allow_button")).size() > 0) {
                driver.findElements(By.id("com.android.packageinstaller:id/permission_allow_button")).get(0).click();
            }
            if (driver.findElements(By.id("com.android.packageinstaller:id/permission_allow_button")).size() > 0) {
                driver.findElements(By.id("com.android.packageinstaller:id/permission_allow_button")).get(0).click();
            }

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.obhai:id/mobile_number"))).sendKeys("01685794967");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.obhai:id/fab"))).click();









            driver.findElements(By.id("com.obhai:id/emailEt")).get(0).sendKeys("01685794967");
            driver.findElements(By.id("com.obhai:id/passwordEt")).get(0).sendKeys("123456");
            driver.findElements(By.id("com.obhai:id/signInBtn")).get(0).click();

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.ImageView")));

            TimeUnit.SECONDS.sleep(2);
            //new TouchAction(driver).tap(point(216, 202)).perform();

            //(new TouchAction(driver)).press(34,90).moveTo({x: 171: y: 104}).release().perform();
            new TouchAction(driver).press(point(34, 90)).moveTo(point(171,104)).release().perform();
            System.out.println("menu");
            TimeUnit.SECONDS.sleep(3);
        new TouchAction(driver).tap(point(151, 353)).perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.obhai:id/textViewFutureRides"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.obhai:id/textViewRideHistory"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.obhai:id/backBtn"))).click();
        new TouchAction(driver).tap(point(132, 445)).perform();//payment method
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.Button"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.obhai:id/backBtn"))).click();


        new TouchAction(driver).tap(point(104, 947)).perform();
            System.out.println("notification");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.obhai:id/btnOk"))).click();

        new TouchAction(driver).tap(point(129, 731)).perform();//free ride
        TimeUnit.SECONDS.sleep(3);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.obhai:id/btnOk"))).click();

        new TouchAction(driver).tap(point(129, 731)).perform();//promo

    }





    @AfterMethod
    public void teardown(){
        driver.quit();
    }

}
