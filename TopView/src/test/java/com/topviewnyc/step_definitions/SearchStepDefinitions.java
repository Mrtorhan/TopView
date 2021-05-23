package com.topviewnyc.step_definitions;

import com.topviewnyc.pages.SearchPage;
import com.topviewnyc.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.util.concurrent.TimeUnit;

public class SearchStepDefinitions {

    SearchPage searchPage = new SearchPage();

    @Given("User is on the Top View home page")
    public void user_is_on_the_top_view_home_page() {

        Driver.getDriver().get("https://www.topviewnyc.com/");
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Driver.getDriver().manage().window().maximize();
        searchPage.searchButton.click();
    }

    @When("User searches {string}")
    public void user_searches_for_bus_tours(String searchValue) throws InterruptedException {

        Thread.sleep(2000);
        searchPage.searchBox.sendKeys(searchValue);

    }

    @And("User clicks to search button")
    public void user_clicks_to_search_button() {
        searchPage.searchBox.sendKeys(Keys.ENTER);
    }


    @Then("User should see Sorry, we couldn't find any search results. Please try another search term.")
    public void user_should_see_sorry_we_couldn_t_find_any_search_results_please_try_another_search_term() throws InterruptedException {


        Thread.sleep(2000);
       String actualErrorMessage = searchPage.errorMessage.getText();
       String expectedErrorMessage = "Sorry, we couldn't find any search results. Please try another search term..";

        Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
    }

}
