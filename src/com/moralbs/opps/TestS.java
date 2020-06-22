package com.moralbs.opps;

public class TestS {
	int i;

	static void test1(int x) {
		x = 10;
	}

	static void test2(TestS s1) {
		s1.i = 20;
	}

	public static void main(String[] args) {
		TestS s1 = new TestS();
		s1.i = 30;
		System.out.println("A:" + s1.i);
		TestS s2 = new TestS();
		test1(s1.i);
		System.out.println("B:" + s1.i);
		test2(s1);
		System.out.println("C:" + s1.i);
	}
}