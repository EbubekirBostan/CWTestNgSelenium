package clarusway.tests;

import clarusway.utilities.BaseCrossBrowserTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Task07 extends BaseCrossBrowserTest {
       /*
Open the site http://opencart.abstracta.us/
Using the Search function do it with Data Provider for Mac, iPad and Samsung
     */

    @Test(dataProvider = "data")
    public void arama(String key) {
        driver.get("http://opencart.abstracta.us/");
        WebElement search = driver.findElement(By.name("search"));
        search.sendKeys(key+ Keys.ENTER);
    }
    @DataProvider
    public Object[][] data(){
        return new Object[][]{
                {"Mac"},
                {"iPad"},
                {"Samsung"}
        };
    }
}
