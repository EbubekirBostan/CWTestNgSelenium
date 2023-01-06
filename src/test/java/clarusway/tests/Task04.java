package clarusway.tests;

import clarusway.utilities.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Task04 extends BaseTest {
    //Test Case2: Negative Username Test
    //Open page https://practicetestautomation.com/practice-test-login/
    //Type username incorrectUser into Username field.
    //Type password Password123 into Password field.
    //Puch Submit button.
    //Verify error message is displayed.
    //Verify error message text is Your username is invalid!


    @Test
    public void negativeTest() {
        driver.get("https://practicetestautomation.com/practice-test-login/");
        WebElement login = driver.findElement(By.xpath("(//div/input)[1]"));
        login.sendKeys("incorrectUser");
        WebElement password = driver.findElement(By.xpath("(//div/input)[2]"));
        password.sendKeys("Password123");
        WebElement submitButton = driver.findElement(By.xpath("(//button)[3]"));
        submitButton.click();
        WebElement message = driver.findElement(By.className("show"));
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(message.isDisplayed());
        softAssert.assertEquals(message.getText(),"Your username is invalid!");

    }
}
