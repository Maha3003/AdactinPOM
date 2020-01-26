package org.maven.adactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage extends BaseClass {
	public SearchHotelPage()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="location")
	private WebElement drpLocation;
	
	@FindBy(xpath="//select[@id=\"hotels\"]")
	private WebElement drpHotels;
	
	@FindBy(xpath="//select[@id=\"room_type\"]")
	private WebElement drpRoomType;
	
	@FindBy(xpath="//select[@id=\"child_room\"]")
	private WebElement drpChildRoom;

	@FindBy(xpath="//input[@value=\"Search\"]")
	private WebElement searchButton;
	
	public WebElement getDrpRoomType() {
		return drpRoomType;
	}

	public WebElement getDrpChildRoom() {
		return drpChildRoom;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public WebElement getDrpHotels() {
		return drpHotels;
	}

	public WebElement getDrpLocation() {
		return drpLocation;
	}
	
	

}
