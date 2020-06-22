package com.moralbs.opps;

 class c {

	int i;

	void test1() {
		System.out.println(" from test1");
	}
}

class TestD3 extends c {
	int j;

	void test2() {
		System.out.println("from test2");
	}

	public static void main(String[] args) {
		TestD3 d1 = new TestD3();
		d1.test1();
		d1.test2();
		System.out.println("-----------");
		System.out.println(d1.i);
		System.out.println(d1.j);
	}
}