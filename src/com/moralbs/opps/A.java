package com.moralbs.opps;

public class A {
	public A() {
		System.out.println("parent class contructor");
	}

	public A(int i) {
		System.out.println("parent class contructor" + i);
	}

	public A(int i, int j) {
		System.out.println("parent class contructor" + i);
		System.out.println("parent class contructor" + j);
	}

}
