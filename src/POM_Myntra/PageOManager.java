package POM_Myntra;

import BaseClass.BaseClass1;

public class PageOManager extends BaseClass1 {
	private HomePage HP;

	public HomePage getHP() {
		if(HP==null) {
			HP=new HomePage(driver);
		}
		return HP;
	}
	private DynamicXpath DX;

	public DynamicXpath getDX() {
		if(DX==null) {
			DX=new DynamicXpath(driver);
		}
		return DX;
	}
	

}
