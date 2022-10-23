package pages;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class LoginPage {
    public TextBox emailTxtBox= new TextBox(By.id("element-0"));
    public TextBox pwdTxtBox= new TextBox(By.id("element-3"));
    public Button loginButton= new Button(By.cssSelector("button[type='submit']"));

    public LoginPage(){}

}
