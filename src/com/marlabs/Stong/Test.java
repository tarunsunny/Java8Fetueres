package com.marlabs.Stong;

public class Test {
	void test() {
		System.out.println("Normal Instance methhod:");
	}

	static {
		System.out.println("I am SIB");
	}
	{
		System.out.println("I am IIB");
	}

	static void testT() {
		System.out.println("Inside static method:");
	}

	public static void main(String[] args) {
		System.out.println("Inside main method:");
		// int i=test();
		//System.out.println("Welcome to lara");
		Test to = new Test();
		to.testT();

		to.test();

	}

}
