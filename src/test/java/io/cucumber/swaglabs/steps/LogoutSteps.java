package io.cucumber.swaglabs.steps;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.swaglabs.pages.InventoryPage;
import io.cucumber.swaglabs.pages.LoginPage;

public class LogoutSteps {
  LoginPage objLoginPage = new LoginPage(Hooks.driver);
  InventoryPage objInventoryPage = new InventoryPage(Hooks.driver);

  @Given("I am has logged in with valid credentials")
  public void i_am_has_logged_in_with_valid_credentials() {
    Hooks.driver.get("https://www.saucedemo.com/");
    objLoginPage.enterUsername("standard_user");
    objLoginPage.enterPassword("secret_sauce");
    objLoginPage.clickLoginButton();
  }

  @Given("I am on the dashboard page")
  public void i_am_on_the_dashboard_page() {
    String expectedUrl = objInventoryPage.getUrl();
    String actualUrl = Hooks.driver.getCurrentUrl();
    assertEquals(expectedUrl, actualUrl);
  }

  @When("I open the menu")
  public void i_open_the_menu() {
    objInventoryPage.openMenu();
    try {
      Thread.sleep(5000); // Wait for 5 seconds
  } catch (InterruptedException e) {
      e.printStackTrace();
  }
  }

  @When("I click the logout button")
  public void i_click_the_logout_button() {
    objInventoryPage.clickLogoutButton();
  }

  @Then("I should be logged out successfully")
  public void i_should_be_logged_out_successfully() {
    String expectedUrl = "https://www.saucedemo.com/";
    String actualUrl = Hooks.driver.getCurrentUrl();
    assertEquals(expectedUrl, actualUrl);
  }
}
