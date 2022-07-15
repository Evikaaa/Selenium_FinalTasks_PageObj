package pl.Evikaaa.Task_1_and_2.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {

    private WebDriver driver;

    public MyAccountPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy (css = "a[title='Addresses']")
    private WebElement addAddressBtn;

    public void createAddress() {addAddressBtn.click();}

    @FindBy (xpath = "//a[@id='history-link']")
    private WebElement ordersHistoryBtn;

    public void checkHistoryOrder() {ordersHistoryBtn.click();}

}
