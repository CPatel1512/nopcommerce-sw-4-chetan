package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TopMenuPage extends Utility {
By menuNames = By.xpath("//ul[@class='top-menu notmobile']/child::li");

    public void selectMenu(String menu){
        List<WebElement> names = driver.findElements(By.xpath("//ul[@class='top-menu notmobile']/child::li"));
        for (WebElement e : names) {
            if (e.getText().equalsIgnoreCase(menu)) {
                e.click();
                break;
            }
        }
    }



}
