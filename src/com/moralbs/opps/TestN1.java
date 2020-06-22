package com.moralbs.opps;

public class TestN1 {

	TestN1()    {   System.out.println("N()");  }

	TestN1(int i)  {   this();   System.out.println("N(int)");  }

	public static void main(String[] args) {
		TestN1 n1 = new TestN1();
		System.out.println("=============");
		TestN1 n2 = new TestN1(10);
		System.out.println("=============");
	}
}
