package PageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
public class LoginPage
    {
        WebDriver driver;

        public LoginPage(WebDriver driver) {
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }
        public void browserLaunch()
        {
            driver=new ChromeDriver();
            driver.get("//https://tutorialsninja.com/demo/index.php?route=account/login");
            driver.manage().window().maximize();
        }
    }
