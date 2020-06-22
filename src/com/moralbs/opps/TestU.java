package com.moralbs.opps;

public class TestU {

	TestU() {
		System.out.println("U()");
	}

	TestU(int i) {
		this();
		System.out.println("U(int)");
	}

	public static void main(String[] args) {
		TestU u1 = new TestU();
		System.out.println("Success");
	}
}