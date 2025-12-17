package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleClass
{

    public static WebDriver driver;

    @Test
    public void sampleFunction()
    {
        driver = new ChromeDriver();
        driver.get("http://www.google.com");
        driver.close();
    }
}
