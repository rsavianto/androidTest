package com.happyfresh.android;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

public class BaseTest extends SetUp {
	WebElement element;
	String blank = "";
	
	protected boolean isElementExist (By by){
		try {
			element = driver.findElement(by);
			element.isDisplayed();
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		return true;
	}
	
	protected void isWait(int waitDuration){
		driver.manage().timeouts().implicitlyWait(waitDuration, TimeUnit.SECONDS);
	}
	
	protected void swipeLeft(WebElement element, By locateFor,int maxScroll, int durationPerSwipe, int spare){
		Dimension d = element.getSize();
		Point p = element.getLocation();
		int sx, sy, ex, ey, x, y;
		x = p.getX();
		y = p.getY();
		
		sx = x + d.getWidth() - spare;
		sy = y + d.getHeight()/2;
		ex = x + spare;
		ey = sy;

		for (int i = 0; i < maxScroll; i++) {
			driver.swipe(sx, sy, ex, ey, durationPerSwipe);
			driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
			if (locateFor != null && isElementExist(locateFor)) {
				break;
			}
		}
	}
	
	protected void swipeRight(WebElement element, By locateFor,int maxScroll, int durationPerSwipe, int spare){
		Dimension d = element.getSize();
		Point p = element.getLocation();
		int sx, sy, ex, ey, x, y;
		x = p.getX();
		y = p.getY();
		
		sx = x + spare;
		sy = y + d.getHeight()/2;
		ex = x + d.getWidth() - spare;
		ey = sy;

		for (int i = 0; i < maxScroll; i++) {
			driver.swipe(sx, sy, ex, ey, durationPerSwipe);
			driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
			if (locateFor != null && isElementExist(locateFor)) {
				break;
			}
		}
	}
	
	protected void swipeDown(WebElement element, By locateFor,int maxScroll, int durationPerSwipe, int spare){
		Dimension d = element.getSize();
		Point p = element.getLocation();
		int sx, sy, ex, ey, x, y;
		x = p.getX();
		y = p.getY();
		
		sx = x + d.getWidth()/2;
		sy = y + spare;
		ex = sx;
		ey = y + d.getWidth() - spare;

		for (int i = 0; i < maxScroll; i++) {
			driver.swipe(sx, sy, ex, ey, durationPerSwipe);
			driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
			if (locateFor != null && isElementExist(locateFor)) {
				break;
			}
		}
	}
	
	protected void swipeUp(WebElement element, By locateFor,int maxScroll, int durationPerSwipe, int spare){
		Dimension d = element.getSize();
		Point p = element.getLocation();
		int sx, sy, ex, ey, x, y;
		x = p.getX();
		y = p.getY();
		
		sx = x + d.getWidth()/2;
		sy = y + d.getWidth() - spare;
		ex = sx;
		ey = y + spare;

		for (int i = 0; i < maxScroll; i++) {
			driver.swipe(sx, sy, ex, ey, durationPerSwipe);
			driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
			if (locateFor != null && isElementExist(locateFor)) {
				break;
			}
		}
	}
	
}

