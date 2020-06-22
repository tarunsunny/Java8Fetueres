package com.marlabs.Stong;

class X {
	String s = "kumar";
}

class D9 extends X {
	
	String s = "child kumar";

	public static void m1() {
		System.out.println(s);
		System.out.println(super.s);
		System.out.println(this.s);
	}
}

public class Df {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D9 d = new D9();
		d.m1();

	}

}
