package com.marlabs.Stong;

class L {
	{
		System.out.println("IIB1");
	}
	{
		System.out.println("IIB2");
	}
	static {
		System.out.println("SIB1");
	}
	static {
		System.out.println("SIB2");
	}

	L() {
		System.out.println("constructor");
	}

	L(int i) {
		System.out.println("L(int");
	}

	L(int i, int j) {
		System.out.println("L(int,int)");
	}
}

class Test1 extends L {
	Test1() {
		System.out.println("Constructor of M class");
	}

	public static void main(String[] args) {
		Test1 m1 = new Test1();
	}
}
