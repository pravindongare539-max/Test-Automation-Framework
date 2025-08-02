//package com.ui.tests;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import com.utility.BrowserUtility;
//
//public class LoginTestOLD {
//
//	public static void main(String[] args) {
//
//		WebDriver driver = new ChromeDriver();
//		
//		BrowserUtility browserUtility = new BrowserUtility(driver);
//		browserUtility.goToWebsite("http://www.automationpractice.pl");
//		browserUtility.maximizeWindow();
//		
//		By signInLinkLocator = By.xpath("//a[contains(text(), 'Sign')]");
//        browserUtility.clickOn(signInLinkLocator);
//		
//		By emailTextBoxLocator = By.id("email");
//		browserUtility.enterText(emailTextBoxLocator, "gareca9319@dlbazi.com");
//		
//		By passwordTextBoxLocator = By.id("passwd");
//        browserUtility.enterText(passwordTextBoxLocator, "password");
//		
//		By submitLoginButtonLocator = By.xpath("//button[@id = 'SubmitLogin']");
//        browserUtility.clickOn(submitLoginButtonLocator);
//	}
//}
