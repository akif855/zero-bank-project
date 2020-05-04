package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConstantVariables;
import com.zerobank.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AccountSummaryPage extends BasePage {

    @FindBy(tagName = "h2")
    public List<WebElement> hdr_accountTypes;

    @FindBy(xpath = "(//table)[3]/thead/tr/th")
    public List<WebElement> hdr_tableColumns;






    @Override
    public void validateResults(String element,String expected){
        element = element.toUpperCase();
        switch (element){
            case ConstantVariables.TITLE:
                Assert.assertEquals(expected, Driver.getDriver().getTitle());
                break;
            default:
                Assert.fail("There is no such " + element + " in this switch statement");
        }
    }

    @Override
    public void validateResultsList(String element, List<String> expectedList){
        element = element.toUpperCase();
        switch (element){
            case ConstantVariables.ACCOUNT_TYPES:
                Assert.assertEquals(expectedList, BrowserUtils.getElementsText(hdr_accountTypes));
                break;
            case ConstantVariables.CREDIT_ACCOUNTS:
                Assert.assertEquals(expectedList,BrowserUtils.getElementsText(hdr_tableColumns));
                break;
            default:
                Assert.fail("There is no such " + element + " in this switch statement");
        }
    }



}