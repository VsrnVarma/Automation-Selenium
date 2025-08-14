package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");
		
		WebElement element = driver.findElement(By.cssSelector("#app>div>div>div.home-body>div>div:nth-child(3)"));
		js.executeScript("arguments[0].scrollIntoView(true)", element);
		Thread.sleep(500);
		element.click();
		
		js.executeScript("window.scrollBy(0, 20)");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div/div[3]/div/ul/li[2]")).click();
		Thread.sleep(1000);
		
		WebElement ab = driver.findElement(By.id("alertButton"));
		js.executeScript("arguments[0].scrollIntoView(true)", ab);
		ab.click();
		Thread.sleep(800);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		
		driver.findElement(By.id("confirmButton")).click();
		driver.switchTo().alert().dismiss();
		Thread.sleep(1000);
		
		driver.findElement(By.id("promtButton")).click();
		driver.switchTo().alert().sendKeys("Varma");
		driver.switchTo().alert().accept();
	}

}

