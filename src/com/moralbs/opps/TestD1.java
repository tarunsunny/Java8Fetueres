package com.moralbs.opps;

public class TestD1 {

	TestD1(int i) {
		System.out.println("int()");
	}

	TestD1(int i, int j) {
		System.out.println("int(),int()");
		System.out.println("success");
	}

	public static void main(String[] args) {
		TestD1 d2 = new TestD1(10);
	}
}