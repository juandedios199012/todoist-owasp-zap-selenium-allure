package testCase;

import io.qameta.allure.Description;
import model.Login;
import org.junit.jupiter.api.*;
import pages.LoginPage;
import pages.OnboardPage;
import session.Session;

import static util.EnvConfig.*;

public class LoginTest {
    LoginPage loginPage = new LoginPage();
    OnboardPage onboardPage = new OnboardPage();
    Login login =new Login();

    @BeforeEach
    public void openBrowser(){
        Session.getInstance().getBrowser().get(HOST);
    }

    @Test
    @Order(1)
    public void loginTest(){
        loginPage.emailTxtBox.setText(login.getUser());
        loginPage.pwdTxtBox.setText(login.getPwd());
        loginPage.loginButton.click();
        Assertions.assertTrue(onboardPage.educationButton.isControlDisplayed(),"ERROR no se inicio sesion");
    }

    @AfterEach
    public void closeBrowser(){
        Session.getInstance().closeBrowser();
    }
}
