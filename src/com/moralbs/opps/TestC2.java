package com.moralbs.opps;

public class TestC2 {

	TestC2() {
		System.out.println("C()");
	}

	{
		System.out.println("IIB");
	}

	TestC2(int i) {
		System.out.println("C(int)");
	}

	public static void main(String[] args) {
		TestC2 obj1 = new TestC2();
		System.out.println("------");
		TestC2 obj2 = new TestC2(10);
		System.out.println("------");
	}
}