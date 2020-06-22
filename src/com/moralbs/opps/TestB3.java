package com.moralbs.opps;

public class TestB3 {
	TestB3(int a) {

		System.out.println("TestB3()");

	}

	TestB3(int a, int b) {

		System.out.println("parametrirzed: cons");

	}

	{
		System.out.println("IIB");
	}

	public static void main(String[] args) {
		TestB3 b1 = new TestB3(11);
		System.out.println("----------");

	}
}
