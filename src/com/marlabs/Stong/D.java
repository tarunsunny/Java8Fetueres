package com.marlabs.Stong;

class C {
	int i;

	void test1() {
		System.out.println(" from test1");
	}
}

class D extends C {
	int j;

	void test2() {
		System.out.println("from test2");
	}

	public static void main(String[] args) {
		D d1 = new D();
		d1.test1();
		d1.test2();
		System.out.println("-----------");
		System.out.println(d1.i);
		System.out.println(d1.j);
	}
}