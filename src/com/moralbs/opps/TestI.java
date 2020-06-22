package com.moralbs.opps;

public class TestI {
	void test1() {
		System.out.println("Success");
	}

	static TestI test() {
		return new TestI();
	}

	public static void main(String[] args) {
		TestI i = test();
		i.test1();
	}

}
