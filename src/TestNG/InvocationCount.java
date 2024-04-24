package TestNG;


import org.testng.annotations.Test;

public class InvocationCount {
	@Test(invocationCount = 2)
	private void chrome() {
System.out.println("chrome");
	}
	@Test(invocationCount = 5)
	private void edge() {
System.out.println("edge");
	}
@Test
private void firefox() {
System.out.println("firefox");
}
@Test(invocationCount = -2)
private void opera() {
System.out.println("opera");
}
}
