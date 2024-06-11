package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompluterPage extends Utility {

By computerMenu = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']");
By desktop = By.xpath("//a[@title='Show products in category Desktops'][normalize-space()='Desktops']");
By valueFromDropBox = By.id("products-orderby");
By decendingOrder = By.cssSelector(".product-title");
By addToCart = By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]");
By getAcendingOrder = By.id("products-orderby");
By getBuildYourComputerText = By.cssSelector("div.master-wrapper-page:nth-child(7) div.master-wrapper-content div.master-column-wrapper div.center-1 div.page.product-details-page div.page-body div:nth-child(1) div.product-essential div.overview div.product-name > h1:nth-child(1)");
By selectFeature1 = By.id("product_attribute_1");
By selectFeature2 = By.id("product_attribute_2");
By selectFeature3 = By.xpath("//input[@id='product_attribute_3_7']");
By selectFeature4 = By.id("product_attribute_4_9");
By selectFeature5 = By.id("product_attribute_5_12");
By getPrice       = By.id("price-value-1");
By getAddToCart  = By.id("add-to-cart-button-1");
By getTextProductAdded = By.xpath("//p[text()='The product has been added to your ']");
By closeMessegeBar= By.xpath("//span[@class='close']");
By hoverToShoppingCart = By.xpath("//span[text()='Shopping cart']");
By clickOnShoppingCart = By.xpath("//span[@class='cart-label']");
By getTextShoppingCart = By.xpath("//span[@class='cart-label']");
By updateShoppingCart = By.xpath("//div[@class='quantity up']");
By getTotalPrice = By.xpath("//span[@class='value-summary']//strong[text()='$2,950.00']");
By clickOnTermsAndServices = By.id("termsofservice");
By clickOnCheckOut = By.xpath("//button[@id='checkout']");
By getWelcomeSignInText = By.xpath("//h1[text()='Welcome, Please Sign In!']");
By clickOnCheckOutAsGuest = By.xpath("//button[@class='button-1 checkout-as-guest-button']");
By enterFirstNameField = By.id("BillingNewAddress_FirstName");
By enterLastNameField = By.id("BillingNewAddress_LastName");
By enterEMailIdField = By.id("BillingNewAddress_Email");
By selectCountryFromDropDown = By.id("BillingNewAddress_Country");
By enterCityField = By.id("BillingNewAddress_City");
By enterAddressField = By.id("BillingNewAddress_Address1");
By enterPostcodeField = By.id("BillingNewAddress_ZipPostalCode");
By enterPhoneNumber = By.id("BillingNewAddress_PhoneNumber");
By clickOnContinue1 = By.xpath("//button[@class='button-1 new-address-next-step-button']");
By clickOnShipingOption =  By.id("shippingoption_1");
By clickOnContinue2 = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");
By clickOnPaymentMethod = By.id("paymentmethod_1");
By selectMasterCard = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[4]/div[2]/div[1]/button[1]");
By enterCardHolderName = By.id("CardholderName");
By enterCardNumber = By.id("CardNumber");
By selectExpiryMonthFromDropDown = By.id("ExpireMonth");
By selectExpiryYearFromDropDown = By.id("ExpireYear");
By enterCardCode = By.id("CardCode");
By clickOnContinue3 = By.xpath("(//button[@class='button-1 payment-info-next-step-button'])[1]");
By getTextPayementMethod = By.xpath(("//span[normalize-space()='Payment Method:']" +By.xpath("//span[normalize-space()='Credit Card']")));
By getTextShipingMethod = By.xpath("//span[normalize-space()='Shipping Method:']" + By.xpath("//span[normalize-space()='Next Day Air']"));
By clickOnConfirmButton = By.xpath("//button[text()='Confirm']");
By getThankYouText = By.xpath("//h1[text()='Thank you']");
By getSuccessfullyProccesedText = By.xpath("//strong[text()='Your order has been successfully processed!']");
By clickOnContinue4 = By.xpath("//button[@class='button-1 order-completed-continue-button']");
By getWelcomeText = By.xpath("//h2[text()='Welcome to our store']");





    public void clickOnComputersMenu(){
    clickOnElement(computerMenu);
}
public void clickOnDesktop(){
    clickOnElement(desktop);
}
public void selectValueFromDropBox(){
    selectByValueFromDropDown(valueFromDropBox,"6");
}
public String arrangeInDecendingOrder(){
    List<WebElement> beforeFilterProductNames = driver.findElements(By.cssSelector(".product-title"));
    List<String> beforeFilterProductNamesList = new ArrayList<>();
    for (WebElement p : beforeFilterProductNames) {
        beforeFilterProductNamesList.add(p.getText());
    }
    Collections.sort(beforeFilterProductNamesList);
    Collections.reverse(beforeFilterProductNamesList);
    selectByValueFromDropDown(By.id("products-orderby"), "6");

selectByContainsTextFromListOfElements(decendingOrder,"6");

    List<WebElement> afterFilterProductNames = getListOfElements(By.className("product-title"));
    List<String> afterFilterProductNamesList = new ArrayList<>();
    for (WebElement s : afterFilterProductNames) {
        afterFilterProductNamesList.add(s.getText());

    }
    return getTextFromElement(decendingOrder);

    }
    public String arrangeInAcendingOrder(){
    selectByValueFromDropDown(getAcendingOrder,"5");
        return getTextFromElement(getAcendingOrder);
    }
    public void addToCart(){
    mouseHoverToElementAndClick(addToCart);
    }
    public String getBuildYourOwnComputerText(){
        return getTextFromElement(getBuildYourComputerText);
    }
    public void selectComputerFeatures(){
        selectByValueFromDropDown(selectFeature1,"1");
        selectByValueFromDropDown(selectFeature2,"5");
    }
    public void clickOnComputerFeatures(){
        clickOnElement(selectFeature3);
        clickOnElement(selectFeature4);
        clickOnElement(selectFeature5);
    }
    public String getPriceText(){
        return getTextFromElement(getPrice);
    }
    public void clickOnCart(){
        clickOnElement(getAddToCart);
    }
    public String getTextMessegeProductHasBeenAdded(){
        return getTextFromElement(getTextProductAdded);
    }
    public void clickOnCloseBox(){
        clickOnElement(closeMessegeBar);
    }
 public void mouseHoverToShoppingCart(){
        mouseHoverToElement(hoverToShoppingCart);
 }
 public void clickGoToCart(){
        clickOnElement(clickOnShoppingCart);
 }
 public String getTextMessegeShopingCart(){
        return getTextFromElement(getTextShoppingCart);
 }
 public void clickOnQuantityUp(){
        clickOnElement(updateShoppingCart);
 }
 public String getTextTotalPrice(){
        return getTextFromElement(getTotalPrice);
 }
 public void clickOnCheckBox(){
        clickOnElement(clickOnTermsAndServices);
 }
 public void clickOnCheckOut(){
        clickOnElement(clickOnCheckOut);
 }
 public String getTextWelcomeSignIn(){
        return getTextFromElement(getWelcomeSignInText);
 }
 public void clickOnCheckOutAsGuest(){
        clickOnElement(clickOnCheckOutAsGuest);
 }
 public void fillMandatoryFields(){
        sendTextToElement(enterFirstNameField,"Chetan");
        sendTextToElement(enterLastNameField,"Patel");
        sendTextToElement(enterEMailIdField,"chetan123@gmail.com");
 }
 public void selectCountry(){
        selectByValueFromDropDown(selectCountryFromDropDown,"United Kingdom");
 }
 public void fillContactDetails(){
        sendTextToElement(enterCityField,"London");
        sendTextToElement(enterAddressField,"Sutton");
        sendTextToElement(enterPostcodeField,"sw172hw");
        sendTextToElement(enterPhoneNumber,"07412286722");
 }
 public void clickOnContinueButton(){
        clickOnElement(clickOnContinue1);
 }
 public void clickOnRadioButtonNextDayAir(){
        clickOnElement(clickOnShipingOption);
 }
 public void clickOnContinue2Button(){
        clickOnElement(clickOnContinue2);
 }
 public void clickOnRadioButtonCreditCard(){
        clickOnElement(clickOnPaymentMethod);
 }
 public void selectMasterCard(){
        clickOnElement(selectMasterCard);
 }
 public void fillCardDetails(){
        sendTextToElement(enterCardHolderName,"Chetan Patel");
        sendTextToElement(enterCardNumber,"5413330089010640");
 }
 public void selectExpiryOfTheCard(){
        selectByValueFromDropDown(selectExpiryMonthFromDropDown,"10");
        selectByValueFromDropDown(selectExpiryYearFromDropDown,"2026");
 }
 public void fillCreditCardCode(){
        sendTextToElement(enterCardCode,"123");
 }
 public void selectClickOnContinue3(){
        clickOnElement(clickOnContinue3);
 }
 public String getTextPaymentMethodIsCreditCard(){

        return getTextFromElement(getTextPayementMethod);
 }
 public String getTextShipingMethod(){
        return getTextFromElement(getTextShipingMethod);
 }
 public String getTotalText(){
        return getTextFromElement(getThankYouText);
 }
 public void clickOnConfirm(){
        clickOnElement(clickOnConfirmButton);
 }
 public String getTextTotalAmount(){
        return getTextFromElement(getThankYouText);
 }
 public String getTextOrderIsSuccessfullyProcessed(){
        return getTextFromElement(getSuccessfullyProccesedText);
 }
 public void selectContinue3(){
        clickOnElement(clickOnContinue4);
 }
 public String getWelcomeText(){
        return getTextFromElement(getWelcomeText);
 }



}


