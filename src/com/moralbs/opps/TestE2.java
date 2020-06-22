package com.moralbs.opps;

public class TestE2 {

	TestE2(int i) {
		System.out.println("Summer is started");
	}

	TestE2(int i, int j) {
		this();
		System.out.println("Yes, started");
	}

	public static void main(String[] args) {
		TestE2 obj = new TestE2(10, 10);
	}
}