package org.projtest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAl {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rajan\\eclipse-workspace\\browserlauchlocator\\driver\\chromedriver.exe");

		WebDriver drive = new ChromeDriver();

		drive.manage().window().maximize();
		drive.get("https://netbanking.canarabank.in/entry/ENULogin.jsp");
		
		WebElement contC = drive.findElement(By.xpath("//input[@type='submit'][1]"));
		contC.click();
		
		Alert alert = drive.switchTo().alert();
		Thread.sleep(2000);
		
		alert.accept();
		
		WebElement contC1 = drive.findElement(By.xpath("//input[@type='text']"));
		contC1.sendKeys("rajan");
		
	}
}
