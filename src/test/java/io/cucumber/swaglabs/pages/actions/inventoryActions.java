package io.cucumber.swaglabs.pages.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.swaglabs.utils.DriverManager;
import io.cucumber.swaglabs.pages.locators.inventoryLocators;

public class inventoryActions {
  WebDriver driver = DriverManager.getDriver();
  inventoryLocators inventoryLocators;

  public inventoryActions(WebDriver driver) {
    this.driver = driver;
    this.inventoryLocators = new inventoryLocators();
    PageFactory.initElements(driver, inventoryLocators);
  }

  // Actions
  public void openMenu() {
    inventoryLocators.menuButton.click();
  }

  public void clickLogoutButton() {
    inventoryLocators.logoutButton.click();
  }

  public String getUrl() {
    return driver.getCurrentUrl();
  }
}
