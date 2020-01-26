package org.maven.adactin;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class AdacticHotel extends BaseClass {
	
	public static void main(String args[]) throws InterruptedException, IOException
	{
		launchBrowser();
		openUrl("https://adactin.com/HotelApp/");
		LoginPage page=new LoginPage();
		type(page.getTxtUserName(), "Maha300395");
		type(page.getTxtPassword(), "Maha@123");
		takeScreenShot("LoginPage.png");
		btnClick(page.getLstBtnLogin().get(0));
		SearchHotelPage search=new SearchHotelPage();
		selectByVisibleText(search.getDrpLocation(), "London");
		selectByVisibleText(search.getDrpHotels(), "Hotel Sunshine");
		selectByVisibleText(search.getDrpRoomType(), "Standard");
		selectByVisibleText(search.getDrpChildRoom(), "3 - Three");
		takeScreenShot("SearchPage.png");
		search.getSearchButton().click();
		SelectHotelPage hotelSelect = new SelectHotelPage();
		takeScreenShot("hotelSelect.png");
		hotelSelect.getRadioBtnHotel().click();
		hotelSelect.getContinueBtn().click();
		BookHotelPage bookHotel = new BookHotelPage();
		type(bookHotel.getTxtFirstName(), "Maha");
		type(bookHotel.getTxtLastName(),"Lakshmi");
		type(bookHotel.getTxtAdress(), "Chennai");
		type(bookHotel.getTxtccNum(), "5265265476254714");
		selectByVisibleText(bookHotel.getTxtccType(), "Master Card");
		selectByVisibleText(bookHotel.getTxtExpMonth(), "March");
		selectByVisibleText(bookHotel.getTxtExpYear(), "2012");
		type(bookHotel.getTxtcvv(), "1234");
		takeScreenShot("bookHotel.png");
		bookHotel.getBookBtn().click();
		Thread.sleep(10000);
		BookingConfirmPage bookConfirm=new BookingConfirmPage();
		WebElement orderTxt = bookConfirm.getOrderTxt();
		System.out.print(orderTxt.getAttribute("value"));
		takeScreenShot("bookConfirm.png");
		quitBrowser();
	}

}
