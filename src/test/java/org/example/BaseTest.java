package org.example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    DriverManager driverManager =new DriverManager();

    @BeforeMethod
    public void setup(){//calling the method to open a browser
        driverManager.openBrowser();
    }
    @AfterMethod
    public void tearDown() {// calling the browser to close the web browser
        driverManager.closeBrowser();
    }
}
