package POM_Flipcart;

import BaseClass.BaseClass1;
import POM_Flipcart.AddToCart;
import POM_Flipcart.HomePage;

public class PageOManager extends BaseClass1 {
	
	private HomePage hp;
	
	public HomePage getHp() {
		if(hp==null) {
			hp = new HomePage(driver);
		}
		return hp;
	}
	private AddToCart atc;

	public AddToCart getAtc() {
		if(atc==null) {
			atc=new AddToCart(driver);
		}
		return atc;
	}
	

}
