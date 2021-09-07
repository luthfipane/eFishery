package com.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class PropertiesData {
    public static WebDriver driver;
    public static void setBrowser(String baseUrl){
        System.setProperty("webdriver.chrome.driver", locationdriver);
        driver = new ChromeDriver();
        driver.get(baseUrl);
    }

    public static void wait(String path,int time) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(path)));
    }
    


    // Properties Data String
    static String uname = "fabelio.test@gmail.com"; 
    static String password = "fabelio123"; 
    static String incorrectpassword = "fabelio12345";
    static String url = "https://music.youtube.com" ;
    static String band = "the 1975";
    static String locationdriver = "/Users/luthfipane/Downloads/chromedriver";
    


    // Element Xpath
    static String btn_signIn = "//*[@id='right-content']/a" ;
    static String txt_email = "//*[@id='identifierId']" ;
    static String txt_password = "//input[@type='password']" ;
    static String btn_next = "//span[text()='Next']" ;
    static String btn_search = "//span[text()='Search']";
    static String txt_band = "//input[@placeholder='Search']";
    static String txt_song = "//*[text()='Somebody Else']";
    static String txt_lyrics = "//*[@id='tabsContent']/tp-yt-paper-tab[2]";
}