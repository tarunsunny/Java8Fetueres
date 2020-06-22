package com.moralbs.opps;

public class TestE3 {

	int i;

	TestE3(int k) {
		i = k;
		System.out.println("K()");
	}

	public static void main(String[] args) {
		TestE3 e1 = new TestE3(9);
		System.out.println("---------");
		TestE3 e2 = new TestE3(90);
		System.out.println("---------");
		TestE3 e3 = new TestE3(910);
		System.out.println("---------");
		System.out.println(e1.i);
		System.out.println(e2.i);
		System.out.println(e3.i);
	}
}