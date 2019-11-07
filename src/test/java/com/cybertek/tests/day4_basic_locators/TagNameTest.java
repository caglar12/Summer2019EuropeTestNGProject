package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TagNameTest {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement fullnameInput = driver.findElement(By.tagName("input"));
        fullnameInput.sendKeys("Mike Smith with tag name");

        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("mike@gmail.com");

        WebElement singUpButton = driver.findElement(By.tagName("button"));
        singUpButton.click();

        System.out.println(driver.findElement(By.tagName("h3")).getText());

    }
}
