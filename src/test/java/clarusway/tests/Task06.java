package clarusway.tests;

import clarusway.utilities.BaseCrossBrowserTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Task06 extends BaseCrossBrowserTest {
     /*
    Go to URL: https://opensource-demo.orangehrmlive.com/
    Login with negative credentilas by Data Provider.
    Then assert that ‘’Invalid credentials’’ is displayed
     */

    @Test(dataProvider = "data")
    public void test(String name,String password) {
        driver.get("https://opensource-demo.orangehrmlive.com/");
        WebElement nameInput = driver.findElement(By.name("username"));
        nameInput.sendKeys(name);
        WebElement passInput = driver.findElement(By.name("password"));
        passInput.sendKeys(password);
        WebElement button = driver.findElement(By.xpath("//div/button"));
        button.click();
        WebElement message = driver.findElement(By.xpath("//p[.='Invalid credentials']"));
        Assert.assertTrue(message.isDisplayed());
    }
    @DataProvider
    public Object[][] data(){

        return new Object[][]{
                {"kullanıcı","125489"}
        };
    }
}
