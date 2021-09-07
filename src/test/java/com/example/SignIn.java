package com.example;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class SignIn extends PropertiesData {
    public static void CorrectPassword() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver",locationdriver);
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        driver.findElement(By.xpath(btn_signIn)).click();
        driver.findElement(By.xpath(txt_email)).sendKeys(uname);
        driver.findElement(By.xpath(btn_next)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(txt_password)).sendKeys(password);
        Thread.sleep(2000);
        driver.findElement(By.xpath(btn_next)).click();
        List<WebElement> list = driver.findElements(By.xpath(btn_signIn));
        Assert.assertTrue("Text not found!", list.size() > 0);
        driver.quit();
    }

    public static void InCorrectPassword() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver",locationdriver);
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        driver.findElement(By.xpath(btn_signIn)).click();
        driver.findElement(By.xpath(txt_email)).sendKeys(uname);
        driver.findElement(By.xpath(btn_next)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(txt_password)).sendKeys(incorrectpassword);
        Thread.sleep(2000);
        driver.findElement(By.xpath(btn_next)).click();
        List<WebElement> object = new ArrayList<WebElement>();
        object = driver.findElements(By.xpath(btn_signIn));
        assertEquals(object.size(), 0);
        Thread.sleep(1000);
        driver.quit();
    }

    public static void main (String [] Args) throws InterruptedException{ 
        CorrectPassword();
        InCorrectPassword();
        
        
    
    }
}