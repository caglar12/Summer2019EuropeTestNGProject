package com.cybertek.tests.day1_basic_navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basic_navigation {

    public static void main(String[] args) {
        //setting up web driver
        WebDriverManager.chromedriver().setup();

        //creating an object
        WebDriver driver = new ChromeDriver();

        //open browser
        driver.get("http://amazon.com");

        //get the title and print it
        System.out.println(driver.getTitle());



    }
}
