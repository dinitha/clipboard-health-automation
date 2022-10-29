package pages.homepage.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class SearchResultComponent extends BasePage {

    private String searchResultItemButton = "//img[@data-image-index='%s']";
    public SearchResultComponent(WebDriver driver) {
        super(driver);
    }

    public SearchResultComponent clickSearchResultItem(int index){
        click(By.xpath(String.format(searchResultItemButton,String.valueOf(index))));
        return this;
    }


}
