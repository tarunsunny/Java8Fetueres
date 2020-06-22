package com.marlabs.Stong;

class P1{
	P1() {
		System.out.println("P1()");
	}
	P1(int i) {
		System.out.println("P(int)");
	}
}

class Q extends P {
	
	
	Q(int i)
	{
		super(6);
		System.out.println("q param");
	}

	public static void main(String[] args) {
		Q q = new Q(6);
	}

	static {
		System.out.println("From sib");
	}
	{
		System.out.println("from iib");
	}
}
