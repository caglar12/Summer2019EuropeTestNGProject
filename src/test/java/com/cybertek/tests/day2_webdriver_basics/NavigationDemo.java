package com.cybertek.tests.day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationDemo {

    public static void main(String[] args) throws InterruptedException {


        //METHOD 1
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        Thread.sleep(5000);

        //METHOD 2
        driver.navigate().to("https://www.facebook.com");

        //goes back to previous page
        driver.navigate().back();

        Thread.sleep(3000);

        //goes forward
        driver.navigate().forward();

        //refresh web page
        driver.navigate().refresh();



    }
}
