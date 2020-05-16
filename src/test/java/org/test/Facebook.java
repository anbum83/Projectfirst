package org.test;

import java.sql.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	static WebDriver driver;
	
	@BeforeClass
	
	public static void beforeclass() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\eclipse-workspace\\MavenSample\\Browser\\chromedriver.exe");

		driver=new ChromeDriver();
		
	}
	
	@AfterClass
	
	public static void afterclass() {
	
	driver.quit();	
		
	}
	
	
	
	@Test
	
	public void test() {
	
		driver.get("https://adactin.com/HotelApp/");
		
	}
	
	
	@Test
	public void test1() {
	
		WebElement txtUsername = driver.findElement(By.id("username"));
		
		txtUsername.clear();
		txtUsername.sendKeys("anbum7783");
		
		WebElement txtPassword = driver.findElement(By.id("password"));
		txtPassword.clear();
		txtPassword.sendKeys("anbum@7783");
		
		WebElement btnLogin = driver.findElement(By.id("login"));
		btnLogin.click();
		
			}
	
	@Test
	
	public void test2() {
	WebElement txtLocation = driver.findElement(By.id("location"));
	
	Select s=new Select(txtLocation);
	s.selectByValue("Sydney");
	
	WebElement txtHotel = driver.findElement(By.id("hotels"));
	
	Select h=new Select(txtHotel);
	h.selectByValue("Hotel Creek");
	
	WebElement txtRoom = driver.findElement(By.id("room_type"));
	Select r=new Select(txtRoom);
	r.selectByValue("Standard");
	
	WebElement txtRoomType = driver.findElement(By.id("room_nos"));
	Select rt=new Select(txtRoomType);
	rt.selectByValue("2");
	
	WebElement checkIn = driver.findElement(By.id("datepick_in"));
	checkIn.clear();
	checkIn.sendKeys("10/05/2020");
	
	
	WebElement checkOut = driver.findElement(By.id("datepick_out"));
	checkOut.clear();
	checkOut.sendKeys("12/05/2020");
	
	WebElement adultRoom = driver.findElement(By.id("adult_room"));
	Select ar=new Select(adultRoom);
	ar.selectByValue("2");
	
	WebElement childRoom = driver.findElement(By.id("child_room"));
	Select cr=new Select(childRoom);
	cr.selectByValue("1");
	
	
	WebElement btnSearch = driver.findElement(By.id("Submit"));
	btnSearch.click();
	
		}
	
	@Test
	
	public void test3() {
		WebElement radioBtn = driver.findElement(By.id("radiobutton_0"));
		
		radioBtn.click();
		
		WebElement contBtn = driver.findElement(By.id("continue"));

		contBtn.click();
		
			}
	
	@Test
	
	public void test4() {
		WebElement fname = driver.findElement(By.id("first_name"));
		fname.sendKeys("Reed");
		
		WebElement lname = driver.findElement(By.id("last_name"));
		lname.sendKeys("Asherman");
		
		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys("32, Mount Road, Sydney");
		
		WebElement cardno = driver.findElement(By.id("cc_num"));
		cardno.clear();
		cardno.sendKeys("1234567891012136");
		
		WebElement cardtype = driver.findElement(By.id("cc_type"));
		Select ct=new Select(cardtype);
		ct.selectByValue("VISA");
		
		WebElement cardexpiry = driver.findElement(By.id("cc_exp_month"));
		Select ce=new Select(cardexpiry);
		ce.selectByValue("3");
		
		WebElement carddate = driver.findElement(By.id("cc_exp_year"));
		Select cd=new Select(carddate);
		cd.selectByValue("2022");
		
		WebElement cvvno = driver.findElement(By.id("cc_cvv"));
		cvvno.clear();
		cvvno.sendKeys("123");
		
		WebElement bookBtn = driver.findElement(By.id("book_now"));	
		bookBtn.click();
				
	}
	
	@Test
	
	public void test5() throws InterruptedException {
		
		Thread.sleep(7000);
		WebElement orderNo = driver.findElement(By.id("order_no"));
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
		Object str = js.executeScript("return arguments[0].getAttribute('value')",orderNo );
		
		System.out.println(str);
		
	}
	
	
}
