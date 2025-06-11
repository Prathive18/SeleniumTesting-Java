package com.adactin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdactinhotelBooking_ {

    public static void main(String[] args) throws InterruptedException {
//        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://adactinhotelapp.com/");
        driver.manage().window().maximize();

        
        driver.findElement(By.id("username")).sendKeys("prathive007");
        driver.findElement(By.id("password")).sendKeys("Prathive@1234");
        driver.findElement(By.id("login")).click();

        
        new Select(driver.findElement(By.id("location"))).selectByVisibleText("Sydney");
        new Select(driver.findElement(By.id("hotels"))).selectByVisibleText("Hotel Sunshine");
        new Select(driver.findElement(By.id("room_type"))).selectByVisibleText("Deluxe");
        new Select(driver.findElement(By.id("room_nos"))).selectByVisibleText("1 - One");

        driver.findElement(By.id("datepick_in")).clear();
        driver.findElement(By.id("datepick_in")).sendKeys("20/06/2025");
        driver.findElement(By.id("datepick_out")).clear();
        driver.findElement(By.id("datepick_out")).sendKeys("22/06/2025");

        new Select(driver.findElement(By.id("adult_room"))).selectByVisibleText("2 - Two");
        new Select(driver.findElement(By.id("child_room"))).selectByVisibleText("1 - One");

        driver.findElement(By.id("Submit")).click();

        
        driver.findElement(By.id("radiobutton_0")).click();
        driver.findElement(By.id("continue")).click();

        
        driver.findElement(By.id("first_name")).sendKeys("Prathive");
        driver.findElement(By.id("last_name")).sendKeys("KC");
        driver.findElement(By.id("address")).sendKeys("Chennai, India");
        driver.findElement(By.id("cc_num")).sendKeys("1234567812345678");

        new Select(driver.findElement(By.id("cc_type"))).selectByVisibleText("VISA");
        new Select(driver.findElement(By.id("cc_exp_month"))).selectByVisibleText("June");
        new Select(driver.findElement(By.id("cc_exp_year"))).selectByVisibleText("2026");
        driver.findElement(By.id("cc_cvv")).sendKeys("123");

        driver.findElement(By.id("book_now")).click();

        Thread.sleep(5000);
        WebElement orderNo = driver.findElement(By.id("order_no"));
        System.out.println("Booking Successful! Order No: " + orderNo.getAttribute("value"));

        driver.quit();
    }
}

           
