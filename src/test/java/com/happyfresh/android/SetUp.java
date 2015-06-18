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
//        File classpathRoot = new File(System.getProperty("user.dir"));
        File appDir = new File("Home/jobs/Android/workspace/build/outputs/apk/");
        File app = new File(appDir, "app-staging-debug.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","Android");
        capabilities.setCapability("platformVersion", "4.4");
        capabilities.setCapability("app", app.getAbsolutePath());
        capabilities.setCapability("appPackage", "com.happyfresh.staging");
        capabilities.setCapability("intentAction", "android.intent.action.MAIN");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}
