package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ElectronicsPage extends Utility {

    By electronics = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']");
    By cellPhone = By.xpath("//a[@title='Show products in category Cell phones']");
    By getCellPhone= By.xpath("//h1[text()='Cell phones']");
    By listView = By.xpath("//a[@title='List']");
    By clickOnNokia = By.linkText("Nokia Lumia 1020");
    By getTextNokiaLumia = By.xpath("//h1[text()='Nokia Lumia 1020']");
    By getTextPriceOfNokia = By.id("price-value-20");
    By getClearQuantity = By.xpath("//input[@id='product_enteredQuantity_20']");
    By addToCart = By.id("add-to-cart-button-20");
    By getTextOfShoppingCart = By.xpath("//p[@class='content']");
    By clickOnClose = By.xpath("//span[@class='close']");
    By mouseHoverOnCart = By.xpath("//span[@class='cart-label']");
    By clickOnCartButton = By.xpath("//button[@class='button-1 cart-button']");
    By getShoppingCartText = By.xpath("//h1[text()='Shopping cart']");
    By getQuntityText = By.xpath("//div[@class='product-quantity']//input");
    By getSubTotalPriceText = By.xpath("//span[@class='product-subtotal']");
    By clickInTermsOfServices = By.id("termsofservice");
    By clickOnCheckOut = By.id("checkout");
    By getWelcomeSignInText = By.xpath("//h1[text()='Welcome, Please Sign In!']");
    By clickOnRegister = By.xpath("//button[normalize-space()='Register']");
    By getRegisterText = By.xpath("//h1[text()='Register']");
    By clickRadioButtonMale = By.xpath("//input[@id='gender-male']");
    By enterFirstNameField = By.xpath("//input[@id='FirstName']");
    By enterLastNameField = By.xpath("//input[@id='LastName']");
    By clickOnDayTab = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[1]");
    By clickOnMonthTab = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[2]");
    By clickOnYearTab = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[3]");
    By enterEmailField = By.xpath("//input[@id='Email']");
    By clickOnNewsLetter = By.xpath("//input[@id='Newsletter']");
    By enterPasswordField = By.xpath("//input[@id='Password']");
    By enterConfirmPasswordField = By.xpath("//input[@id='ConfirmPassword']");
    By clickOnRegisterButton = By.xpath("//button[@id='register-button']");
    By getTextRegisteredSuccessfully = By.xpath("//div[text()='Your registration completed']");
    By clickOnContinueButton = By.xpath("//div[@class='buttons']//a)");
    By getShoppingCartTextForCellPhones = By.xpath("//h1[text()='Shopping cart']");
    By clickOnIAgreeBox = By.id("termsofservice");
    By clickOnCheckOutForCellPhones = By.id("checkout");
    By selectCountry = By.id("BillingNewAddress_CountryId");
    By selectCity = By.id("BillingNewAddress_City");
    By selectAddress = By.id("BillingNewAddress_Address1");
    By selectPostCode = By.id("BillingNewAddress_ZipPostalCode");
    By selectPhoneNumber = By.id("BillingNewAddress_PhoneNumber");
    By clickOnContinueButtonForCellPhones = By.name("save");
    By clickOnRdioButtonNextDay = By.id("shippingoption_2");
    By pressContinueButton = By.cssSelector(".button-1.shipping-method-next-step-button");
    By selectRadioButtonCreditCard = By.id("payementmethod_1");
    By clickOnCreditCardType = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[4]/div[2]/div[1]/button[1]");
    By selectVisaFromDropDown = By.id("CreditCardType");
    By fillCardHolderName = By.id("CardholderName");
    By fillCardNumber = By.id("CardNumber");
    By selectExpiry = By.id("ExpireYear");
    By enterCardCode = By.id("CardCode");
    By getClickOnContinueBtn = By.xpath("//button[@class='button-1 payment-info-next-step-button']");
    By getTextFromCreditCard = By.xpath("//span[contains(text(),'Credit Card')]");
    By getTextFromShipingMethod = By.xpath("//li[@class='shipping-method']//span[contains(text(),'2nd Day Air')]");
    By getTotalAmtText =  By.xpath("//span[@class='product-subtotal']");
    By clickOnConfirm = By.xpath("//button[text()='Confirm']");
    By getTextThankYou = By.xpath("//h1[text()='Thank you']");
    By getMessegeAsOrderProccessed = By.xpath("//strong[text()='Your order has been successfully processed!']");
    By clickOnContinueTab = By.xpath("//button[@class='button-1 order-completed-continue-button']");
    By getTextWelcomeToStore = By.xpath("//h2[text()='Welcome to our store']");
    By clickOnLogOut = By.xpath("//a[text()='Log out']");
    //String getUrlText = driver.getCurrentUrl();




    public void mouseHoverAndClickOnElectronics() {

        mouseHoverToElementAndClick(electronics);
    }
    public void mouseHoverAndClickOnCellPhones(){
        mouseHoverToElementAndClick(cellPhone);
    }
    public String getCellPhoneText(){
        return getTextFromElement(getCellPhone);
    }
    public void clickOnListViewTab(){
        clickOnElement(listView);
    }
    public void productNameNokiaLumia1020(){
        clickOnElement(clickOnNokia);
    }
    public String getTextNokiaLumia1020(){
        return getTextFromElement(getTextNokiaLumia);
    }
    public String getPrice$349(){
        return getTextFromElement(getTextPriceOfNokia);
    }
    public void selectQuantitiTo2(){
        selectByVisibleTextFromDropDown(getClearQuantity,"2");
    }
    public void clickOnAddToCart(){
        clickOnElement(addToCart);
    }
    public String getMessegeTheProductHasBeenAddedToYourShoppingCart(){
        return getTextFromElement(getTextOfShoppingCart);
    }
    public void clickToClose(){
        clickOnElement(clickOnClose);
    }
    public void mouseHoverShoppingCart(){
        mouseHoverToElement(mouseHoverOnCart);
    }
    public void clickOnGoToCart(){
        clickOnElement(clickOnCartButton);
    }
    public String getTextMessegeShoppingCart(){
        return getTextFromElement(getShoppingCartText);
    }
    public String getQuantityTextFromShoppingCart(){
        return getTextFromElement(getQuntityText);
    }
    public String getTotalPriceText(){
        return getTextFromElement(getSubTotalPriceText);
    }
    public void clickOnCheckBox(){
        clickOnElement(clickInTermsOfServices);
    }
    public void clickOnCheckOut(){
        clickOnElement(clickOnCheckOut);
    }
    public String getTextWelcomePleaseSignIn(){
        return getTextFromElement(getWelcomeSignInText);
    }
    public void clickOnRegisterTab(){
        clickOnElement(clickOnRegister);
    }
    public String getRegisterTxt(){
        return getTextFromElement(getRegisterText);
    }
    public void clickOnradioButtonMale(){
   clickOnElement(clickRadioButtonMale);
    }
    public void enterDetailsInToFields(){
        sendTextToElement(enterFirstNameField,"Chetan");
        sendTextToElement(enterLastNameField,"Patel");
    }
    public void enterDOBAndEmailIdTotheFields(){
        sendTextToElement(clickOnDayTab,"15");
        sendTextToElement(clickOnMonthTab,"12");
        sendTextToElement(clickOnYearTab,"1980");
        sendTextToElement(enterEmailField,"chetan123@gmail.com");

    }
    public void clickOnNewsLetterBox(){
        clickOnElement(clickOnNewsLetter);
    }
    public void enterPasswordAndConfirmPassword(){
        sendTextToElement(enterConfirmPasswordField,"Chetan123");
        sendTextToElement(enterConfirmPasswordField,"Chetan123");
    }
    public void clickOnRegisterButton(){
        clickOnElement(clickOnRegisterButton);

    }
    public String getTextYourRegistrationCompleted(){
        return getTextFromElement(getTextRegisteredSuccessfully);
    }
    public void clickOnContinueTab(){
        clickOnElement(clickOnContinueButton);
    }
    public String getTextShoppingCart(){
        return getTextFromElement(getShoppingCartTextForCellPhones);
    }
    public void clickOnCheckBoxTermsAndClickOnCheckOut(){
        clickOnElement(clickOnIAgreeBox);
        clickOnElement(clickOnCheckOutForCellPhones);
    }
    public void fillMandatoryFields(){
        sendTextToElement(selectCountry,"United Kingdom");
        sendTextToElement(selectCity,"London");
        sendTextToElement(selectAddress,"123 Sutton");
        sendTextToElement(selectPostCode,"sm11qr");
        sendTextToElement(selectPhoneNumber,"0741111111");

    }
    public void clickOnContinueBtn(){
        clickOnElement(clickOnContinueButtonForCellPhones);
    }
    public void clickOnradioButtonNextDay(){
        clickOnElement(clickOnRdioButtonNextDay);
    }
    public void clickOnContinue1(){
        clickOnElement(pressContinueButton);
    }
    public void clickOnRadioButtonCreditCard(){
        clickOnElement(clickOnCreditCardType);
    }

    public void selectCreditCardFromDropDown(){
        selectByValueFromDropDown(selectVisaFromDropDown,"Visa");
    }
    public void fillTheDetails(){
        sendTextToElement(fillCardHolderName,"ChetanPatel");
        sendTextToElement(fillCardNumber,"5413330089010640");
    }
    public void selectExpireYear(){
        selectByVisibleTextFromDropDown(selectExpiry,"2026");
    }
    public void enterCardCode(){
        sendTextToElement(enterCardCode,"123");
    }
    public void clickOnCONTINUEButton(){
        clickOnElement(getClickOnContinueBtn);
    }
    public String getTextFromCreditCardMethod(){
        return getTextFromElement(getTextFromCreditCard);
    }
    public String getTextFromShipingMethod(){
        return getTextFromElement(getTextFromShipingMethod);
    }
    public String getTotalPriceTxt() {
        return getTextFromElement(getTotalAmtText);
    }

    public void clickOnConfirm(){
        clickOnElement(clickOnConfirm);
    }
    public String getThankYouText(){
        return getTextFromElement(getTextThankYou);
    }
    public String getTextMessegeOrderHasBeenProcessed(){
        return getTextFromElement(getMessegeAsOrderProccessed);

    }
    public void clickOnContinue(){
        clickOnElement(clickOnContinueTab);
    }
    public String getTextWelcomeToOurStore(){
        return getTextFromElement(getTextWelcomeToStore);
    }
    public void clickOnLogOutLink(){
        clickOnElement(clickOnLogOut);
    }
//    public String getTextURL(){
//        return driver.getCurrentUrl();
//    }



}