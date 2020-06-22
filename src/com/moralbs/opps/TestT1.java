package com.moralbs.opps;

public class TestT1 {

	TestT1() {
		
		System.out.println("T()");
	}

	TestT1(int i) {
		
		TestT1 t1 = new TestT1();
		System.out.println("T()95985i");
	}

	public static void main(String[] args) {
		TestT1 obj1 = new TestT1();
		System.out.println("-------------");
		TestT1 obj2 = new TestT1(10);
		System.out.println("-------------");
	}
}
