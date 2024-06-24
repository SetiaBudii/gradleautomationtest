package io.cucumber.swaglabs.pages.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.swaglabs.utils.DriverManager;
import io.cucumber.swaglabs.pages.locators.loginLocators;

public class loginActions {
  WebDriver driver = DriverManager.getDriver();
  loginLocators loginLocators;
  
  public loginActions(WebDriver driver) {
    this.driver = driver;
    this.loginLocators = new loginLocators();
    PageFactory.initElements(driver, loginLocators);
  }

  // Actions
  public void enterUsername(String username) {
    loginLocators.usernameField.sendKeys(username);
  }

  public void enterPassword(String password) {
    loginLocators.passwordField.sendKeys(password);
  }

  public void clickLoginButton() {
    loginLocators.loginButton.click();
  }

  public String getMessage() {
    String message = this.loginLocators.message.getText();
    return message;
  }
}
