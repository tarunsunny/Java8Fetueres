package com.marlabs.Stong;

class V{
//	V()
//	{
//		System.out.println("v() conrtuctor");
//	}
	V(int i) {
		System.out.println("V(int)");
	}
}

class W extends V {
	W()
	{
		
	}
	W(int i) {
		super(10);
		System.out.println("W(int)");
	}

	public static void main(String[] args) {
		W v1 = new W(10);
		System.out.println("-----");
		W w1 = new W(20);
		System.out.println("-----");
	}
}