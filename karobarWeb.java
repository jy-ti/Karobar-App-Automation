package KarobarApp;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class karobarWeb {
    private static ExtentReports extent;
    WebDriver driver;
    karobar_page_object parties;
    private ExtentTest test;

    @BeforeSuite
    public void initializeReport() {
        String dateTime = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new Date());
        String reportPath = System.getProperty("user.dir") + "/test-output/ExtentReport_" + dateTime + ".html";
        ExtentSparkReporter reporter = new ExtentSparkReporter(reportPath);
        extent = new ExtentReports();
        extent.attachReporter(reporter);
    }

    @BeforeMethod
    public void SetUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Eastpoint\\Desktop\\QA\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        parties = new karobar_page_object(driver);
        driver.get("https://web.karobarapp.com");
        driver.manage().window().maximize();
    }

    @Test
    public void Verify_Login() {
        ExtentTest test = extent.createTest("Verify Login");
        try {
            parties.EnterIntoLogin("9879797979");
            parties.clickOnLoginButton();
            parties.EnterOTP("123456");
            parties.clickOnTest();
            System.out.println("Test Passed");
            test.log(Status.PASS, "Login successful");
        } catch (Exception e) {
            System.out.println("Login Test Failed: " + e.getMessage());
            test.log(Status.FAIL, "Login failed: " + e.getMessage());
        }
    }

    @Test
    public void Verify_Parties() {
        ExtentTest test = extent.createTest("Verify Parties");
        try {
            parties.EnterIntoLogin("9879797979");
            parties.clickOnLoginButton();
            parties.EnterOTP("123456");
            parties.clickOnTest();
            parties.ClickOnpartiesOption();
            parties.ClickOnAddParties();
            // parties.ChoosePhoto("C:/Users/Eastpoint/Pictures/goldstar-shoes-company-1-320.webp");
            parties.EnterIntoName("Jyoti sah");
            parties.EnterIntoPhoneNumber("9879797979");
            parties.ClickOnPartyType();
            parties.SelectPartyType();
            parties.ClickOnOpeningBalance();
            parties.SelectOpeningBalance();
            parties.selectDate("2081-01-13");
            parties.EnterAddress("Katmmandu");
            parties.EnterEmailAddress("jyotisah357@gmail.com");
            parties.EnterPANNumber("1234567890");

            parties.ClickOnSaveButton();
            System.out.println("Test Passed");
            test.log(Status.PASS, "Party added successfully");
        } catch (Exception e) {
            System.out.println("Verify Parties Test Failed: " + e.getMessage());
            test.log(Status.FAIL, "Failed to add party: " + e.getMessage());
        }
    }
    @Test
    public void Verify_Parties_Failed() {
        test = extent.createTest("Verify Parties");
        try {
            driver.get("https://web.karobarapp.com");
            driver.manage().window().maximize();

            // Your test steps here
            parties.EnterIntoLogin("9879797979");
            parties.clickOnLoginButton();
            parties.EnterOTP("123456");
            parties.clickOnTest();
            parties.ClickOnpartiesOption();
            parties.ClickOnAddParties();
            parties.ChoosePhoto("C:/Users/Eastpoint/Pictures/goldstar-shoes-company-1-320.webp");
            parties.EnterIntoName("Jyoti sah");
            parties.EnterIntoPhoneNumber("9879797979");
            parties.ClickOnPartyType();
            parties.SelectPartyType();
            parties.ClickOnOpeningBalance();
            parties.SelectOpeningBalance();
            parties.selectDate("2081-01-13");

            parties.EnterAddress("Katmmandu");
            parties.EnterEmailAddress("jyotisah357@gmail.com");
            parties.EnterPANNumber("1234567890");

            test.log(Status.PASS, "Parties added successfully");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to add party: " + e.getMessage());
            takeScreenshot(test);
        }
    }

    private void takeScreenshot(ExtentTest test) {
        try {
            Thread.sleep(2000);

            TakesScreenshot screenshot = (TakesScreenshot) driver;
            File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
            String screenshotPath = System.getProperty("user.dir") + "/test-output/screenshots/";
            String fileName = System.currentTimeMillis() + ".png";
            File destFile = new File(screenshotPath + fileName);

            new File(screenshotPath).mkdirs();

            FileUtils.copyFile(srcFile, destFile);

            String relativeScreenshotPath = "screenshots/" + fileName;
            test.addScreenCaptureFromPath(relativeScreenshotPath);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }



    @Test
    public void Edit_Parties() {
        ExtentTest test = extent.createTest("Edit Parties");
        try {
            parties.EnterIntoLogin("9879797979");
            parties.clickOnLoginButton();
            parties.EnterOTP("123456");
            parties.clickOnTest();
            parties.ClickOnpartiesOption();
            parties.ClickSelectParty();
            parties.ClickOnEdit();
            parties.EditName("hari sah");
            parties.ClickOnSave();
            System.out.println("Test Passed");
            test.log(Status.PASS, "Party edited successfully");
        } catch (Exception e) {
            System.out.println("Edit Parties Test Failed: " + e.getMessage());
            test.log(Status.FAIL, "Failed to edit party: " + e.getMessage());
        }
    }

    @Test
    public void Delete_Parties() {
        ExtentTest test = extent.createTest("Delete Parties");
        try {
            parties.EnterIntoLogin("9879797979");
            parties.clickOnLoginButton();
            parties.EnterOTP("123456");
            parties.clickOnTest();
            parties.ClickOnpartiesOption();
            parties.EnterIntoSearch("jyoti");
            parties.ClickOnDelete();
            parties.ClickOnConfirmDelete();
            System.out.println("Test Passed");
            test.log(Status.PASS, "Party deleted successfully");
        } catch (Exception e) {
            System.out.println("Delete Parties Test Failed: " + e.getMessage());
            test.log(Status.FAIL, "Failed to delete party: " + e.getMessage());
        }
    }

    @Test
    public void Download_Statement() {
        ExtentTest test = extent.createTest("Download Statement");
        try {
            parties.EnterIntoLogin("9879797979");
            parties.clickOnLoginButton();
            parties.EnterOTP("123456");
            parties.clickOnTest();
            parties.ClickOnpartiesOption();
            parties.EnterIntoSearch("jyoti");
            parties.ClickSelectParty();
            parties.ClickOnPartyStatement();
            parties.ClickOnDownload();
            System.out.println("Test Passed");
            test.log(Status.PASS, "Statement downloaded successfully");
        } catch (Exception e) {
            System.out.println("Download Statement Test Failed: " + e.getMessage());
            test.log(Status.FAIL, "Failed to download statement: " + e.getMessage());
        }
    }

    @AfterSuite
    public void tearDown() {
        extent.flush();
        if (driver != null) {
            driver.quit();
        }
    }
}