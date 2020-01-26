package org.maven.adactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage extends BaseClass {
	
	public SelectHotelPage()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='radiobutton_0']")
	private WebElement radioBtnHotel;
	
	@FindBy(xpath="//input[@id=\"continue\"]")
	private WebElement continueBtn;

	public WebElement getRadioBtnHotel() {
		return radioBtnHotel;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}

}
