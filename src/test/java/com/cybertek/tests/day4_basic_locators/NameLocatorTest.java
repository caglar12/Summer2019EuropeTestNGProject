package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NameLocatorTest {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement fullnameInput = driver.findElement(By.name("full_name"));

        fullnameInput.sendKeys("Mike Smith");

        WebElement email = driver.findElement(By.name("email"));

        email.sendKeys("secret@gmail.com");

        WebElement clickButton = driver.findElement(By.name("wooden_spoon"));

        clickButton.click();

        WebElement messageElement = driver.findElement(By.name("signup_message"));

        String actualMessage = messageElement.getText();

        String expectedMessage = "Thank you for signing up. Click the button below to return to the home page.";

        System.out.println(actualMessage.equals(expectedMessage)?true:false);
            System.out.println("expeceted message"+expectedMessage);
            System.out.println("actual message"+actualMessage);

            driver.quit();
        }


    }

