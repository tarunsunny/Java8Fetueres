package com.moralbs.opps;

public class B extends A {
	public B() {
		super();
		//System.out.println("child class contructor");
	}

	public B(int i) {
//		System.out.println("child class contructor" + i);
		super(i);
	}

	public B(int i, int j) {
		super(j);
//		System.out.println("child class contructor" + i);
//		System.out.println("child class contructor" + j);
	}
	public static void main(String[] args) {
		B b = new B();
		B b1 = new B(10);
		B b2 = new B(10,20);
		
	}

}
