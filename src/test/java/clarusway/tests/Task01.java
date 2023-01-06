package clarusway.tests;

import clarusway.utilities.BaseTest;
import org.testng.annotations.*;

public class Task01  {
   //Create a class.
    //Create 2 test methods.
    //Use TestNG annotations that can be used in the class.
    //Interpret output in console.
   @AfterSuite
   public void afterSuite(){

       System.out.println("After suite calisti");
   }

    @Test
    public void test01(){
        System.out.println("Test 01 calisiyor");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("Before class calisti");
    }

    @Test
    public void test02(){
        System.out.println("Test 02 calisiyor");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("After method calisti");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("Before test calisti");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("After test calisti");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("After class calisti");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before method calisti");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before suite calisti");
    }
}
