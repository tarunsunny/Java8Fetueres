package com.moralbs.opps;

public class TestJ {

	TestJ() {
		System.out.println("J()");
	}

	TestJ(int i) {
		System.out.println("J(int)");
	}

	public static void main(String[] args) {
		TestJ j1 = new TestJ();
		System.out.println("==========");
		TestJ j2 = new TestJ(20);
		System.out.println("==========");
		TestJ j3 = new TestJ();
		System.out.println("==========");
		TestJ j4 = new TestJ(50);
		System.out.println("==========");

	}
}

