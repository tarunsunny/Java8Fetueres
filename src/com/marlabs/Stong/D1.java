package com.marlabs.Stong;

class D1 {
	D1() {
		System.out.println("D()");
	}

	{
		System.out.println("IIB1");
	}
	{
		System.out.println("IIB2");
	}

	public static void main(String[] args) {
		D1 d1 = new D1();
		System.out.println("------");
		D1 d2 = new D1();
		System.out.println("------");
	}
}
