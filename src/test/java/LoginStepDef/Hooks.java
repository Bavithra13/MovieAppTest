package LoginStepDef;

import LoginMethodPages.HomePage;
import LoginMethodPages.LoginPage;
import LoginMethodPages.PopularPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {

    private static WebDriver driver;
    //public LoginPage loginPage;
    //public HomePage homePage;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\bavit\\OneDrive\\Documents\\java tools\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        //loginPage = new LoginPage(driver);
        //homePage = new HomePage(driver);
        //PopularPage = new PopularPage(driver);
    }

   @After
    public void tearDown() {
        driver.quit();
    }

    public static WebDriver getDriver() {
        return driver;
    }
}