package testCase;

import org.junit.jupiter.api.*;
import pages.LoginPage;
import pages.MainPage;
import pages.OnboardPage;
import session.Session;

import static util.EnvConfig.*;

public class LoginTest {
    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();
    OnboardPage onboardPage = new OnboardPage();

    @BeforeEach
    public void openBrowser(){
        Session.getInstance().getBrowser().get(HOST);
    }

    @Test
    @Order(1)
    public void loginTest(){
        //mainPage.freeTestButton.click();
        loginPage.emailTxtBox.setText(USER);
        loginPage.pwdTxtBox.setText(PWD);
        loginPage.loginButton.click();
        Assertions.assertTrue(onboardPage.continueButton.isControlDisplayed(),"ERROR no se inicio sesion");
    }

    @AfterEach
    public void closeBrowser(){
        Session.getInstance().closeBrowser();
    }
}
