import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;

public class Demo {
		static By login= By.id("com.myswaasth:id/loginTxt");
		static By email= By.id("com.myswaasth:id/emailMobileEditTxt");
		static By password= By.id("com.myswaasth:id/passwordEditTxt");
		static By login_btn= By.id("com.myswaasth:id/loginTxt");
		public static final String USERNAME = "vishakha.inntocal";
		public static final String ACCESS_KEY = "eae104f0-cc5d-434f-bb5c-655ca684b34b";
		public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";
	 
	  public static void main(String[] args) throws Exception {
	 
	    DesiredCapabilities capabilities = new DesiredCapabilities();
	    capabilities.setCapability("platformName", "Android");
	    capabilities.setCapability("deviceName", "Samsung Galaxy S4 Emulator");
	    capabilities.setCapability("platformVersion", "4.4");
	    capabilities.setCapability("app", "sauce-storage:myswaasth.apk");
	    capabilities.setCapability("browserName", "");
	    capabilities.setCapability("deviceOrientation", "portrait");
	    capabilities.setCapability("appiumVersion", "1.5.3");
	    capabilities.setCapability("idleTimeout", "180");
	    WebDriver driver = new AndroidDriver<>(new URL(URL), capabilities);
	    driver.manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);
	    System.out.println("done");
	    driver.findElement(By.xpath("//*[@text='SKIP']")).click();
	    System.out.println("done1");
	    Thread.sleep(5000);
	    System.out.println("done2");
	    driver.findElement(By.xpath("//*[@text='Login to myswaasth']")).click();
	    driver.findElement(email).sendKeys("7500355112");
		driver.findElement(password).sendKeys("8826277650");
		driver.findElement(login_btn).click();
		Thread.sleep(5000);
		Assert.assertEquals("Hello Vishakha", "Hello Vishakha");
	    driver.quit();
	    driver.close();
	  }
}