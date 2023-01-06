package clarusway.tests;

import org.testng.annotations.Test;

public class Day01_C05_Timeout {

    @Test(
            timeOut = 1000
    )
    public void passedTest() {
        System.out.println("1 saniyeden önce çalıştı");
    }

    @Test(
            timeOut = 1000
    )
    public void timeOutTest() throws InterruptedException {
        Thread.sleep(1100);
        System.out.println("1 saniyeden sonra çalıştı");

    }
    @Test(
            timeOut = 1000
    )
    public void timeOutTest2() throws InterruptedException {
        System.out.println("1 saniyeden sonra çalıştı");
        Thread.sleep(1100);
    }
}
