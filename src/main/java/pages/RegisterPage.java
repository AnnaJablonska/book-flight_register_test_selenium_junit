package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.User;

public class RegisterPage {

    private WebDriver driver;
    private String registerPageURL = "http://newtours.demoaut.com/mercuryregister.php";

    public RegisterPage(WebDriver driver){
        this.driver = driver;
    }

    public void open(){
        driver.get(registerPageURL);
    }

    public boolean isAt() {
        return driver.getCurrentUrl().equals(registerPageURL);
    }

    public void registerNewIndividualUser(User user){
        driver.findElement(By.name("firstName")).sendKeys(user.getFirstName());
        driver.findElement(By.name("lastName")).sendKeys(user.getLastname());
        driver.findElement(By.name("phone")).sendKeys(user.getPhoneNumber());
        driver.findElement(By.id("userName")).sendKeys(user.getEmail());
        driver.findElement(By.name("address1")).sendKeys(user.getAddress());
        driver.findElement(By.name("city")).sendKeys(user.getCity());
        driver.findElement(By.name("state")).sendKeys(user.getState());
        driver.findElement(By.name("postalCode")).sendKeys(user.getPostalCode());
        driver.findElement(By.id("email")).sendKeys(user.getUsername());
        driver.findElement(By.name("password")).sendKeys(user.getPassword());
        driver.findElement(By.name("confirmPassword")).sendKeys(user.getPassword());

        driver.findElement(By.name("register")).click();
    }

    public void registerSuccess(){
        if (
        driver.getCurrentUrl().equals("http://newtours.demoaut.com/create_account_success.php")){
            System.out.println("Register Successful");
        } else {
            System.out.println("Something went wrong :/ ");
        }
    }


}
