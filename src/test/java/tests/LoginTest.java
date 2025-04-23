package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.LoginPage;
import pages.DashboardPage;

public class LoginTest {
    WebDriver driver;
    LoginPage loginPage;
    DashboardPage dashboardPage;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        dashboardPage = new DashboardPage(driver);
    }

    @Test
    public void testValidLogin() {
        loginPage.open();
        loginPage.login("student", "Password123");
        Assert.assertTrue(dashboardPage.isDashboardVisible(), "Login failed or dashboard not visible.");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
