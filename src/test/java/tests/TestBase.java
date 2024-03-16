package tests;

import manage.ApplicationManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;

public class TestBase {
    static ApplicationManager app = new ApplicationManager();
    @BeforeSuite
    public void setUp() {
        app.init();
    }
    @AfterClass
    public void tearDown() {
        app.stop();
    }
}
