package pages;

import control.Button;
import org.openqa.selenium.By;

public class MainPage {
    public Button freeTestButton = new Button(By.xpath("//a[text()='Pruébala gratis']"));
    public MainPage(){}

}