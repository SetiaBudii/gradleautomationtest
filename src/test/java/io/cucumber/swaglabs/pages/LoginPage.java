package io.cucumber.swaglabs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.swaglabs.utils.DriverManager;

public class LoginPage {
  WebDriver driver = DriverManager.getDriver();

  @FindBy(xpath = "//*[@id=\"user-name\"]")
  WebElement usernameField;

  @FindBy(xpath = "//*[@id=\"password\"]")
  WebElement passwordField;

  @FindBy(xpath = "//*[@id=\"login-button\"]")
  WebElement loginButton;

  @FindBy(css = "[data-test='error']")
  WebElement message;
  
  public LoginPage(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
  }

  // Actions
  public void enterUsername(String username) {
    usernameField.sendKeys(username);
  }

  public void enterPassword(String password) {
    passwordField.sendKeys(password);
  }

  public void clickLoginButton() {
    loginButton.click();
  }

  public String getMessage() {
    String message = this.message.getText();
    return message;
  }
}
