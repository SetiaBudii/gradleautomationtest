package io.cucumber.swaglabs.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class inventoryLocators {
  @FindBy(xpath = "//*[@id=\"react-burger-menu-btn\"]")
  public WebElement menuButton;

  @FindBy(xpath = "//*[@id=\"logout_sidebar_link\"]")
  public WebElement logoutButton;

}
