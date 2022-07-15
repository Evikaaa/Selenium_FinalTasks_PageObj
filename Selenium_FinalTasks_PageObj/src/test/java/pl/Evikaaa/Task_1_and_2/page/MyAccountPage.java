package pl.Evikaaa.Task_1_and_2.page;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {

    private static WebDriver driver;

    public MyAccountPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public static void createAddress(String page, String url) {
        driver.findElement(By.xpath("//*[contains(@title,'Addresses')]")).click();
        String MyPage = driver.getTitle();
        Assert.assertEquals(page, MyPage);
        String MyUrl = driver.getCurrentUrl();
        Assert.assertEquals(url, MyUrl);
    }

//    @FindBy (css = "//*[contains(@title,'Addresses')]")
//    private WebElement addAddressBtn;
//
//    public void createAddress() {addAddressBtn.click();}

    @FindBy (xpath = "//a[@id='history-link']")
    private WebElement ordersHistoryBtn;

    public void checkHistoryOrder() {ordersHistoryBtn.click();}

}
