package TrHomeworkPOM.runner;

import TrHomeworkPOM.driver.Driver;
import TrHomeworkPOM.pages.HomePage;
import TrHomeworkPOM.pages.LoginPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

public class TrendyolLoginTest extends Driver {
    private static final Logger log = LoggerFactory.getLogger(TrendyolLoginTest.class);
    HomePage homePage;
    LoginPage loginPage;

    @Test
    public void loginTest(){
        homePage = new HomePage();
        loginPage = new LoginPage();
        homePage.clickPopUp();
        homePage.hoverOverGirisYapIcon();
        homePage.clickGirisYapIconUnderLoginDropDown();
        loginPage.typeEPostaOnEPostaField();
        loginPage.typeEPostaOnSifreField();
        loginPage.clickGirisYapButton();
    }

}
