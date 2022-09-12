package org.projtest;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestKeyboardAction	{
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajan\\eclipse-workspace\\rajantest\\driver\\chromedriver.exe");
		
		WebDriver drive = new ChromeDriver();
		
		drive.get("https://www.facebook.com/");
		
		drive.manage().window().maximize();
		
		WebElement uN = drive.findElement(By.name("email"));
		
		Actions act = new Actions(drive);
		act.click(uN);
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_R);
		r.keyRelease(KeyEvent.VK_R);
		
		Thread.sleep(1000);
		
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
		
		Thread.sleep(1000);
		
		r.keyPress(KeyEvent.VK_J);
		r.keyRelease(KeyEvent.VK_J);
		
		Thread.sleep(1000);
		
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
		
		Thread.sleep(1000);
		
		r.keyPress(KeyEvent.VK_N);
		r.keyRelease(KeyEvent.VK_N);
		
		Thread.sleep(1000);
		
		r.keyPress(KeyEvent.VK_M);
		r.keyRelease(KeyEvent.VK_M);
		
		Thread.sleep(1000);
		
		r.keyPress(KeyEvent.VK_W);
		r.keyRelease(KeyEvent.VK_W);
		
		Thread.sleep(1000);
		
		r.keyPress(KeyEvent.VK_7);
		r.keyRelease(KeyEvent.VK_7);
		
		Thread.sleep(1000);
		
		r.keyPress(KeyEvent.VK_7);
		r.keyRelease(KeyEvent.VK_7);
		
		Thread.sleep(1000);
		
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_2);
		r.keyRelease(KeyEvent.VK_SHIFT);
		r.keyRelease(KeyEvent.VK_2);
		
		Thread.sleep(1000);
		
		r.keyPress(KeyEvent.VK_G);
		r.keyRelease(KeyEvent.VK_G);
		
		Thread.sleep(1000);
		
		r.keyPress(KeyEvent.VK_M);
		r.keyRelease(KeyEvent.VK_M);
		
		Thread.sleep(1000);
		
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
		
		Thread.sleep(1000);
		
		r.keyPress(KeyEvent.VK_I);
		r.keyRelease(KeyEvent.VK_I);
		
		Thread.sleep(1000);
		
		r.keyPress(KeyEvent.VK_L);
		r.keyRelease(KeyEvent.VK_L);
		
		Thread.sleep(1000);
		
		r.keyPress(KeyEvent.VK_PERIOD);
		r.keyRelease(KeyEvent.VK_PERIOD);
		
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_C);
		
		Thread.sleep(1000);
		
		r.keyPress(KeyEvent.VK_O);
		r.keyRelease(KeyEvent.VK_O);
		
		Thread.sleep(1000);
		
		r.keyPress(KeyEvent.VK_M);
		r.keyRelease(KeyEvent.VK_M);
		
		Thread.sleep(1000);
		
		
		
		
	}

}
