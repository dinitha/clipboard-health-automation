package pages.homepage.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class BrandsComponent extends BasePage {

    By brandsLabel =By.xpath("//span[text()='Brands']");

    By samsungCheckbox = By.linkText("Samsung");
    public BrandsComponent(WebDriver driver) {
        super(driver);
    }

    public BrandsComponent scrollToBrands(){

        WebElement element = driver.findElement(brandsLabel);
        scrollToElement(element);
        return this;
    }

    public BrandsComponent clickSamsungCheckbox(){
        click(samsungCheckbox);
        return this;
    }


}
