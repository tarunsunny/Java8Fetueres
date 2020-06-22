package com.marlabs.Stong;

class C2 {
	C2() {
		System.out.println("C()");
	}

	{
		System.out.println("IIB");
	}

	C2(int i) {
		System.out.println("C(int)");
	}

	public static void main(String[] args) {
		C2 obj1 = new C2();
		System.out.println("------");
		C2 obj2 = new C2(10);
		System.out.println("------");
	}
}
