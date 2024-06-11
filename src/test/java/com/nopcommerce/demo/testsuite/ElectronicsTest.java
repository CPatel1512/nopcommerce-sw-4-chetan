package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ElectronicsPage;
import com.nopcommerce.demo.testbased.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElectronicsTest extends BaseTest {
    ElectronicsPage electronicsPage = new ElectronicsPage();

    @Test
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully() {

        electronicsPage.mouseHoverAndClickOnElectronics();
        electronicsPage.mouseHoverAndClickOnCellPhones();
        String expectedText = "Cell phones";
        String actualText = electronicsPage.getCellPhoneText();
        Assert.assertEquals(actualText, expectedText, "Text not Matched");
    }

    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {

        electronicsPage.mouseHoverAndClickOnElectronics();
        electronicsPage.mouseHoverAndClickOnCellPhones();
        String expectedText = "Cell phones";
        String actualText = electronicsPage.getCellPhoneText();
        Assert.assertEquals(actualText, expectedText, "Text not Matched");
        electronicsPage.clickOnListViewTab();
        electronicsPage.productNameNokiaLumia1020();
        String expectedNokiaText = "Nokia Lumia 1020";
        String actualNokiaText = electronicsPage.getTextNokiaLumia1020();
        Assert.assertEquals(actualNokiaText,expectedNokiaText,"Text not Matched");
        String expextedPrice = "$349.00";
        String actualPrice= electronicsPage.getPrice$349();
        Assert.assertEquals(actualPrice,expextedPrice,"Price Not Matched");
        electronicsPage.selectQuantitiTo2();
        electronicsPage.clickOnAddToCart();
        String expectedShoppingCartMessege = "The product has been added to your shopping cart";
        String actualShoppingCartMessege = electronicsPage.getMessegeTheProductHasBeenAddedToYourShoppingCart();
        Assert.assertEquals(actualShoppingCartMessege,expectedShoppingCartMessege,"Messege not Matched");
        electronicsPage.clickToClose();
        electronicsPage.mouseHoverShoppingCart();
        electronicsPage.clickOnGoToCart();
        String expectedMessege = "Shopping cart";
        String actualMessege = electronicsPage.getTextMessegeShoppingCart();
        Assert.assertEquals(actualMessege,expectedMessege,"Messege not Matched");
        String expectedQuantity = "2";
        String actualQuantity = electronicsPage.getQuantityTextFromShoppingCart();
        Assert.assertEquals(actualQuantity,expectedQuantity,"Quantity Not Matched");
        String expectedTotalPrice = "$698.00";
        String actualTotalPrice = electronicsPage.getTotalPriceText();
        Assert.assertEquals(actualTotalPrice,expectedTotalPrice,"Total Price Not Matched");
        electronicsPage.clickOnCheckBox();
        electronicsPage.clickOnCheckOut();
        String expectedWelcomeText = "Welcome, Please Sign In!";
        String actualWelcomeText = electronicsPage.getTextWelcomePleaseSignIn();
        Assert.assertEquals(actualWelcomeText,expectedWelcomeText,"Welcome Text Not Matched");
        electronicsPage.clickOnRegisterTab();
        String expectedRegisterText= "Register";
        String actuaqlRegisterText = electronicsPage.getRegisterTxt();
        Assert.assertEquals(actuaqlRegisterText,expectedRegisterText,"Text Not Matched");
        electronicsPage.clickOnradioButtonMale();
        electronicsPage.enterDetailsInToFields();
        Thread.sleep(2000);
        electronicsPage.enterDOBAndEmailIdTotheFields();
        electronicsPage.clickOnNewsLetterBox();
        electronicsPage.enterPasswordAndConfirmPassword();
        Thread.sleep(1000);
        electronicsPage.clickOnRegisterButton();
        String expectedRegistrationText = "Your registration completed";
        String actualRegistrationText = electronicsPage.getTextYourRegistrationCompleted();
        Assert.assertEquals(actualRegistrationText,expectedRegistrationText,"Text not Matched");
        electronicsPage.clickOnContinueTab();
        String expectedShoppingCart = "Shopping cart";
        String actualShoppingCart = electronicsPage.getTextShoppingCart();
        Assert.assertEquals(actualShoppingCart,expectedShoppingCart,"Cart Not Matched");
        electronicsPage.clickOnCheckBoxTermsAndClickOnCheckOut();
        electronicsPage.fillMandatoryFields();
        Thread.sleep(2000);
        electronicsPage.clickOnContinueBtn();
        electronicsPage.clickOnradioButtonNextDay();
        electronicsPage.clickOnContinue1();
        electronicsPage.clickOnRadioButtonCreditCard();
        electronicsPage.selectCreditCardFromDropDown();
        electronicsPage.fillTheDetails();
        Thread.sleep(2000);
        electronicsPage.selectExpireYear();
        electronicsPage.enterCardCode();
        electronicsPage.clickOnCONTINUEButton();
        String expectedPaymentType = "Credit Card";
        String actualPaymentType = electronicsPage.getTextFromCreditCardMethod();
        Assert.assertEquals(actualPaymentType,expectedPaymentType,"Type not Matched");
        String expectedShippingMethod = "2nd Day Air";
        String actualShippingMethod = electronicsPage.getTextFromShipingMethod();
        Assert.assertEquals(actualShippingMethod,expectedShippingMethod,"Shipping Not Matched");
        String expectedTotalPrice1 = "$698.00";
        String actualTotalPrice1 = electronicsPage.getTotalPriceTxt();
        Assert.assertEquals(actualTotalPrice1,expectedTotalPrice1,"price Not matche");
        electronicsPage.clickOnConfirm();
        String expectedThankYouText = "Thank You";
        String actualThankYouText = electronicsPage.getThankYouText();
        Assert.assertEquals(actualThankYouText,expectedThankYouText,"Text not Matched");
        String expectedmsg = "Your order has been successfully processed!";
        String actualmsg  = electronicsPage.getTextMessegeOrderHasBeenProcessed();
        Assert.assertEquals(actualmsg,expectedmsg,"msg Not Matched");
        electronicsPage.clickOnContinue();
        String expectedWelcomeOurStore = "Welcome to our store";
        String actualWelcomeOurStore = electronicsPage.getTextWelcomeToOurStore();
        Assert.assertEquals(actualWelcomeOurStore,expectedWelcomeOurStore,"Text not matched");
        electronicsPage.clickOnLogOutLink();
//        String expectedUrl ="https://demo.nopcommerce.com/";
//        String actualUrl =electronicsPage.getTextURL();
//        Assert.assertEquals(actualUrl,expectedUrl,"url Not Matched");
    }
    }

