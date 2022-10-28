package tests;

import com.framework.core.BaseTest;
import org.testng.annotations.Test;
import pages.*;
import utils.ExtentTestManager;

public class InitialTest extends BaseTest {

    @Test
    public void amazonTest(){
        ExtentTestManager.startTest("standardUserCheckoutTest","verify checkout process");

       HomePage homePage = new HomePage(getDriver());
       homePage.getHomePage()
               .openHamburgerMenu();





    }

}
