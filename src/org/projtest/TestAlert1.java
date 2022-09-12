package org.projtest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAlert1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rajan\\eclipse-workspace\\browserlauchlocator\\driver\\chromedriver.exe");

		WebDriver drive = new ChromeDriver();

		drive.manage().window().maximize();
		drive.get("https://demo.automationtesting.in/Alerts.html");

		WebElement altClk = drive.findElement(By.xpath("//button[@onclick='alertbox()']"));
		altClk.click();

		Alert alert = drive.switchTo().alert();
		Thread.sleep(2000);
		alert.accept();

		WebElement cnfClk = drive.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		cnfClk.click();

		WebElement cnfClk1 = drive.findElement(By.xpath("//button[@class='btn btn-primary']"));
		cnfClk1.click();
		
		Alert alert2 = drive.switchTo().alert();
		Thread.sleep(2000);
		alert2.accept();

		WebElement checkP = drive.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		checkP.click();

		WebElement clkP = drive
				.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));
		clkP.click();

		Alert alert3 = drive.switchTo().alert();
		Thread.sleep(2000);
		alert3.sendKeys("Raja Rajan");
		Thread.sleep(2000);
		alert3.accept();

	}
}
