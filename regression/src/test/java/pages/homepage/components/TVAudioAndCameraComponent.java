package pages.homepage.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class TVAudioAndCameraComponent extends BasePage {


    By televisionItem =By.linkText("Televisions");

    public TVAudioAndCameraComponent(WebDriver driver) {
        super(driver);
    }


    public TVAudioAndCameraComponent clickTelevision(){
        click(televisionItem);
        return this;
    }


}
