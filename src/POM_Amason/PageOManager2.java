package POM_Amason;

import BaseClass.BaseClass1;
import POM_Amason.AmasonHomePage;
import POM_Amason.SearchMobiles;
import POM_Flipcart.HomePage;

public class PageOManager2 extends BaseClass1 {
	private AmasonHomePage AHP;

	
	public AmasonHomePage getAHP() {
		if(AHP==null) {
			AHP = new AmasonHomePage(driver);
		}
		return AHP;
	}

	private SearchMobiles sm;

	public SearchMobiles getsm() {
		if(sm==null) {
			sm= new SearchMobiles(driver);
		}
		return sm;
	}
     

}
