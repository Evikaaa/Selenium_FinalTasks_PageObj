package pl.Evikaaa.Task_1_and_2.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilterClothesPage {
    private WebDriver driver;

    public FilterClothesPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "//*[contains(text(),'Hummingbird printed sweater')]")
    private WebElement clickHPSweater;

    public void  chooseHPSweater() {clickHPSweater.click();}
}
