package pages.homepage.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class TVAudioAndCameraComponent extends BasePage {
    private By televisionMenuItem =By.linkText("Televisions");

    public TVAudioAndCameraComponent(WebDriver driver) {
        super(driver);
    }


    public TVAudioAndCameraComponent clickTelevision(){
        click(televisionMenuItem);
        return this;
    }


}
