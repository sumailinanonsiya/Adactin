package com;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Adactin2 {

	public static void main(String[] args) throws InterruptedException, IOException {
     System.setProperty("Webdriver.gecko.driver","C:\\Users\\lenovo\\eclipse-workspace\\Selenium\\Driver\\geckodriver.exe");
     
     WebDriver driver=new FirefoxDriver();
     driver.get("https://adactinhotelapp.com/");
     driver.manage().window().maximize();
     
     WebElement userName = driver.findElement(By.id("username"));
     userName.sendKeys("Anonsiya");
     
     WebElement passWord = driver.findElement(By.name("password"));
     passWord.sendKeys("sumailin@06");
     
     WebElement login = driver.findElement(By.id("login"));
     login.click();
     
     WebElement location = driver.findElement(By.name("location"));
     Select area=new Select( location);
     area.selectByIndex(3);
     
     WebElement hotel = driver.findElement(By.name("hotels"));
     Select hotelName=new Select(hotel);
     hotelName.selectByValue("Hotel Cornice");
     
     WebElement hotelType = driver.findElement(By.id("room_type"));
     Select typeOfHotel=new Select(hotelType);
     typeOfHotel.selectByVisibleText("Deluxe");
     
     WebElement number = driver.findElement(By.name("room_nos"));
     Select countOfRooms=new Select(number);
     countOfRooms.selectByIndex(2);
     
     WebElement inTimeDate = driver.findElement(By.id("datepick_in"));
     inTimeDate.clear();
     inTimeDate.sendKeys("26/6/2023");
     
     WebElement outTimeDate = driver.findElement(By.name("datepick_out"));
     outTimeDate.clear();
     outTimeDate.sendKeys("29/6/2023");
     
     WebElement adult = driver.findElement(By.id("adult_room"));
     Select adultMembers=new Select(adult);
     adultMembers.selectByIndex(2);
     
     WebElement children = driver.findElement(By.name("child_room"));
     Select childrenCount=new Select(children);
     childrenCount.selectByValue("2");
     
     
     WebElement submit = driver.findElement(By.id("Submit"));
     submit.click();
     
     WebElement radioButton = driver.findElement(By.name("radiobutton_0"));
     radioButton.click();
     
      driver.findElement(By.id("continue")).click();
      
      WebElement firstName = driver.findElement(By.name("first_name"));
      firstName.sendKeys("Sumailin");
      
      WebElement lastName = driver.findElement(By.id("last_name"));
      lastName.sendKeys("Anonsiya");
      
      WebElement address = driver.findElement(By.name("address"));
      address.sendKeys("27,Karambakudi,Pudukkottai,622 302");
      
      WebElement ccNum = driver.findElement(By.id("cc_num"));
      ccNum.sendKeys("6785438956973696");
      
      WebElement ccType = driver.findElement(By.name("cc_type"));
      Select ccInVisa=new Select(ccType);
      ccInVisa.selectByVisibleText("VISA");
      
      WebElement ccExMonth = driver.findElement(By.id("cc_exp_month"));
      Select expMonth=new Select(ccExMonth);
      expMonth.selectByVisibleText("March");
      
      WebElement ccExYr = driver.findElement(By.name("cc_exp_year"));
      Select expYear=new Select(ccExYr);
      expYear.selectByIndex(16);
      
      WebElement cvv = driver.findElement(By.id("cc_cvv"));
      cvv.sendKeys("597");
      
      TakesScreenshot tk=(TakesScreenshot)driver;
      File source = tk.getScreenshotAs(OutputType.FILE);
      File destination=new File("C:\\Users\\lenovo\\eclipse-workspace\\Selenium\\ScreenShot\\booking.png");
      FileHandler.copy(source, destination);
      
      WebElement bookNow = driver.findElement(By.name("book_now"));
      bookNow.click();
      Thread.sleep(8000);
            
      WebElement scroolDown = driver.findElement(By.name("search_hotel"));
      JavascriptExecutor js=( JavascriptExecutor)driver;
      js.executeScript("arguments[0].scrollIntoView(true)", scroolDown);
      WebElement orderNo = driver.findElement(By.name("order_no"));
      String attributeValue = orderNo.getAttribute("value");
      System.out.println("Order no:"+ attributeValue);
	}

}
