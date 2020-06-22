package com.moralbs.opps;

 class N {

	N(int i) {
		System.out.println("Hi...I am in super class");
	}
}

class TestM {
	TestM(int i, int j) {
		System.out.println("I am in subclass");
	}

	public static void main(String[] args) {
		TestM n2 = new TestM(10, 20);
		System.out.println("Success");
	}
}