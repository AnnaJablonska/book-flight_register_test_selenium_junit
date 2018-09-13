import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.RegisterPage;
import utils.User;

import java.util.concurrent.TimeUnit;

public class RegisterPageTest {

    private WebDriver driver;
    private String pageUrl = "http://newtours.demoaut.com/index.php";
    private Faker faker;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver",
                "src/test/resources/drivers/chromedriver.exe");
        pageUrl = "http://newtours.demoaut.com/mercuryregister.php";
        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(pageUrl);
    }

    @Test
    public void canOpenRegisterPage() {
        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.open();
        Assert.assertTrue( registerPage.isAt() );
    }

    @Test
    public void userCanRegister(){
        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.open();
        registerPage.isAt();
        User user = new User();
        registerPage.registerNewIndividualUser(user);
    }



    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        if(driver!=null){
            driver.quit();
        }
        driver = null;
    }

}

