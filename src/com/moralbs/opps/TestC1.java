package com.moralbs.opps;

public class TestC1 {

	TestC1() {
		System.out.println("hey I availble in c++ also");
	}

	public static void main(String[] args) {
		TestC1 obj = new TestC1();
		System.out.println("Success");
	}

	static {
		System.out.println("I am first");
	}
}
