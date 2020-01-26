package org.maven.adactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotelPage extends BaseClass {
	public BookHotelPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id=\"first_name\"]")
	private WebElement txtFirstName;
	
	@FindBy(xpath="//input[@id=\"last_name\"]")
	private WebElement txtLastName;
	
	@FindBy(xpath="//textarea[@id=\"address\"]")
	private WebElement txtAdress;
	
	@FindBy(xpath="//input[@id=\"cc_num\"]")
	private WebElement txtccNum;
	
	@FindBy(xpath="//select[@id=\"cc_type\"]")
	private WebElement txtccType;
	
	@FindBy(xpath="//select[@id=\"cc_exp_month\"]")
	private WebElement txtExpMonth;
	
	@FindBy(xpath="//select[@id=\"cc_exp_year\"]")
	private WebElement txtExpYear;
	
	@FindBy(xpath="//input[@id=\"cc_cvv\"]")
	private WebElement txtcvv;
	
	@FindBy(xpath="//input[@id=\"book_now\"]")
	private WebElement bookBtn;

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtAdress() {
		return txtAdress;
	}

	public WebElement getTxtccNum() {
		return txtccNum;
	}

	public WebElement getTxtccType() {
		return txtccType;
	}

	public WebElement getTxtExpMonth() {
		return txtExpMonth;
	}

	public WebElement getTxtExpYear() {
		return txtExpYear;
	}

	public WebElement getTxtcvv() {
		return txtcvv;
	}

	public WebElement getBookBtn() {
		return bookBtn;
	}
	
	
	
	
	
	
	
	
	
	
}
