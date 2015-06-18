package com.happyfresh.android;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Launch extends BaseTest{
	
	String blank = "";
	
	public void signUp(String fname, String lname, String email, String pwd, String pcode){
		driver.findElement(By.id("com.happyfresh.staging:id/first_name")).clear();
		driver.findElement(By.id("com.happyfresh.staging:id/first_name")).sendKeys(fname);
		driver.findElement(By.id("com.happyfresh.staging:id/last_name")).clear();
		driver.findElement(By.id("com.happyfresh.staging:id/last_name")).sendKeys(lname);
		driver.findElement(By.id("com.happyfresh.staging:id/email")).clear();
		driver.findElement(By.id("com.happyfresh.staging:id/email")).sendKeys(email);
		driver.findElement(By.id("com.happyfresh.staging:id/password")).clear();
		driver.findElement(By.id("com.happyfresh.staging:id/password")).sendKeys(pwd);
		driver.findElement(By.id("com.happyfresh.staging:id/promo_code")).clear();
		driver.findElement(By.id("com.happyfresh.staging:id/promo_code")).sendKeys(pcode);
		
		driver.findElement(By.id("com.happyfresh.staging:id/sign_up")).submit();
			
	}

	
	
			
	@Test //Verify splash screen
	public void TC_2014Q20007_001_001() {
		isWait(3);
		// Finding element By name
		element = driver.findElement(By.id("com.happyfresh.staging:id/logo"));
		Assert.assertTrue(element.isDisplayed(), "Splash screen is displayed more than 5 seconds.");
		
		/*com.happyfresh.staging:id/image_layout
		com.happyfresh.staging:id/button_start
		[0,75][1080,1920]*/
		
		/*// Finding element by ID
		element = driver.findElement(By.id("com.srin.garut:id/pager"));
		//assertTrue("Getting started image pager not exist", element.isDisplayed());
		Assert.assertTrue(element.isDisplayed(), "Getting started image pager not exist");*/
		
	}
	
	@Test //Verify Service Introduction page one
	public void TC_2014Q20007_001_002(){
		isWait(2);
		element = driver.findElement(By.id("com.happyfresh.staging:id/image_layout"));
		Assert.assertTrue(element.isDisplayed(), "Getting started image pager-1 not exist");
		
		element = driver.findElement(By.id("com.happyfresh.staging:id/button_start"));
		Assert.assertTrue(element.isDisplayed(), "Getting started button not exist");
		Assert.assertEquals(driver.findElement(By.id("com.happyfresh.staging:id/button_start")).getText(), "Next");
		
	}
	
	@Test //Verify that user able to swipe left move to next Service Introduction page (page 2)
	public void TC_2014Q20007_001_003(){
		swipeLeft(driver.findElement(By.id("com.happyfresh.staging:id/image_layout")),null,1,1000, 10);
		element = driver.findElement(By.id("com.happyfresh.staging:id/image_layout"));
		Assert.assertTrue(element.isDisplayed(), "Getting started image pager-1 not exist");
		element = driver.findElement(By.id("com.happyfresh.staging:id/button_start"));
		Assert.assertTrue(element.isDisplayed(), "Getting started button not exist");
		Assert.assertEquals(driver.findElement(By.id("com.happyfresh.staging:id/button_start")).getText(), "Next");
		
	}
	
	@Test //Verify that user able to swipe left to next Service Introduction (page 3)
	public void TC_2014Q20007_001_004(){
		swipeLeft(driver.findElement(By.id("com.happyfresh.staging:id/image_layout")),null,1,1000, 10);
		element = driver.findElement(By.id("com.happyfresh.staging:id/image_layout"));
		Assert.assertTrue(element.isDisplayed(), "Getting started image pager-1 not exist");
		element = driver.findElement(By.id("com.happyfresh.staging:id/button_start"));
		Assert.assertTrue(element.isDisplayed(), "Getting started button not exist");
		Assert.assertEquals(driver.findElement(By.id("com.happyfresh.staging:id/button_start")).getText(), "Let's Get Started");
		
	}
	
	@Test //Verify that user unable to swipe left when user already in last page (third page of service introduction)
	public void TC_2014Q20007_001_005(){
		swipeLeft(driver.findElement(By.id("com.happyfresh.staging:id/image_layout")),null,1,1000, 10);
		element = driver.findElement(By.id("com.happyfresh.staging:id/image_layout"));
		Assert.assertTrue(element.isDisplayed(), "Getting started image pager-1 not exist");
		element = driver.findElement(By.id("com.happyfresh.staging:id/button_start"));
		Assert.assertTrue(element.isDisplayed(), "Getting started button not exist");
		Assert.assertEquals(driver.findElement(By.id("com.happyfresh.staging:id/button_start")).getText(), "Let's Get Started");
		
	}
	
	@Test //Verify that user able to swipe right move to previous Service Introduction (page 2)
	public void TC_2014Q20007_001_006(){
		swipeRight(driver.findElement(By.id("com.happyfresh.staging:id/image_layout")),null,1,1000, 10);
		element = driver.findElement(By.id("com.happyfresh.staging:id/image_layout"));
		Assert.assertTrue(element.isDisplayed(), "Getting started image pager-1 not exist");
		element = driver.findElement(By.id("com.happyfresh.staging:id/button_start"));
		Assert.assertTrue(element.isDisplayed(), "Getting started button not exist");
		Assert.assertEquals(driver.findElement(By.id("com.happyfresh.staging:id/button_start")).getText(), "Next");
		
	}
	
	@Test //Verify that user able to swipe right move to previous Service Introduction (page 1)
	public void TC_2014Q20007_001_007(){
		swipeRight(driver.findElement(By.id("com.happyfresh.staging:id/image_layout")),null,1,1000, 10);
		element = driver.findElement(By.id("com.happyfresh.staging:id/image_layout"));
		Assert.assertTrue(element.isDisplayed(), "Getting started image pager-1 not exist");
		element = driver.findElement(By.id("com.happyfresh.staging:id/button_start"));
		Assert.assertTrue(element.isDisplayed(), "Getting started button not exist");
		Assert.assertEquals(driver.findElement(By.id("com.happyfresh.staging:id/button_start")).getText(), "Next");
		
	}
	
	@Test //Verify that user unable to swipe left when user already in First page of service introduction
	public void TC_2014Q20007_001_008(){
		swipeRight(driver.findElement(By.id("com.happyfresh.staging:id/image_layout")),null,1,1000, 10);
		element = driver.findElement(By.id("com.happyfresh.staging:id/image_layout"));
		Assert.assertTrue(element.isDisplayed(), "Getting started image pager-1 not exist");
		element = driver.findElement(By.id("com.happyfresh.staging:id/button_start"));
		Assert.assertTrue(element.isDisplayed(), "Getting started button not exist");
		Assert.assertEquals(driver.findElement(By.id("com.happyfresh.staging:id/button_start")).getText(), "Next");
		
	}
	
	@Test // Verify that user able to tap back button on device to close apps
	public void TC_2014Q20007_001_009(){
		// Click back button on device
		driver.quit();
		//element = driver.findElement(By.xpath("//package = 'com.sec.android.app.launcher'"));
		//Assert.assertTrue(element.isDisplayed(), "Getting started image pager-1 not exist");
	}
	
	@Test // Verify that user able to tap back button on device to close apps
	public void TC_2014Q20007_001_010() throws Exception{
		// Click back button on device
		setUp();
		isWait(5);
		// Finding element By name
		element = driver.findElement(By.id("com.happyfresh.staging:id/logo"));
		Assert.assertTrue(element.isDisplayed(), "Splash screen is displayed more than 5 seconds.");

	}
	
	@Test // Verify that user able to tap next button in service introduction page 1
	public void TC_2014Q20007_001_012(){
		// Click Next button
		driver.findElement(By.id("com.happyfresh.staging:id/button_start")).click();
		element = driver.findElement(By.id("com.happyfresh.staging:id/image_layout"));
		Assert.assertTrue(element.isDisplayed(), "Getting started image pager-1 not exist");
		element = driver.findElement(By.id("com.happyfresh.staging:id/button_start"));
		Assert.assertTrue(element.isDisplayed(), "Getting started button not exist");
		Assert.assertEquals(driver.findElement(By.id("com.happyfresh.staging:id/button_start")).getText(), "Next");
	}
	
	@Test // Verify that user able to tap next button in service introduction page 2
	public void TC_2014Q20007_001_013(){
		// Click Next button
		driver.findElement(By.id("com.happyfresh.staging:id/button_start")).click();
		element = driver.findElement(By.id("com.happyfresh.staging:id/image_layout"));
		Assert.assertTrue(element.isDisplayed(), "Getting started image pager-1 not exist");
		element = driver.findElement(By.id("com.happyfresh.staging:id/button_start"));
		Assert.assertTrue(element.isDisplayed(), "Getting started button not exist");
		Assert.assertEquals(driver.findElement(By.id("com.happyfresh.staging:id/button_start")).getText(), "Let's Get Started");
	}
	
	@Test // Verify that user able to tap next button in service introduction page 3
	public void TC_2014Q20007_001_014(){
		// Click Let's Get Started button
		driver.findElement(By.id("com.happyfresh.staging:id/button_start")).click();
		element = driver.findElement(By.id("com.happyfresh.staging:id/upper_login"));
		Assert.assertTrue(element.isDisplayed(), "Login page not exist");
	}
	
	@Test // Verify All element in Sign Up page
	public void TC_2014Q20007_001_015(){
		// Verify element
		Assert.assertTrue(isElementExist(By.name("Navigasi naik")), "Back button on Sign Up page not exist");
		Assert.assertTrue(isElementExist(By.id("com.happyfresh.staging:id/upper_login")), "Sign Up page not exist");
		Assert.assertEquals(driver.findElement(By.name("Sign up now")).getText(), "Sign up now");
		Assert.assertEquals(driver.findElement(By.name("Receive free delivery on your first order")).getText(), "Receive free delivery on your first order");
		Assert.assertTrue(isElementExist(By.id("com.happyfresh.staging:id/first_name")), "First name text field not exist");
		Assert.assertTrue(isElementExist(By.id("com.happyfresh.staging:id/last_name")), "Last name text field not exist");
		Assert.assertTrue(isElementExist(By.id("com.happyfresh.staging:id/email")), "Email Address text field not exist");
		Assert.assertTrue(isElementExist(By.id("com.happyfresh.staging:id/password")), "Password text field not exist");
		Assert.assertTrue(isElementExist(By.id("com.happyfresh.staging:id/promo_code")), "Promo code text field not exist");
		Assert.assertTrue(isElementExist(By.id("com.happyfresh.staging:id/sign_up")), "Sign Up button not exist");
		Assert.assertEquals(driver.findElement(By.id("com.happyfresh.staging:id/sign_up")).getText(),"SIGN UP");
		Assert.assertTrue(isElementExist(By.id("com.happyfresh.staging:id/login")), "LOG IN button not exist");
		Assert.assertEquals(driver.findElement(By.id("com.happyfresh.staging:id/login")).getText(),"LOG IN");
	}
		
	
	/*{
		// Verify element
		Assert.assertTrue(isElementExist(By.name("Navigate up")), "Back button on Sign Up page not exist");
		Assert.assertTrue(isElementExist(By.id("com.happyfresh.staging:id/upper_login")), "Sign Up page not exist");
		Assert.assertEquals(driver.findElement(By.name("Sign up now")).getText(), "Sign up now");
		Assert.assertEquals(driver.findElement(By.name("Receive free delivery on your first order")).getText(), "Receive free delivery on your first order");
		Assert.assertTrue(isElementExist(By.id("com.happyfresh.staging:id/first_name")), "First name text field not exist");
		Assert.assertTrue(driver.findElement(By.id("com.happyfresh.staging:id/first_name")).getText().matches("First Name. Double tap to edit."));
		Assert.assertTrue(isElementExist(By.id("com.happyfresh.staging:id/last_name")), "Last name text field not exist");
		Assert.assertTrue(driver.findElement(By.id("com.happyfresh.staging:id/last_name")).getText().matches("Last Name. Double tap to edit."));
		Assert.assertTrue(isElementExist(By.id("com.happyfresh.staging:id/email")), "Email Address text field not exist");
		Assert.assertTrue(driver.findElement(By.id("com.happyfresh.staging:id/email")).getText().matches("Email Address. Double tap to edit."));
		Assert.assertTrue(isElementExist(By.id("com.happyfresh.staging:id/password")), "Password text field not exist");
		Assert.assertTrue(driver.findElement(By.id("com.happyfresh.staging:id/password")).getText().matches("Enter password.. Double tap to edit."));
		Assert.assertTrue(isElementExist(By.id("com.happyfresh.staging:id/promo_code")), "Promo code text field not exist");
		Assert.assertTrue(driver.findElement(By.id("com.happyfresh.staging:id/promo_code")).getText().matches("Invite Code (optional). Double tap to edit."));
		Assert.assertTrue(isElementExist(By.id("com.happyfresh.staging:id/sign_up")), "Sign Up button not exist");
		Assert.assertEquals(driver.findElement(By.id("com.happyfresh.staging:id/sign_up")).getText(),"SIGN UP");
		Assert.assertTrue(isElementExist(By.id("com.happyfresh.staging:id/login")), "LOG IN button not exist");
		Assert.assertEquals(driver.findElement(By.id("com.happyfresh.staging:id/login")).getText(),"LOG IN");
	}*/
	
	/*@Test
	public void TC_2014Q20007_001_006(){
		// Click back button on device
		driver.findElement(By.id("com.happyfresh.staging:id/current_location_button")).click();
		element = driver.findElement(By.id("com.happyfresh.staging:id/title"));
		Assert.assertTrue(element.isDisplayed(), "Popup permission not exist");
		Assert.assertEquals(driver.findElement(By.id("com.happyfresh.staging:id/content")).getText(), "Unable to retrieve location at this moment. Please check your location settings.", "String not Equals");
		Assert.assertTrue(driver.findElement(By.name("Ok")).isDisplayed(), "OK_button is not exist");
	}
	
	@Test
	public void TC_2014Q20007_001_007(){
		// Click back button on device
		driver.findElement(By.name("Ok")).click();
		element = driver.findElement(By.name("Find stores in your area delivering to you"));
		Assert.assertEquals(element.getText(), "Find stores in your area delivering to you", "String not Equals");
		Assert.assertEquals(driver.findElement(By.name("Where would you like to deliver to?")).getText(), "Where would you like to deliver to?", "String not Equals");
		Assert.assertTrue(driver.findElement(By.id("com.happyfresh.staging:id/current_location_button")).isDisplayed(), "current_location_button not exist");
		Assert.assertTrue(driver.findElement(By.id("com.happyfresh.staging:id/search_location_button")).isDisplayed(), "search_location_button not exist");
		
	}
*/
		
		/*// Using SRIN TestLib API to check if the element exist
		Assert.assertTrue(isElementExist(By.name("Service_Introduction-1")),);
		Assert.assertTrue(isElementExist(By.name("Service_Introduction-1")), "Service Introduction image 1 is not dosplayed");
		
		// Getting Element size.
		Dimension d = driver.findElement(By.id("com.srin.garut:id/pager")).getSize();
		
		// Navigation: swipe right
		driver.swipe(d.getWidth() - 10, d.getHeight()/2, 10, d.getHeight()/2, 1000);
		assertTrue("Service Introduction image 1 is not dosplayed", isElementExist(By.name("Service_Introduction-2")));
		driver.swipe(d.getWidth() - 10, d.getHeight()/2, 10, d.getHeight()/2, 1000);
		assertTrue("Service Introduction image 1 is not dosplayed", isElementExist(By.name("Service_Introduction-3")));
		
		// Navigation: Swipe left
		driver.swipe(10, d.getHeight()/2, d.getWidth() -10, d.getHeight()/2, 1000);
		assertTrue("Service Introduction image 1 is not dosplayed", isElementExist(By.name("Service_Introduction-2")));
		driver.swipe(10, d.getHeight()/2, d.getWidth() -10, d.getHeight()/2, 1000);
		assertTrue("Service Introduction image 1 is not dosplayed", isElementExist(By.name("Service_Introduction-1")));
		
	}
	
	@Test
	public void TC_2014Q20007_001_002() {
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		assertTrue("Splash screen is displayed more than 5 seconds.", isElementExist(By.name("Start Now")));
		assertTrue("Term and Condition string not exist", isElementExist(By.id("com.srin.garut:id/tvTOC")));
		WebElement element = driver.findElement(By.id("com.srin.garut:id/tvTOC")); 
		Point elemloc = element.getLocation();
		Dimension dimen = element.getSize();
		int x = elemloc.getX();
		int y = elemloc.getY();
		int w = dimen.getWidth()/2;
		int h = dimen.getHeight()/2;
		y += h;
		x = x + w + (w/4);

		// Tap on precise position (x,y)
		driver.tap(2, x, y, 100);
		assertTrue("Title not exist", isElementExist(By.id("com.srin.garut:id/title")));
		element = driver.findElement(By.id("com.srin.garut:id/title"));
		assertTrue(element.isDisplayed());
		
		// Getting element properties: text
		assertEquals("Title is not Term And Condition", "Terms and Condition", element.getText());
		
		
		assertTrue("Home button not exist", isElementExist(By.id("android:id/home")));
		assertTrue("Up button not exist", isElementExist(By.id("android:id/up")));
		
		
		assertTrue("S LIME, Navigate up button not exist",isElementExist(By.name("S LIME, Navigate up")));
		
		// click on element.
		driver.findElement(By.name("S LIME, Navigate up")).click();
		
		assertTrue("Not in the Getting started", isElementExist(By.name("Start Now")));
		
		assertTrue("Term and Condition string not exist", isElementExist(By.id("com.srin.garut:id/tvTOC")));
		
		driver.tap(2, x, y, 100);
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		assertTrue("Title not exist", isElementExist(By.id("com.srin.garut:id/title")));
		element = driver.findElement(By.id("com.srin.garut:id/title"));
		assertTrue(element.isDisplayed());
		assertEquals("Title is not Term And Condition", "Terms and Condition", element.getText());
		
		// Simulate HW back.
		driver.navigate().back();
		
		assertTrue("Not in the Getting started", isElementExist(By.name("Start Now")));
	}
	
	@Test
	public void TC_2014Q20007_001_003() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// finding element by xPath.

	}*/

}

