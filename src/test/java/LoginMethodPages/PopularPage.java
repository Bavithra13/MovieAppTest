package LoginMethodPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PopularPage {
    WebDriver driver;
    WebDriverWait wait;
    By WatchMovieSize = By.className("movie-icon-item");
    By MovieIconClick = By.className("link-item");
    By VenomName = By.className("movie-title");




    public PopularPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public int GetWatchMovie() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(WatchMovieSize));
        return driver.findElements(WatchMovieSize).size();

    }
    public void GetMovieIconClick(int index){
        wait.until(ExpectedConditions.visibilityOfElementLocated(MovieIconClick));
         driver.findElements(MovieIconClick).get(index).click();
    }

    public String GetVenomName(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(VenomName));
         return driver.findElement(VenomName).getText();

    }

}
