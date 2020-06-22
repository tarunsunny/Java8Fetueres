package com.marlabs.Stong;

class E1 {
	int i;
	E1()
	{
		
	}

	E1(int k) {
		this();
		
		i = k;
		System.out.println("K()");
	}

	public static void main(String[] args) {
		E1 e1 = new E1(9);
		System.out.println("---------");
		E1 e2 = new E1(90);
		System.out.println("---------");
		E1 e3 = new E1(910);
		System.out.println("---------");
		System.out.println(e1.i);
		System.out.println(e2.i);
		System.out.println(e3.i);
	}
}