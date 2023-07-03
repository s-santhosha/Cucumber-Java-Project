package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SearchPage;

public class SearchStepdefs {

    SearchPage searchPage = new SearchPage();

    @Given("A user navigates to google HomePage")
    public void aUserNavigatesToGoogleHomePage() {
        searchPage.navigateToGoogleHomePage();
    }

    @When("User enter search {string}")
    public void userEnterSearch(String text) {
        searchPage.enterTextInSearchField(text);
    }

    @And("Click search button")
    public void clickSearchButton() {
        searchPage.clickButton();
    }

    @Then("search results are displayed")
    public void searchResultsAreDisplayed() {
        searchPage.verifyResultsDisplayed();
    }
}
