package pl.Evikaaa.Task_1_and_2.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MyOrderHistoryPage {

    private WebDriver driver;

    public MyOrderHistoryPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }



}




//    @When("I go to order history and chceck my order is {string}")
//    public void iGoToOrderHistoryAndChceckMyOrderIs(String message) {
//        driver.findElement(By.xpath("//span[contains(text(),'Cirilla Riannon')]")).click();
//        driver.findElement(By.xpath("//a[@id='history-link']")).click();
//        String alertMessage = driver.findElement(By.xpath("//span[@class='label label-pill bright']")).getText();
//        Assert.assertEquals(message, alertMessage);
//    }
//
//
//}

