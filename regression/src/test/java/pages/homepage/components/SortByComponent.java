package pages.homepage.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;
import pages.enums.SortBy;

public class SortByComponent extends BasePage {

    String sortByDropdownOptions = "s-result-sort-select_";
        By sortByDropdown = By.xpath("//span[text()='Sort by:']");

    public SortByComponent(WebDriver driver) {
        super(driver);
    }

    public SortByComponent SelectSortOption(String sortBy){
        click(sortByDropdown);
        System.out.println("append: " +sortByDropdownOptions.concat(sortBy));
        click(By.id((sortByDropdownOptions.concat(sortBy))));
        return this;

    }

}
