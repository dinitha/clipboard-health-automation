package tests;

import com.framework.core.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import constants.Constants;
import enums.SortBy;
import pages.HomePage;
import pages.homepage.components.*;
import utils.ExtentTestManager;

import java.util.logging.Logger;

public class InitialTest extends BaseTest {
    static Logger log = Logger.getLogger(InitialTest.class.getName());
    @Test(description = "The test to verify the second highest expensive television's properties")
    public void verifyTelevisionTest(){
        ExtentTestManager.startTest("Amazon Test","verify amazon feature");

        new HomePage(getDriver())
                .getHomePage()
               .openHamburgerMenu()
               .scrollToTVAppliencesElectronics()
               .expandTVAppliencesElectronics();
        new TVAudioAndCameraComponent(getDriver())
               .clickTelevision();
       new FilterComponent(getDriver())
               .scrollToBrands();
       new BrandsComponent(getDriver())
               .clickSamsungCheckbox();
       new SortByComponent(getDriver())
               .SelectSortOption(String.valueOf(SortBy.HIGHTOLOW.getIndex()));
        new SearchResultComponent(getDriver())
                .clickSearchResultItem(2)
                .switchToNewWindow();
        new SelectedItemComponent(getDriver())
                .scrollToAboutThisItem();
        String Expected = new SelectedItemComponent(getDriver()).getAboutThisItemText();
        Assert.assertEquals(Expected, Constants.ABOUT_THIS_ITEM);
        String aboutThisItemDescription = new SelectedItemComponent(getDriver()).getAboutThisItemDescription();
        log.info(aboutThisItemDescription);




    }

}
