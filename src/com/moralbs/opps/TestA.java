package com.moralbs.opps;

class A2 {
	int i;
}

class TestA extends A2 {
	int j;

	public static void main(String[] args) {
		TestA b1 = new TestA();
		System.out.println(b1.i);
		System.out.println(b1.j);
	}
}
