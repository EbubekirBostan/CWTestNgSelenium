package clarusway.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day03_C02_DataProvider {
    @Test(dataProvider = "getData")
    public void test(String name,String email,String pass,int number) {
        System.out.println("name = " + name);
        System.out.println("email = " + email);
        System.out.println("pass = " + pass);
        System.out.println("number = " + number);
    }

    @DataProvider
    public Object[][] getData() {
        Object[][] data= {
                {"Karl","karl@cw","123",1},
                {"Drake","drake@cw","abc",2},
                {"garry","garry@cw","abc123",3},
                {"elly","elly@cw","def123",4},
        };
        return  data;
    }
}
