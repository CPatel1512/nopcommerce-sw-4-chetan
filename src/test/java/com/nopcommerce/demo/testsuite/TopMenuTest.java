package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.TopMenuPage;
import com.nopcommerce.demo.testbased.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class TopMenuTest extends BaseTest {

    TopMenuPage topMenuPage = new TopMenuPage();

    @Test
    public void verifyPageNavigation() {
        List<String> names = new ArrayList<>();
        names.add("Computers");
        names.add("Electronics");
        names.add("Apparel");
        names.add("Digital downloads");
        names.add("Books");
        names.add("Jewelry");
        names.add("Gift Cards");

        for (int i = 0; i < names.size(); i++) {
            topMenuPage.selectMenu(names.get(i));
            String actualmessge = getTextFromElement(By.xpath("//h1[contains(text(),'" + names.get(i) + "')]"));
            Assert.assertEquals("Computers", names.get(i), actualmessge);
        }

    }
}






