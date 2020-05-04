package com.zerobank.step_definitions;

import com.zerobank.pages.BasePage;
import io.cucumber.java.en.When;

public class NavigationSteps {
    @When("user navigates to {string} page")
    public void user_navigates_to_page(String page) {
        BasePage basePage = new BasePage();
        basePage.navigateTo(page);
    }

    @When("user switch to {string} account")
    public void user_Switch_To_Link(String account) {
        BasePage basePage = new BasePage();
        basePage.switchTo(account);
    }
}
