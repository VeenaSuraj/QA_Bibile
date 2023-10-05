package StepDefenisions;


import PageClass.BaseClass;
import PageClass.LoginPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStepDef
{
 WebDriver driver;
 LoginPage loginpage =new LoginPage(null);

 @Given("User is on the login page")
 public void user_is_on_the_login_page() {
  loginpage.browserLaunch();
 }
}
