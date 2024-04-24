package POM_Ajio;

import BaseClass.BaseClass1;
import POM_Ajio.AjioHomePage;
import POM_Ajio.SearchProduct;

public class PageOManager extends BaseClass1 {
	private AjioHomePage AHP;

	public AjioHomePage getAHP() {
		if (AHP == null) {
			AHP = new AjioHomePage(driver);
		}
		return AHP;
	}

	public SearchProduct getSP() {
		if (SP == null) {
			SP = new SearchProduct(driver);
		}

		return SP;
	}

	private SearchProduct SP;

}
