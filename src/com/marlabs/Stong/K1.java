package com.marlabs.Stong;

class I {
	I() {
		System.out.println("I()");
	}
}

class J1 extends I {
	J1() {
		System.out.println("J()");
	}
}

class K1{
	public static void main(String[] args) {
		I i1 = new I();
		System.out.println("------");
		J1 j1 = new J1();
	}
}
