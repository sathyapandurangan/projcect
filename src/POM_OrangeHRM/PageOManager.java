package POM_OrangeHRM;

import BaseClass.BaseClass1;
import POM_OrangeHRM.DashBoard;
import POM_OrangeHRM.Login;
import POM_OrangeHRM.SearchAndDelete;

public class PageOManager extends BaseClass1{
	private Login ln;
	public Login getln() {
		if(ln==null) {
			ln = new Login(driver);
		}
		return ln;	
	}
	private DashBoard DB;
	public DashBoard getDB() {

		if(DB==null) {
			DB = new DashBoard(driver);
				}
		return DB;
		
	}
	private SearchAndDelete sd;
	public SearchAndDelete getSd() {
		if(sd==null) {
		sd = new SearchAndDelete(driver);
		}
		return sd;
	}
	
	
	

}
