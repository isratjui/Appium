//import static java.time.Duration.ofSeconds;

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

public class ioSampleTest3 {

    public AppiumDriver<MobileElement> driver;
    public WebDriverWait wait;
    //    WebDriver augmentedDriver = new Augmenter().augment(((WrapsDriver)driver).getWrappedDriver());
//((Rotatable)augmentedDriver).rotate(ScreenOrientation.LANDSCAPE);
    //Elements
    String secondNewJob = "//android.widget.FrameLayout[2]/android.widget.LinearLayout/" +
            "android.widget.RelativeLayout/android.widget.ImageView";

    static int num=1;
    @BeforeMethod
    public void setup() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();

        // caps.setCapability("deviceName", "Pixel 2 API 27");
        //caps.setCapability("udid", "emulator-5554"); //DeviceId from "adb devices" command 192.168.22.101:5555
        //  caps.setCapability("platformName", "Android");
        //  caps.setCapability("platformVersion", "8.1");

        caps.setCapability("deviceName", "WE R4 API 27");
        caps.setCapability("udid", "WEWER403838"); //DeviceId from "adb devices" command 192.168.22.101:5555
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "8.1.0");

        //caps.setCapability("skipUnlock","true");

        //caps.setCapability("deviceName", "OPPO F5 API 25");
        // caps.setCapability("udid", "G6R4ZSGAJJ9S4L8D"); //DeviceId from "adb devices" command 192.168.22.101:5555
        //caps.setCapability("platformName", "Android");
        //caps.setCapability("platformVersion", "7.1.1");

        //caps.setCapability("deviceName", "Symphony P9 API 25");
        //caps.setCapability("udid", "P9170614004302"); //DeviceId from "adb devices" command 192.168.22.101:5555
        // caps.setCapability("platformName", "Android");
        // caps.setCapability("platformVersion", "7.0");


        //caps.setCapability("deviceName", "p1 API 25");
        // caps.setCapability("udid", "LGH815658fa951"); //DeviceId from "adb devices" command 192.168.22.101:5555
        //caps.setCapability("platformName", "Android");
        // caps.setCapability("platformVersion", "7.0");


        caps.setCapability("appPackage", "com.Obhai.driver");
        caps.setCapability("appActivity", "com.Obhai.driver.SplashActivity");
//        caps.setCapability("noReset","false");
//        driver = new AndroidDriver<MobileElement>(new URL("htt p://127.0.0.1:4723/wd/hub"),caps);
        driver = new AndroidDriver<MobileElement>(
                new URL("http://0.0.0.0:4723/wd/hub"),
                caps);
        //driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),caps);
        wait = new WebDriverWait(driver, 600);
        caps.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, true);

    }

    @Test
    public void basicTest() throws InterruptedException {
        //Click and pass Splash
//        wait.until(ExpectedConditions.visibilityOfElementLocated
//                (By.id("com.isinolsun.app:id/animation_view"))).click();

        //Click and pass Tutorial
//        wait.until(ExpectedConditions.visibilityOfElementLocated
//                (By.id("com.isinolsun.app:id/btn_skip"))).click();

        //Click to "Is Ariyorum" Button
//        wait.until(ExpectedConditions.visibilityOfElementLocated
//                (By.id("com.isinolsun.app:id/bluecollar_type_button"))).click();
        WebDriverWait wait = new WebDriverWait(driver, 600);

//        //Notification Allow
        for (int i = 0; i < 5; i++) {
            if (driver.findElements(By.id("com.android.packageinstaller:id/permission_allow_button")).size() > 0) {
                driver.findElements(By.id("com.android.packageinstaller:id/permission_allow_button")).get(0).click();
            }
        }
        //driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        System.out.println("test1");
        //wait.until(ExpectedConditions.visibilityOfElementLocated
        // (By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.Button[1]"))).click();
        System.out.println("test2");
        //wait.until(ExpectedConditions.visibilityOfElementLocated
        //(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.Button[1]"))).click();

        TimeUnit.SECONDS.sleep(10);
        //  new TouchAction(driver).tap(point(505, 1712)).perform();//oppo phone
        //new TouchAction(driver).tap(point(529, 1538)).perform();//pixel 2 phone

        new TouchAction(driver).tap(point(364, 1104)).perform();// we phone
        //wait.until(ExpectedConditions.visibilityOfElementLocated(
        // driver.findElements(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.Button[1]")).get(0).click();



//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.Button[1]")));



        System.out.println("next");
        //driver.findElements(By.id("com.Obhai.driver:id/buttonLogin")).size();
        //driver.findElementById("com.Obhai.driver:id/buttonLogin").click();
//        driver.findElements(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.Button[1]")).get(0).click();
        //System.out.println("~~>"+driver.findElements(By.id("com.Obhai.driver:id/buttonLogin")));

//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.Button[1]")));

        TimeUnit.SECONDS.sleep(10);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.Obhai.driver:id/emailEt")));
        driver.findElements(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText[2]")).get(0).sendKeys("123456");
        System.out.println("jui");
        driver.findElements(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText[1]")).get(0).sendKeys("01700706931");

        System.out.println("jui1");
        driver.findElements(By.id("com.Obhai.driver:id/signInBtn")).get(0).click();
        TimeUnit.SECONDS.sleep(10);
        System.out.println("12sec");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout[2]\n")));

        System.out.println("Landing page");
        driver.findElements(By.id("com.Obhai.driver:id/driverONToggle")).get(0).click();
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView")));
        System.out.println("select vehicle");
        TimeUnit.SECONDS.sleep(3);

        //System.out.println("submit");
       
        TimeUnit.SECONDS.sleep(1);
        new TouchAction(driver).tap(point(333, 1185)).perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.Obhai.driver:id/btnOk")));
        driver.findElements(By.id("com.Obhai.driver:id/btnOk")).get(0).click();
        System.out.println("landing page");
        TimeUnit.SECONDS.sleep(3);
        // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout[2]")));
        System.out.println("reqst");
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.Obhai.driver:id/text_accept")));com.Obhai.driver:id/acceptRide
        System.out.println("accpt");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.Obhai.driver:id/acceptRide")));
        driver.findElements(By.id("com.Obhai.driver:id/acceptRide")).get(0).click();
        System.out.println("wait");
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.Obhai.driver:id/driverArrivedBtn")));
        Thread.sleep(2000);
        driver.findElements(By.id("com.Obhai.driver:id/driverArrivedBtn")).get(0).click();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.Obhai.driver:id/btnOk")));
        driver.findElements(By.id("com.Obhai.driver:id/btnOk")).get(0).click();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.Obhai.driver:id/driverStartRideBtn")));
        Thread.sleep(2000);
        driver.findElements(By.id("com.Obhai.driver:id/driverStartRideBtn")).get(0).click();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.Obhai.driver:id/btnOk")));
        driver.findElements(By.id("com.Obhai.driver:id/btnOk")).get(0).click();
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.Obhai.driver:id/callCustomerAboveRl")));
        Thread.sleep(6000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.Obhai.driver:id/driverEndRideBtn")));
        Thread.sleep(2000);
        driver.findElements(By.id("com.Obhai.driver:id/driverEndRideBtn")).get(0).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.Obhai.driver:id/btnOk")));
        driver.findElements(By.id("com.Obhai.driver:id/btnOk")).get(0).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.Obhai.driver:id/reviewSubmitBtn")));
        driver.findElements(By.id("com.Obhai.driver:id/reviewSubmitBtn")).get(0).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.Obhai.driver:id/btnOk")));
        driver.findElements(By.id("com.Obhai.driver:id/btnOkn")).get(0).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.Obhai.driver:id/tvActualFare")));
        driver.findElements(By.id("com.Obhai.driver:id/tvActualFare")).get(0).sendKeys("appium");
        driver.findElements(By.id("android:id/navigationBarBackground")).get(0).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout[2]")));
        Thread.sleep(2000);


    


    }


    @AfterMethod
    public void teardown() {
        driver.quit();
    }

}
