package com.moralbs.opps;

public class TestD2 {

	TestD2() {
		System.out.println("D()");
	}

	{
		System.out.println("IIB1");
	}
	{
		System.out.println("IIB2");
	}

	public static void main(String[] args) {
		TestD2 d1 = new TestD2();
		System.out.println("------");
		TestD2 d2 = new TestD2();
		System.out.println("------");
	}
}