package POM_HealthCare;

import BaseClass.BaseClass1;

public class Runner4 extends BaseClass1{
	public static void main(String[] args) throws InterruptedException {
		PageOManager pom = new PageOManager();
		browserLaunch("chrome");
		getUrl("https://www.icicilombard.com/health-insurance/health-advantedge-insurance-for-family?utm_source=google_search&utm_medium=CPC&utm_campaign=Health_Search_Prospecting_NonBrand_Bucket1&utm_adgroup=Core_Insurance_Policy&utm_keyword=health%20insurance%20policy&utm_device=c&utm_ad=687790539760&utm_placement=&utm_network=g&utm_matchtype=b&gad_source=1&gclid=Cj0KCQjwztOwBhD7ARIsAPDKnkCIHYQKVIoshCBH3KL_lqDCKdH2_BV8QI9iBcspfVjbaZOEz9k-UIAaAvF8EALw_wcB");
		click(pom.getHCHP().getAdult());
		click(pom.getHCHP().getDay());
		sendKey(pom.getHCHP().getDay(), "10");
		click(pom.getHCHP().getMonth());
		sendKey(pom.getHCHP().getMonth(), "10");
		click(pom.getHCHP().getYear());
		sendKey(pom.getHCHP().getYear(), "2000");
		click(pom.getHCHP().getDone());
		click(pom.getHCHP().getKids());
		Thread.sleep(2000);
		javascript();
		javaScriptclick(pom.getHCHP().getMobnum());
		sendKey(pom.getHCHP().getMobnum(), "9978654312");
		click(pom.getHCHP().getEmail());
		sendKey(pom.getHCHP().getEmail(),"sat@gmail.com");
		click(pom.getHCHP().getPincode());
		sendKey(pom.getHCHP().getPincode(), "631302");
		click(pom.getHCHP().getName());
		sendKey(pom.getHCHP().getName(),"sat");
		click(pom.getHCHP().getQuote());
		Thread.sleep(4000);
		scrollDown(0, 500);
		javaScriptclick(pom.getHPF().getSearch());
		javaScriptclick(pom.getHPF().getCity());
		javaScriptclick(pom.getHPF().getSearchhospitals());
		Thread.sleep(5000);
		javaScriptclick(pom.getHPF().getClose());
		close();
	}

}
