package com.Test;

import org.testng.annotations.Test;

public class ExceptionTImeOutTest {

	//@Test(timeOut = 2000, expectedExceptions = NumberFormatException.class)
	//public void infiniteLoopTest() {
	//	int i = 1;
	//	while (i == 1) {
	//		System.out.println(i);
	//	}

	//}

	@Test(expectedExceptions = NumberFormatException.class)
	public void test1() {
		String x = "100a";
		Integer.parseInt(x);
	}
}
