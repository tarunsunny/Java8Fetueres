package com.moralbs.opps;

class E {
	E() {
		System.out.println("E()");
	}

	E(int i) {
		System.out.println("E(int)");
	}
}

class TestE11 extends E {
	TestE11() {
		System.out.println("TestE11()");
	}

	TestE11(int i) {
		System.out.println("TestE11(int)");
	}

}

class Sri extends TestE11 {
	Sri() {
		System.out.println("Sri()");
	}

	Sri(int j) {
		System.out.println("Sri(int)");
	}
}

class kum {

	public static void main(String[] args) {

		System.out.println("---------");
		E e1 = new E(10);
		System.out.println("---------");
		System.out.println("---------");
		TestE11 f1 = new TestE11(10);
		System.out.println("---------");
		System.out.println("---------");
		Sri s = new Sri(9);
	}
}
