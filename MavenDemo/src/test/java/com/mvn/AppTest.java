package com.mvn;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {
	
	@Test
	public void testLogin1() {
		App app = new App(); 
		Assert.assertEquals(1, app.userLogin("abc", "abc@123"));
	}
	
	@Test
	public void testLogin2(){
		App app = new App();
		Assert.assertEquals(0, app.userLogin("abc", "abc123"));
	}
}
