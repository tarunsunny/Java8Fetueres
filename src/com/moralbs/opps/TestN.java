package com.moralbs.opps;

public class TestN {

	TestN(int i) {
		System.out.println("Summer is started");
	}

	TestN(int i, int j) {
		this();
		System.out.println("Yes, started");
	}

	public static void main(String[] args) {
		TestN obj = new TestN(10, 10);
	}
}