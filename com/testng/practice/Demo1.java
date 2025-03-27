package com.testng.practice;

import org.testng.annotations.Test;

public class Demo1 {
	
	@Test()
	public void f() {
		System.out.println("Hello Demo1 f");
	}

	@Test()
	public void f1() {
		System.out.println("World Demo1 f1");
	}

	@Test()
	public void f2() {
		System.out.println("Hello Demo1 f2");
	}

	@Test(groups = "smoke")
	public void f3() {
		System.out.println("Avinash Demo1 f3");
	}
}
