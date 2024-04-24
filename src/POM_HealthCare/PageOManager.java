package POM_HealthCare;

import BaseClass.BaseClass1;
import POM_HealthCare.HealthCareHomePage;
import POM_HealthCare.HealthPlanFinder;

public class PageOManager extends BaseClass1 {
	private HealthCareHomePage HCHP;

	public HealthCareHomePage getHCHP() {
		if(HCHP==null) {
			HCHP=new HealthCareHomePage(driver);
		}
		return HCHP;
	}
	private HealthPlanFinder HPF;

	public HealthPlanFinder getHPF() {
		if(HPF==null) {
			HPF=new HealthPlanFinder(driver);
		}
		return HPF;
	}
	
	

}
