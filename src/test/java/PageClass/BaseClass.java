package PageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BaseClass
{
    WebDriver driver;

    public void multiBrowser(String browser) {
        if (browser== "Chrome") {
            driver = new ChromeDriver();
            driver.get("//https://tutorialsninja.com/demo/index.php?route=account/login");
            driver.manage().window().maximize();

        } else if (browser == "Edge") {
            driver = new EdgeDriver();
            driver.get("//https://tutorialsninja.com/demo/index.php?route=account/login");

            driver.manage().window().maximize();


        } else if (browser == "Firefox") {
            driver = new FirefoxDriver();
            driver.get("//https://tutorialsninja.com/demo/index.php?route=account/login");

            driver.manage().window().maximize();


        } else if (browser == "Safari") {
            driver = new SafariDriver();
            driver.get("//https://tutorialsninja.com/demo/index.php?route=account/login");

            driver.manage().window().maximize();


        }
        else {
            System.out.println("Invalid Browser");
        }
    }

}
