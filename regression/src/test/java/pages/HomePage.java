package pages;

import com.framework.core.PropertyReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    By hamburgerMenu = By.id("nav-hamburger-menu");


    public HomePage(WebDriver driver) {
        super(driver);

    }
    public HomePage getHomePage(){
        driver.get(PropertyReader.getPropertyFromFile("url"));
        return this;
    }
    public HomePage openHamburgerMenu() {
        click(hamburgerMenu);
        return this;
    }


}
