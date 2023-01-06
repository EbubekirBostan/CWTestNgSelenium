package clarusway.tests;

import clarusway.utilities.BaseCrossBrowserTest;
import clarusway.utilities.JSUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Day06_C02_JSUtil extends BaseCrossBrowserTest {
    //Go to URL: https://www.amazon.com/
    //Scroll in to view Amazon Ignite WebElement.
    //Scroll up search area WebElement.
    //Then flashing the background color.
    @Test
    public void test() throws InterruptedException {
        JSUtils.driver = driver;
        driver.get("https://www.amazon.com/");
        WebElement ignite = driver.findElement(By.partialLinkText("Amazon Ignite"));
        JSUtils.scrollIntoViewJS(ignite);
        Thread.sleep(4000);
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        JSUtils.scrollAllUpByJS();
        Thread.sleep(4000);
        JSUtils.flash(searchBox);
        Thread.sleep(4000);



    }
}
