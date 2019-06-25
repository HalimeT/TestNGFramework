package com.syntax.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.syntax.pages.AddLocationPage;
import com.syntax.pages.HomePage;
import com.syntax.pages.LoginPage;
import com.syntax.utils.BaseClass;
import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;
import com.syntax.utils.Constants;
import com.syntax.utils.ExcelUtility;

public class AddLocation extends BaseClass {

	
		@Test(dataProvider="add")
		public void addPerson(String name,String country,String city,String address, String zipCode,String phone,String fax,String timeZone) {
			LoginPage login=new	LoginPage();
		    login.login(ConfigsReader.getProperty("username"),ConfigsReader.getProperty("password") );
			HomePage home=new HomePage();
			CommonMethods.click(home.admin);
			CommonMethods.click(home.organization);
			CommonMethods.click(home.location);
			
		AddLocationPage addLoc=new AddLocationPage();
		CommonMethods.click(addLoc.add_btn);
		CommonMethods.sendText(addLoc.name,name);
		CommonMethods.click(addLoc.country);
		CommonMethods.selectList(addLoc.listOfCountry, country);//
		
		CommonMethods.sendText(addLoc.city,city);
		CommonMethods.sendText(addLoc.address,address);
		CommonMethods.sendText(addLoc.zipCode,zipCode);
		CommonMethods.sendText(addLoc.phone,phone);
		CommonMethods.sendText(addLoc.fax,fax);
//	    CommonMethods.click(addLoc.timeZoneDD);
//		CommonMethods.selectList(addLoc.timeZone, timeZone);
		
		
		CommonMethods.click(addLoc.save_btn);
		
		
	}
		
	
		
	@DataProvider(name="add")
	public Object[][] setData(){
		ExcelUtility excel=new ExcelUtility();
		excel.openExcel(Constants.xlPath_addLocation, "Sheet1");
		int row=excel.getRowNum();
		int col=excel.getColNum(0);
		
		Object[][] data=new Object[row-1][col];//no need header
		for(int i=1; i<row; i++) {
			for(int j=0; j<col; j++) {
				String value=excel.getCellData(i, j);
				
				data [i-1][j]=value;
				
			}
			
		}
		
		return data;
	}
		

	

}
