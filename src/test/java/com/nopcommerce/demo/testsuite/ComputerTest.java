package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.CompluterPage;
import com.nopcommerce.demo.testbased.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ComputerTest extends BaseTest {

    CompluterPage computerPage = new CompluterPage();

    @Test
    public void verifyProductArrangeInAlphaBaticalOrder() throws InterruptedException {
        computerPage.clickOnComputersMenu();
        computerPage.clickOnDesktop();
        computerPage.selectValueFromDropBox();
        computerPage.arrangeInDecendingOrder();
        String expectedText = "Z To A";
        String actualText =computerPage.arrangeInDecendingOrder();
        Assert.assertEquals(actualText,expectedText,"Text not displayed");


    }
    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() {

        computerPage.clickOnComputersMenu();
        computerPage.clickOnDesktop();
        computerPage.selectValueFromDropBox();
        computerPage.arrangeInAcendingOrder();
        computerPage.addToCart();
        String expectedText = "Build your own computer";
        String actualText = computerPage.getBuildYourOwnComputerText();
        Assert.assertEquals(actualText, expectedText, "Text not displayed");
        computerPage.selectComputerFeatures();
        computerPage.clickOnComputerFeatures();
        String expectedPriceText = "$1,475.00";
        String actualPriceText = computerPage.getPriceText();
        Assert.assertEquals(actualPriceText, expectedPriceText, "Text Not Displayed");
        computerPage.clickOnCart();
        String expectedCartText = "The product has been added to your shopping cart";
        String actualCartText = computerPage.getTextMessegeProductHasBeenAdded();
        Assert.assertEquals(actualCartText, expectedCartText, "Text Not Displayed");
        computerPage.clickOnCloseBox();
        computerPage.mouseHoverToShoppingCart();
        computerPage.clickGoToCart();
        String expectedShoppingCartText = "Shopping cart";
        String actualShoppingCartText = computerPage.getTextMessegeShopingCart();
        Assert.assertEquals(actualShoppingCartText, expectedShoppingCartText, "Text Not Displayed");
        computerPage.clickOnQuantityUp();
        String expectedTotalPriceText = "$2,950.00";
        String actualTotalPriceText = computerPage.getTextTotalPrice();
        Assert.assertEquals(actualTotalPriceText, expectedTotalPriceText, "Text not displayed");
        computerPage.clickOnCheckBox();
        computerPage.clickOnCheckOut();
        String expectedWelcomeText = "Welcome, Please Sign In!";
        String actualWelcomeText = computerPage.getTextWelcomeSignIn();
        Assert.assertEquals(actualWelcomeText, expectedWelcomeText, "Text Not displayed");
        computerPage.clickOnCheckOutAsGuest();
        computerPage.fillMandatoryFields();
        computerPage.selectCountry();
        computerPage.fillContactDetails();
        computerPage.clickOnContinueButton();
        computerPage.clickOnRadioButtonNextDayAir();
        computerPage.clickOnContinue2Button();
        computerPage.clickOnRadioButtonCreditCard();
        computerPage.selectMasterCard();
        computerPage.fillCardDetails();
        computerPage.selectExpiryOfTheCard();
        computerPage.fillCreditCardCode();
        computerPage.selectClickOnContinue3();
        String expectedPaymentTypeText = "Credit Card";
        String actualPaymentType= computerPage.getTextPaymentMethodIsCreditCard();
        Assert.assertEquals(actualPaymentType,expectedPaymentTypeText,"Text is not displayed");
        String expectedShippingType = "Next Day Air";
        String actualShippingType = computerPage.getTextShipingMethod();
        Assert.assertEquals(actualShippingType,expectedShippingType,"Text is not displayed");
        String expectedTotalTextPrice = "$2,950.00";
        String actualTotalTextPrice = computerPage.getTotalText();
        Assert.assertEquals(actualTotalTextPrice,expectedTotalTextPrice,"Text is not displayed");
        computerPage.clickOnConfirm();
        String expectedTotalamount = "Thank You";
        String actualTotalamount = computerPage.getTextTotalAmount();
        Assert.assertEquals(actualTotalamount,expectedTotalamount,"text not displayed");
        String expectedProccessedText = "Your order has been successfully processed!";
        String actualProccessedText = computerPage.getTextOrderIsSuccessfullyProcessed();
        Assert.assertEquals(actualProccessedText,expectedProccessedText,"Text not displayed");
        computerPage.selectContinue3();
        String expectedWelcomeTxt = "Welcome to our store";
        String actualWelcomeTxt = computerPage.getWelcomeText();
        Assert.assertEquals(actualWelcomeTxt,expectedWelcomeTxt,"Text not displayed");









    }





}
