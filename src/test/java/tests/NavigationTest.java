package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.LoginPage;

public class NavigationTest {
    WebDriver driver;
    LoginPage loginPage;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
    }

    @Test
    public void testLoginPageTitle() {
        loginPage.open();
        Assert.assertTrue(driver.getTitle().contains("Practice Test Login"));
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
