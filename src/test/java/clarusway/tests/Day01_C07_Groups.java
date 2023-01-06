package clarusway.tests;

import org.testng.annotations.Test;

public class Day01_C07_Groups {
    // Bu groups attribute u sayesinde biz istediğimiz grouplara sahip test caselerini özel olarak çalıştırabiliriz.

    @Test(groups = {"smoke", "regression"})
    public void loginTest() {
    }

    @Test(groups = {"regression"})
    public void aboutTest() {
    }

    @Test(groups = {"regression"})
    public void contacTest() {
    }

    @Test(groups = {"regression","smoke"})
    public void registrationTest() {
    }

    @Test(groups = {"regression", "smoke"})
    public void checkoutTest() {
    }
}
