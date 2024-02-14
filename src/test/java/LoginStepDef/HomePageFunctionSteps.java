package LoginStepDef;

import LoginMethodPages.HomePage;
import LoginMethodPages.LoginPage;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class HomePageFunctionSteps {
    WebDriver driver = Hooks.getDriver();
    HomePage homePage;

 @Then("I am heading name check")
 public void IAmHeadingNameCheck(){
     homePage = new HomePage(driver);
     String[] expected = {"Trending Now", "Originals"};
     for (int i = 0; i < 2; i++) {
         Assert.assertEquals(homePage.GetMainLogoText(i), expected[i], "Username not matching");
          }
     //Test whether the play button is displayed or not
     Assert.assertTrue(homePage.GetMethodPlayButton().isEnabled(), "Play Button Visible");
     //Test whether the Movies are displayed, in the corresponding movies sections
     int size = 20;
     Assert.assertEquals(homePage.GetMovieSection(), size, "Movie Section Visible");
     System.out.println(homePage.GetMovieSection());

     //Test the Contact Us Section
     for (int i = 0; i < 4; i++) {
         Assert.assertTrue(homePage.GetFoodSection(i).isDisplayed(), "Footer Section is not displayed");
         break;
     }
     Assert.assertEquals(homePage.GetContactSection(), "Contact Us");

     int size1=10;
     Assert.assertEquals(homePage.GetTrendingMovie (),size1,"Movies not visible");
     System.out.println(homePage.GetTrendingMovie ());

     int size2=10;
     Assert.assertEquals(homePage.GetOriginalMovie (),size2,"Movies not visible");
     System.out.println(homePage.GetOriginalMovie ());







 }








}
