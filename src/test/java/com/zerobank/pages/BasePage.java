package com.zerobank.pages;

import com.zerobank.utilities.CommonMethods;
import com.zerobank.utilities.ConstantVariables;
import com.zerobank.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BasePage implements CommonMethods {
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@class='span12']/div/ul/li/a[contains(text(),'Account Activity')]")
    public WebElement tab_accountActivity;

    @FindBy(xpath = "//div[@class='span12']/div/ul/li/a[contains(text(),'Pay Bills')]")
    public WebElement tab_payBills;


    @FindBy(xpath = "//tr[1]/td[1]/a[contains(text(),'Savings')]")
    public WebElement txt_savings;

    @FindBy(xpath = "//tr[1]/td[1]/a[contains(text(),'Brokerage')]")
    public WebElement txt_brokerage;

    @FindBy(xpath = "//tr[1]/td[1]/a[contains(text(),'Checking')]")
    public WebElement txt_checking;

    @FindBy(xpath = "//tr[2]/td[1]/a[contains(text(),'Credit Card')]")
    public WebElement txt_creditCard;

    @FindBy(xpath = "//tr[1]/td[1]/a[contains(text(),'Loan')]")
    public WebElement txt_loan;



    public void navigateTo(String page){
        page = page.toUpperCase();
        switch (page){
            case ConstantVariables.ACCOUNT_ACTIVITY:
                tab_accountActivity.click();
                break;
            case ConstantVariables.PAY_BILLS:
                tab_payBills.click();
                break;
            default:
                Assert.fail("There is no such " + page + " in this switch statement");
        }
    }

    public void switchTo(String types){
        types = types.toUpperCase();
        switch (types){
            case ConstantVariables.SAVINGS:
                txt_savings.click();
                break;
            case ConstantVariables.BROKERAGE:
                txt_brokerage.click();
                break;
            case ConstantVariables.CHECKING:
                txt_checking.click();
                break;
            case ConstantVariables.CREDIT_CARD:
                txt_creditCard.click();
                break;
            case ConstantVariables.LOAN:
                txt_loan.click();
                break;
            default:
                Assert.fail("There is no such " + types + " in this switch statement");
        }
    }

}