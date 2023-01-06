package clarusway.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Day01_C09_AssertionTypes {
    @Test
    public void hardAssertion() {
        System.out.println("Assertion oncesi çalışıyor");
        Assert.assertEquals(1,2);
        System.out.println("Assertion sonrası çalışıyor");
    }

    @Test
    public void softAssertion() {
        System.out.println("Soft Assertion oncesi çalışıyor");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(1,2);
        softAssert.assertTrue(true);
        System.out.println("Soft Assertion sonrası çalışıyor");
        softAssert.assertAll("Test Fail");//Method sonunda kesinlikle  çagırılmalı

    }
}
