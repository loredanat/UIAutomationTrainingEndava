package com.uiautomation;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyFirstTest {
    @Test
    public void navigateToGoogle(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.quit();

    }


   
}
