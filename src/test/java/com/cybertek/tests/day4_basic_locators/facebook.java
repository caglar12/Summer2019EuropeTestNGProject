package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class facebook {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://facebook.com");
        WebElement mail = driver.findElement(By.id("email"));
        mail.sendKeys("edugaterw@gmail.com");
        WebElement password = driver.findElement(By.id("pass"));
        password.sendKeys("Edu2014gate");
        WebElement login = driver.findElement(By.id("u_0_2"));
        login.click();

    }
}
