import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.RegisterPage;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class HomePageTest {

    private WebDriver driver;
    private String pageUrl = "http://newtours.demoaut.com/index.php";
    private Faker faker;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver",
                "src/test/resources/drivers/chromedriver.exe");
        pageUrl = "http://newtours.demoaut.com/index.php";
        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(pageUrl);
    }

    @Test
    public void clickOnRegisterButton(){
        driver.findElement(By.linkText("REGISTER")).click();
        Assert.assertEquals("Wrong url", "http://newtours.demoaut.com/mercuryregister.php",
                driver.getCurrentUrl());
    }
//    @After
//    public void takeScreenshot() throws IOException {
//        File outputFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(outputFile, new File("C:\\Users\\Start\\Desktop\\" + faker.name()));
//    }


    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        if(driver!=null){
            driver.quit();
        }
        driver = null;
    }

}


