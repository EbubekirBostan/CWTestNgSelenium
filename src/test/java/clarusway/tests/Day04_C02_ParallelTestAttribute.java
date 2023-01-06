package clarusway.tests;

import org.testng.annotations.Test;

public class Day04_C02_ParallelTestAttribute {
    @Test(
            threadPoolSize = 2,   // testimizin kaç çekirdekte paralel olarak çalışacağını belirler
            invocationCount = 10  // testimizin kaç defa çalıştırlacağını belirler
    )
    public void test() {
        System.out.println("Thread.currentThread().getId() = " + Thread.currentThread().getId());
    }
}
