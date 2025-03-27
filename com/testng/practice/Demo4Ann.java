package com.testng.practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo4Ann {
	// System.out.println("fun4 @BeforeSuite--->");
//  System.out.println("fun6 @BeforeTest --->");
	// System.out.println("fun5 @BeforeClass--->");
	//  System.out.println("fun7 @BeforeMethod--->");
	//System.out.println("fun1--->");
	
	
  @Test(groups = "Demo4Ann")
  public void fun1() {
	  System.out.println("fun1--->");
  }
  
  @Test(groups = "Demo4Ann")
  public void fun2() {
	  System.out.println("fun2--->");
  }
  
  @Test(groups = "Demo4Ann")
  public void fun3() {
	  System.out.println("fun3--->");
  }
  
  @BeforeSuite
  public void fun4() {
	  System.out.println("fun4 @BeforeSuite--->");
  }
  
  @BeforeClass
  public void fun5() {
	  System.out.println("fun5 @BeforeClass--->");
  }

  @BeforeTest
  public void fun6() {
	  System.out.println("fun6 @BeforeTest --->");
  }
  
  @BeforeMethod
  public void fun7() {
	  System.out.println("fun7 @BeforeMethod--->");
  }
  
  @AfterSuite
  public void fun8() {
	  System.out.println("fun8 @@AfterSuite--->");
  }
  
  @AfterClass
  public void fun9() {
	  System.out.println("fun9 @@AfterClass--->");
  }

  @AfterTest
  public void fun10() {
	  System.out.println("fun10 @@AfterTest --->");
  }
  
  @AfterMethod
  public void fun11() {
	  System.out.println("fun11 @@AfterMethod--->");
  }

}
