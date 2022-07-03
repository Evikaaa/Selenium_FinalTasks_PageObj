package pl.Evikaaa.Task_1_and_2.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
    private WebDriver driver;

    public SignInPage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy (xpath = "//input[@name='email']")
    private WebElement inputEmail;

    @FindBy (xpath = "//input[@name='password']")
    private WebElement inputPasswd;

    @FindBy (xpath = "//button[@id='submit-login']")
    private WebElement submitBtn;

    public void logInData(String email, String passwd) {
        inputEmail.clear();
        inputEmail.sendKeys(email);
        inputPasswd.clear();
        inputPasswd.sendKeys(passwd);

        submitBtn.click();
    }
}
