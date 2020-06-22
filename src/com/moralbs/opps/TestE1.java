package com.moralbs.opps;
//doubt
public class TestE1 {

	TestE1(int i) {
		System.out.println("Summer is started");
	}

	TestE1(int i, int j) {
		this();
		System.out.println("Yes, started");
	}

	public static void main(String[] args) {
		TestE1 obj = new TestE1(10, 10);
	}
}

