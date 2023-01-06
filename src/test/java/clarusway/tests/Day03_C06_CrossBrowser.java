package clarusway.tests;

import clarusway.utilities.BaseCrossBrowserTest;
import com.beust.jcommander.Parameter;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day03_C06_CrossBrowser extends BaseCrossBrowserTest {

    @Test
    public void crossBrowserTest() {
        driver.get("https://www.google.com/");
        Assert.assertEquals(driver.getTitle(),"Google");
    }
}
