package org.maven.adactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmPage extends BaseClass {
	public BookingConfirmPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id=\"order_no\"]")
	private WebElement orderTxt;

	public WebElement getOrderTxt() {
		return orderTxt;
	}
	
}
