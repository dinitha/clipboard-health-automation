package tests;

import com.framework.core.BaseTest;
import org.testng.annotations.Test;
import pages.enums.SortBy;
import pages.homepage.components.*;
import utils.ExtentTestManager;

public class InitialTest extends BaseTest {

    @Test
    public void amazonTest(){
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






    }

}
