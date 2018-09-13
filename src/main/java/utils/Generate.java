package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Generate {

    public String email(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://generator.email/");
        String emailTekst = driver.findElement(By.id("email_ch_text")).getText();
        driver.quit();
        return emailTekst;
    }

}
