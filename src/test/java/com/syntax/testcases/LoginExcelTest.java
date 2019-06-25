package com.syntax.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.syntax.pages.LoginPage;
import com.syntax.utils.BaseClass;
import com.syntax.utils.Constants;
import com.syntax.utils.ExcelUtility;

public class LoginExcelTest extends BaseClass{
	
	@Test(dataProvider="getData")
	public void login(String url,String uname, String pwd) {
		
		driver.get(url);
		
		LoginPage login=new LoginPage();
		login.login(uname,pwd);
	}
	
	@DataProvider()
	public Object[][] getData() {
		ExcelUtility excel=new ExcelUtility();
		excel.openExcel(Constants.xlPath_LOGINHRM,"loginTest" );
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
		
		
		
		
	
	


