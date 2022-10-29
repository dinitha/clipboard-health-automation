package pages.homepage.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class FilterComponent extends BasePage {

    private By brandsLabel =By.xpath("//span[text()='Brands']");
    public FilterComponent(WebDriver driver) {
        super(driver);
    }

    public FilterComponent scrollToBrands(){

        WebElement element = driver.findElement(brandsLabel);
        scrollToElement(element);
        return this;
    }


}
