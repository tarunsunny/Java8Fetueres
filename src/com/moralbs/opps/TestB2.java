package com.moralbs.opps;

public class TestB2 {

	TestB2(int i) {
		System.out.println("I can overload");
	}

	public static void main(String[] args) {
		TestB2 b1 = new TestB2(0);
		System.out.println("Hello World!");
	}

	{
		System.out.println("From IIB");
	}
}
