package KarobarApp;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class karobar_page_object {
    WebDriver driver;
    WebDriverWait wait;

    public karobar_page_object(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10); // Initialize WebDriverWait
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//*[@id=\"app\"]/div/section/div[2]/div/div[1]/div/div[1]/div/div/div/input")
    WebElement loginNumber;
    public void EnterIntoLogin(String value){
        wait.until(ExpectedConditions.elementToBeClickable(loginNumber)).sendKeys(value);
    }
    @FindBy(xpath="//*[@id=\"app\"]/div/section/div[2]/div/div[1]/div/button")
    WebElement loginButton;

    public void clickOnLoginButton() {
        wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
    }
    @FindBy(xpath="//*[@id=\"app\"]/div/section/form/div/div[1]/div/div[1]/div/div/div[1]/input")
    WebElement OTP;

    public void EnterOTP(String value) {
        wait.until(ExpectedConditions.elementToBeClickable(OTP)).sendKeys(value);

    }
    @FindBy(xpath="//*[@id=\"business_0\"]")
    WebElement Test;
    public void clickOnTest() {
        wait.until(ExpectedConditions.elementToBeClickable(Test)).click();

    }
    @FindBy(xpath = "//*[@id=\"app\"]/aside/div[3]/ul[1]/li[2]/a/span[2]")
    WebElement partiesOption;
    public void ClickOnpartiesOption(){
        wait.until(ExpectedConditions.elementToBeClickable(partiesOption)).click();
    }
    @FindBy(xpath = "//*[@id=\"app\"]/div[2]/section[1]/div/div[2]/div/div/button/span[2]")
    WebElement AddParties;
    public void ClickOnAddParties(){
        wait.until(ExpectedConditions.elementToBeClickable(AddParties)).click();
    }
    @FindBy(xpath="//*[@id=\"app\"]/div[2]/div[1]/div[2]/div/section/div[1]/div/div[1]/div/div/span/span/i")
    WebElement ChoosePhoto;
    public void ChoosePhoto(String filePath){
        wait.until(ExpectedConditions.elementToBeClickable(ChoosePhoto)).sendKeys(filePath);
    }
    @FindBy(xpath = "//*[@id=\"app\"]/div[2]/div[1]/div[2]/div/section/div[1]/div/div[2]/div/div[1]/div/div/input")
    WebElement Name;
    public void EnterIntoName(String value){
        wait.until(ExpectedConditions.elementToBeClickable(Name)).sendKeys(value);
        Name.clear();
    }

    @FindBy(xpath = "//*[@id=\"app\"]/div[2]/div[1]/div[2]/div/section/div[1]/div/div[2]/div/div[2]/div/div/input")
    WebElement PhoneNumber;
    public void EnterIntoPhoneNumber(String value){
        wait.until(ExpectedConditions.elementToBeClickable(PhoneNumber)).sendKeys(value);
    }
    @FindBy(xpath = "//*[@id=\"app\"]/div[2]/div[1]/div[2]/div/section/div[1]/div/div[2]/div/div[3]/div/div/div[1]/button")
    WebElement party;
    public void ClickOnPartyType(){
        wait.until(ExpectedConditions.elementToBeClickable(party)).click();
    }
    @FindBy(xpath = "//*[@id=\"app\"]/div[2]/div[1]/div[2]/div/section/div[1]/div/div[2]/div/div[3]/div/div/div[3]/div/a[1]/div/div/h3")
    WebElement PartyType;
    public void SelectPartyType(){
        wait.until(ExpectedConditions.elementToBeClickable(PartyType)).click();
    }
    @FindBy(xpath = "//*[@id=\"app\"]/div[2]/div[1]/div[2]/div/section/div[2]/div/div[1]/div/div/div/div[2]")
    WebElement opening;
    public void ClickOnOpeningBalance(){
        wait.until(ExpectedConditions.elementToBeClickable(opening)).click();
    }
    @FindBy(xpath = "//*[@id=\"app\"]/div[2]/div[1]/div[2]/div/section/div[2]/div/div[1]/div/div/div/div[2]/div[3]/div/a[1]")
    WebElement OpeningBalance;
    public void SelectOpeningBalance(){
        wait.until(ExpectedConditions.elementToBeClickable(OpeningBalance)).click();
    }
    @FindBy(xpath = "//*[@id=\"app\"]/div[2]/div[1]/div[2]/div/section/div[2]/div/div[2]/div/div/input")
    WebElement dateData;

    public void selectDate(String date) {
        wait.until(ExpectedConditions.elementToBeClickable(dateData)).click();

    }
    @FindBy(xpath = "//*[@id=\"app\"]/div[2]/div[1]/div[2]/div/section/div[3]/div/div[1]/div/div/input")
    WebElement Address;
    public void EnterAddress(String value){
        wait.until(ExpectedConditions.elementToBeClickable(Address)).sendKeys(value);
    }
    @FindBy(xpath = "//*[@id=\"app\"]/div[2]/div[1]/div[2]/div/section/div[3]/div/div[2]/div/div/input")
    WebElement EmailAddress;
    public void EnterEmailAddress(String value){
        wait.until(ExpectedConditions.elementToBeClickable(EmailAddress)).sendKeys(value);
    }
    @FindBy(xpath = "//*[@id=\"app\"]/div[2]/div[1]/div[2]/div/section/div[3]/div/div[3]/div/div/input")
    WebElement PANNumber;
    public void EnterPANNumber(String value){
        wait.until(ExpectedConditions.elementToBeClickable(PANNumber)).sendKeys(value);
    }


    @FindBy(xpath = "//*[@id=\"app\"]/div[2]/div[1]/div[2]/div/footer/div/button[2]")
    WebElement SaveButton;
    public void ClickOnSaveButton(){
        wait.until(ExpectedConditions.elementToBeClickable(SaveButton)).click();
    }



    @FindBy(xpath = "//*[@id=\"app\"]/div[2]/section[2]/div/div[1]/article/div[1]/div/div/div[1]/div/input")
    WebElement Search;
    public void EnterIntoSearch(String value){
        wait.until(ExpectedConditions.elementToBeClickable(Search)).sendKeys(value);
    }
    @FindBy(xpath = "//*[@id=\"app\"]/div[2]/section[2]/div/div[2]/div[1]/article/div[2]/div/button[1]")
    WebElement Edit;
    public void ClickOnEdit(){
        wait.until(ExpectedConditions.elementToBeClickable(Edit)).click();
    }

    @FindBy(xpath = "//*[@id=\"app\"]/div[2]/div[1]/div[2]/div/section/div[1]/div/div[2]/div/div[1]/div/div/input")
    WebElement NameEdit;

    public void EditName(String newValue) {
        WebElement nameInput = wait.until(ExpectedConditions.elementToBeClickable(NameEdit));
        nameInput.clear();
        nameInput.sendKeys(""); // Ensuring focus is retained on the input field
        nameInput.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE)); // Select and delete existing text
        nameInput.sendKeys(newValue);
    }
    @FindBy(xpath = "//*[@id=\"app\"]/div[2]/div[1]/div[2]/div/footer/div/button")
    WebElement Save;
    public void ClickOnSave(){
        wait.until(ExpectedConditions.elementToBeClickable(Save)).click();
    }
    @FindBy(xpath = "//*[@id=\"app\"]/div[2]/section[2]/div/div[2]/div[1]/article/div[2]/div/button[2]")
    WebElement delete;
    public void ClickOnDelete(){
        wait.until(ExpectedConditions.elementToBeClickable(delete)).click();
    }
    @FindBy(xpath = "//*[@id=\"app\"]/div[2]/div[1]/div[2]/div/footer/div/button[2]")
    WebElement Confirmdelete;
    public void ClickOnConfirmDelete(){
        wait.until(ExpectedConditions.elementToBeClickable(Confirmdelete)).click();
    }
    @FindBy(xpath = "//*[@id=\"app\"]/div[2]/section[2]/div/div[2]/div[2]/header/div/button/span")
    WebElement PartyStatement;
    public void ClickOnPartyStatement(){
        wait.until(ExpectedConditions.elementToBeClickable(PartyStatement)).click();
    }
    @FindBy(xpath = "//*[@id=\"app\"]/div[2]/section[1]/div/div[2]/div/div/button[2]/span/span[2]")
    WebElement Download;
    public void ClickOnDownload(){
        wait.until(ExpectedConditions.elementToBeClickable(Download)).click();
    }
    @FindBy(xpath = "//*[@id=\"app\"]/div[2]/section[2]/div/div[1]/article/div[3]/ul[2]/li")
    WebElement SelectParty;
    public void ClickSelectParty(){
        wait.until(ExpectedConditions.elementToBeClickable(SelectParty)).click();
    }

}
