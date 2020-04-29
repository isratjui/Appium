import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.touch.offset.PointOption.point;
//import static java.time.Duration.ofSeconds;

public class ioSampleTest {

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
        wait = new WebDriverWait(driver, 600);
        caps.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS,true);
    }

    @Test
    public void basicTest () throws InterruptedException {
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
      //  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.Button[1]")));

        //driver.findElements(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.Button[1]")).get(0).click();

        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[2]")));




        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.obhai:id/mobile_number"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.obhai:id/numberEditText"))).sendKeys("01711409750");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.obhai:id/fab"))).click();



        //driver.findElements(By.id("com.obhai:id/emailEt")).get(0).sendKeys("01685794967");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.obhai:id/passwordEt"))).sendKeys("123456");
       // wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.obhai:id/forgotPasswordBtn"))).click();
       // wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.obhai:id/signInBtn"))).click();
       new TouchAction(driver).tap(point(647, 1101)).perform();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.obhai:id/moto_button"))).click();


        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.ImageView")));

       // TimeUnit.SECONDS.sleep(3);
        //new TouchAction(driver).tap(point(216, 202)).perform();
        //TimeUnit.SECONDS.sleep(3);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.obhai:id/etLocationDest"))).sendKeys("Mirpur");
        TimeUnit.SECONDS.sleep(3);
        new TouchAction(driver).tap(point(199, 574)).perform();



       // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[5]"))).click();
        TimeUnit.SECONDS.sleep(3);

        new TouchAction(driver).tap(point(317, 1101)).perform();
        TimeUnit.SECONDS.sleep(3);
        //moto screen
       // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.ImageView")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.obhai:id/btnOk"))).click();
        //TimeUnit.SECONDS.sleep(10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.obhai:id/makePaymentBtn"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[7]"))).sendKeys("01770618575");
        new TouchAction(driver).tap(point(78, 597)).perform();
        TimeUnit.SECONDS.sleep(3);
        new TouchAction(driver).tap(point(120, 762)).perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("submit_button"))).click();
        TimeUnit.SECONDS.sleep(3);
        new TouchAction(driver).tap(point(205, 415)).perform();
        //keypad
        new TouchAction(driver).tap(point(62, 1123)).perform();
        //123456
        new TouchAction(driver).tap(point(62, 1123)).perform();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[4]"))).sendKeys("123456");
        new TouchAction(driver).tap(point(275, 499)).perform();
        TimeUnit.SECONDS.sleep(2);
        new TouchAction(driver).tap(point(151, 412)).perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[4]"))).sendKeys("12121");
        new TouchAction(driver).tap(point(331, 499)).perform();


















        new TouchAction(driver).tap(point(356, 986)).perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.obhai:id/requestRideBtn"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.obhai:id/btnOk"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("android:id/content")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.ImageView")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout[2]")));
        new TouchAction(driver).tap(point(350, 1023)).perform();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.ImageView")));
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.obhai:id/tvPayableAmountValue")));
        //Thread.sleep(000);
        TimeUnit.SECONDS.sleep(4);
        new TouchAction(driver).press(point(518, 625)).moveTo(point(513, 392)).release().perform();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.obhai:id/payByCashBtn"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.obhai:id/btnOk"))).click();

      //  if (driver.findElements(By.id("com.obhai:id/btnOk")).size()>0) {
      //      driver.findElements(By.id("com.obhai:id/btnOk")).get(0).click();
      //  }

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.obhai:id/RatingBar")));
        driver.findElements(By.id("com.obhai:id/ratingEditText")).get(0).sendKeys("appium");

        //(new TouchAction(driver)).tap(639, 1112).perform();
        new TouchAction(driver).tap(point(639, 1112)).perform();
        driver.findElements(By.id("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[1]")).get(0).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.ImageView")));




        // driver.findElement(By.id("com.obhai:id/buttonLogin")).click();

      // if (driver.findElements(By.id("com.obhai.res.layout.splash_new:id/buttonLogin")).size()>0) {
      //     driver.findElements(By.id("com.obhai.res.layout.splash_new:id/buttonLogin")).get(0).click();
      // }

        //Click to "Is Ariyorum" Button
       // wait.until(ExpectedConditions.visibilityOfElementLocated
           //    (By.id("com.obhai:id/buttonLogin"))).click();
      //wait.until(ExpectedConditions.visibilityOfElementLocated
               // (By.id("com.android.packageinstaller:id/permission_allow_button"))).click();



        //Click second job
       //wait.until(ExpectedConditions.visibilityOfElementLocated
              //  (By.xpath(secondNewJob))).click();



    }





    @AfterMethod
    public void teardown(){
        driver.quit();
    }

    public boolean captureScreenshot(final String name) {
        String directory = System.getProperty("appium.screenshots.dir", System.getProperty("java.io.tmpdir", ""));
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        return screenshot.renameTo(new File("user_dir", String.format("%s.png", name)));
    }
}