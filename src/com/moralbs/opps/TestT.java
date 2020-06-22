package com.moralbs.opps;

public class TestT {

	int i =20;

	static TestT test() {
		TestT t1 = new TestT();
		return t1;
	}

	public static void main(String[] args) {
		TestT obj = test();
		System.out.println(obj.i);
	}
}
