package pl.Evikaaa.Task_1_and_2.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class YourOrderIsConfirmedPage {

    private WebDriver driver;

    public YourOrderIsConfirmedPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//li[starts-with(.,'Order reference')]")
    public WebElement orderNumber1;

    @FindBy(xpath = "//div[@class='col-xs-5 text-xs-right bold']")
    public WebElement orderPrice1;


    public void TakeScreenshot() throws InterruptedException, AWTException, IOException {
        Thread.sleep(1000);

        Robot r = new Robot();
        String path = "D://Shot.jpg";
        java.awt.Rectangle capture = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());

        BufferedImage Image = r.createScreenCapture(capture);

        ImageIO.write(Image, "jpg", new File(path));

        System.out.println("Screenshot saved");
    }
}

//      path to expected order nr and order price
//    xpath = "//*[contains(text(),'Order reference')]")
//    xpath = "//div[@class='col-xs-5 text-xs-right bold']")


//  wyszukuje fragment tekstu
//  xpath = "//li[starts-with(.,'Order reference')]"