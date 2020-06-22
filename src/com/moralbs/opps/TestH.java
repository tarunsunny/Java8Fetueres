package com.moralbs.opps;

public class TestH {
	public static void main(String[] args) {
		TestH t = new TestH();
		System.out.println("I am main() method");
		t.test();
	}

	 void test() {
		System.out.println("We are best friends");

	}

	static {
		System.out.println("I am SIB");
	}
	{
		System.out.println("I am IIB");
	}

}
