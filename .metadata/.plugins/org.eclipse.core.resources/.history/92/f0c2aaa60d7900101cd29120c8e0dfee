package com.selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Form {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");
		
		WebElement element = driver.findElement(By.cssSelector("#app>div>div>div.home-body>div>div:nth-child(2)"));
		js.executeScript("arguments[0].scrollIntoView(true)", element);
		Thread.sleep(500);
		element.click();
		
		 driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div/div[2]/div/ul/li")).click();
		 
		 js.executeScript("window.scrollBy(0, 300)");
		 Thread.sleep(1000);
		 
		 //Text Box
		 driver.findElement(By.id("firstName")).sendKeys("First Name");
		 Thread.sleep(1000);
		 driver.findElement(By.id("lastName")).sendKeys("Last Name");
		 Thread.sleep(1000);
		 driver.findElement(By.id("userEmail")).sendKeys("last.first@gmail.com");
		 Thread.sleep(1000);
		 
		 //Radio Button
		 driver.findElement(By.cssSelector("label[for='gender-radio-1']")).click();
		 boolean rb = driver.findElement(By.id("gender-radio-1")).isEnabled();
		 System.out.println("Radio button selection: "+ rb);
		 
		 driver.findElement(By.id("userNumber")).sendKeys("8328036874");
		 
		 //Date Picker
		 WebElement dob = driver.findElement(By.id("dateOfBirthInput"));
		 js.executeScript("arguments[0].scrollIntoView(true)", dob);
		 dob.click();
		 
		 //DropDown
		 WebElement year = driver.findElement(By.className("react-datepicker__year-select"));
		 Select s = new Select(year);
		 s.selectByVisibleText("1998");
		 Thread.sleep(1500);
		 
		 WebElement month = driver.findElement(By.className("react-datepicker__month-select"));
		 s = new Select(month);
		 s.selectByVisibleText("November");
		 Thread.sleep(1500);
		 
		 driver.findElement(By.cssSelector("#dateOfBirth>div.react-datepicker__tab-loop>div.react-datepicker-popper>div>div>div.react-datepicker__month-container>div.react-datepicker__month>div:nth-child(3)>div.react-datepicker__day.react-datepicker__day--020")).click();
		 
		 //Check Box
		 driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']")).click();
		 driver.findElement(By.cssSelector("label[for='hobbies-checkbox-3']")).click();
		 boolean c1 = driver.findElement(By.id("hobbies-checkbox-1")).isSelected();
		 if(c1==true) {
			 System.out.println("Checkbox selected");
		 }
		 
		 //Upload
		 WebElement file = driver.findElement(By.id("uploadPicture"));
		 file.sendKeys("C:\\Users\\Sree Ram\\Desktop\\lion.jpg");
		 
		 js.executeScript("window.scrollBy(0, 200)");
		 driver.findElement(By.id("submit")).click();
	}
}

