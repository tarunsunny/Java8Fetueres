package com.marlabs.Stong;

class M {
	M(int i) {
		System.out.println("Hi...I am in super class");
	}
}

class N  {
	N(int i, int j) {
		
		System.out.println("I am in subclass");
	}

	public static void main(String[] args) {
		N n2 = new N(10, 20);
		System.out.println("Success");
	}
}
