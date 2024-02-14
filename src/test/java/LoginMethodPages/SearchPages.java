package LoginMethodPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SearchPages {
    WebDriver driver;
    WebDriverWait wait;
    By SearchButtonClick = By.className("search-empty-button");
    By ReadyBoxLocator=By.cssSelector("input#search");
    By ClickSearch = By.className("search-button");
    By Venommovieclick = By.cssSelector("a.link-item");
    By MovieTitileName = By.className("movie-title");




    public SearchPages(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void GetSearchButtonClick() {
        wait.until(ExpectedConditions.elementToBeClickable(SearchButtonClick));
        driver.findElement(SearchButtonClick).click();
    }

    public void   MovieNameSelector(String Movie){
        driver.findElement(ReadyBoxLocator).sendKeys(Movie);
    }
   public void ClickButton(){
        driver.findElement(ClickSearch).click();
    }
    public  void ClickOnSearch(String Movie){
        MovieNameSelector(Movie);
        ClickButton();
    }

    public void GetVenommovieclick(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(Venommovieclick));
         driver.findElement(Venommovieclick).click();
    }
    public String GetAvatarName(int index){
        wait.until(ExpectedConditions.visibilityOfElementLocated(MovieTitileName));
        return driver.findElements(MovieTitileName).get(index).getText();
    }


}
