package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyConfirmationMessage {

    public static void main(String[] args) {
        //open chrome
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //navigate to link
        driver.get("http://practice.cybertekschool.com/forgot_password");
        //enter an email
        WebElement emailInputBox = driver.findElement(By.name("email"));

        String expectedEmail = "test@gmail.com";
        //send some email
        emailInputBox.sendKeys(expectedEmail);
        //verify that email is displayed in the input box
        //getting text from webelements
        //getText()--> get text from we element
        //getAttribute()--> get value of attributes
        String actualEmail = emailInputBox.getAttribute("value");

        if(expectedEmail.equals(actualEmail)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("expectedEmail = "+expectedEmail);
            System.out.println("actualemail = "+actualEmail);
        }
        //locating retrievePasswordButton using id attribute
        WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"));
        //clicking weblement
        retrievePasswordButton.click();
        //verify confirmation message says "Your e-mail's been sent!"
        String expectedMessage = "Your e-mail's been sent!";

        WebElement messageElement = driver.findElement(By.name("confirmation_message"));

        System.out.println(messageElement);

        String actualMessage = messageElement.getText();
        System.out.println(actualMessage);

        if(expectedMessage.equals(actualMessage)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("expectedMessage = "+expectedMessage);
            System.out.println("actualMessage = "+actualMessage);
        }
        driver.quit();

    }
}
