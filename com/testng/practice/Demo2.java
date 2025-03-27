package com.testng.practice;

import org.testng.annotations.Test;

public class Demo2 {
	
	@Test()
	public void f4() {
		System.out.println("Anu Demo2 f4");
	}

	@Test()
	public void f5() {
		System.out.println("Baba Demo2 f5");
	}

	@Test()
	public void f6() {
		System.out.println("Shiva Demo2 f6");
	}

	@Test(groups = "smoke")
	public void f7() {
		System.out.println("Charu Demo2 7");
	}
}
