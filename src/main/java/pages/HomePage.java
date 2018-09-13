package pages;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {


    private WebDriver driver;
    private String pageUrl = "http://newtours.demoaut.com/mercuryreservation.php";


    public HomePage(WebDriver driver){this.driver=driver;}

    public void open() {
        driver.get(pageUrl);
    }

    public boolean isAt() {
        return driver.getCurrentUrl().equals(pageUrl);
    }

    @Before
    public void openBrowserWithBookingFlightHomePage(String pageToOpen){
        System.setProperty("webdriver.chrome.driver",
                "src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(pageToOpen);
        driver.manage().window().maximize();
    }


}
