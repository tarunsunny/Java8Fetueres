package com.moralbs.opps;

public class TestR {
	TestR() {
		System.out.println("TestR()");
	}

	TestR(int i) {
		this();
		System.out.println("TestR(int)");
	}

	public static void main(String[] args) {
		TestR r1 = new TestR(10);
		System.out.println("Success");
	}
}
