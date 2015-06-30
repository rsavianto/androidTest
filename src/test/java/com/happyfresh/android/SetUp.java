package com.happyfresh.android;

import java.io.File;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;

public class SetUp {
	
	AndroidDriver driver;
	
	@BeforeClass
    public void setUp() throws Exception {
		String appPath = System.getenv("ANDROID_APP_PATH");
		String appName = System.getenv("ANDROID_APP_NAME");
		String appPackage = System.getenv("ANDROID_APP_PACKAGE");
		String deviceName = System.getenv("ANDROID_DEVICE_NAME");
		String platformVersion = System.getenv("ANDROID_PLATFORM_VERSION");

        File appDir = new File(appPath);
        File app = new File(appDir, appName);
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", deviceName);
        capabilities.setCapability("platformVersion", platformVersion);
        capabilities.setCapability("app", app.getAbsolutePath());
        capabilities.setCapability("appPackage", appPackage);
        capabilities.setCapability("intentAction", "android.intent.action.MAIN");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}
