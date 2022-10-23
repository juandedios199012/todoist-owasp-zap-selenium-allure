package control;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import session.Session;

public class Control {
    protected WebElement control;
    protected By locator;

    public Control (By locator){
        this.locator=locator;
    }

    protected void findControl(){
        this.control= Session.getInstance().getBrowser().findElement(this.locator);
    }

    public void click(){
        this.findControl();
        this.control.click();
    }

    public boolean isControlDisplayed(){
        try {
            this.findControl();
            return this.control.isDisplayed();
        }catch (Exception e){
            return false;
        }
    }

}
