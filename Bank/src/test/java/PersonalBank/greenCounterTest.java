package PersonalBank;

import org.testng.annotations.Test;

public class greenCounterTest {
	@Test
	public void counterstart(){
		System.out.println("Counter opens");
	}
	
	@Test
	public void counterstop(){
		System.out.println("Counter close");
	}
}
