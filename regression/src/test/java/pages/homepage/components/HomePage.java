package pages.homepage.components;

import com.framework.core.PropertyReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class HomePage extends BasePage {
    By hamburgerMenu = By.id("nav-hamburger-menu");
    By tvAppliencesElectronicsItem = By.xpath("//a[@data-menu-id='9']");


    private TVAudioAndCameraComponent tvAudioAndCameraComponent;



    private FilterComponent filterComponent;
    public HomePage(WebDriver driver) {
        super(driver);
        this.tvAudioAndCameraComponent = new TVAudioAndCameraComponent(driver);
        this.filterComponent = new FilterComponent(driver);

    }

    public FilterComponent getFilterComponent() {
        return filterComponent;
    }
    public TVAudioAndCameraComponent getTvAudioAndCameraComponent() {
        return tvAudioAndCameraComponent;
    }
    public HomePage getHomePage(){
        driver.get(PropertyReader.getPropertyFromFile("url"));
        return this;
    }
    public HomePage openHamburgerMenu() {
        click(hamburgerMenu);
        return this;
    }
    public HomePage scrollToTVAppliencesElectronics(){
        WebElement element = driver.findElement(tvAppliencesElectronicsItem);
        scrollToElement(element);
        return this;
    }

    public HomePage expandTVAppliencesElectronics() {
        click(tvAppliencesElectronicsItem);
        return this;
    }



}
