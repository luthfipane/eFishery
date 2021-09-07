package com.example;
import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Search extends PropertiesData{
    
    public static void main (String [] Args) throws InterruptedException{ 
        setBrowser(url);
        driver.findElement(By.xpath(btn_search)).click();
        driver.findElement(By.xpath(txt_band)).sendKeys(band,Keys.ENTER);
        wait(txt_song, 3);
        driver.findElement(By.xpath(txt_song)).click();
        wait(txt_lyrics, 7);
        driver.findElement(By.xpath(txt_lyrics)).click();
        List<WebElement> list = driver.findElements(By.xpath(txt_lyrics));
        Assert.assertTrue("Element Not Found", list.size() > 0);
        driver.quit();
    }
    
}
