package clarusway.tests;

import clarusway.utilities.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Task05 extends BaseTest {
    //Test Case3: Negative Password Test
    //Open page https://practicetestautomation.com/practice-test-login/
    //Type username student into Username field.
    //Type password incorrectPassword into Password field.
    //Puch Submit button.
    //Verify error message is displayed.
    //Verify error message text is Your password is invalid!
    @Test
    public void passwordTest() {
        driver.get("https://practicetestautomation.com/practice-test-login/");
        WebElement login = driver.findElement(By.xpath("(//div/input)[1]"));
        login.sendKeys("student");
        WebElement password = driver.findElement(By.xpath("(//div/input)[2]"));
        password.sendKeys("incorrectPassword");
        WebElement submitButton = driver.findElement(By.xpath("(//button)[3]"));
        submitButton.click();
        WebElement message = driver.findElement(By.className("show"));
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(message.isDisplayed());
        softAssert.assertEquals(message.getText(),"Your password is invalid!");
    }
}
