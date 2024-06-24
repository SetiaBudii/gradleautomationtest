package io.cucumber.swaglabs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.swaglabs.utils.DriverManager;

public class InventoryPage {
  WebDriver driver = DriverManager.getDriver();

  @FindBy(xpath = "//*[@id=\"react-burger-menu-btn\"]")
  WebElement menuButton;

  @FindBy(xpath = "//*[@id=\"logout_sidebar_link\"]")
  WebElement logoutButton;

  public InventoryPage(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
  }

  // Actions
  public void openMenu() {
    menuButton.click();
  }

  public void clickLogoutButton() {
    logoutButton.click();
  }

  public String getUrl() {
    return driver.getCurrentUrl();
  }
}
