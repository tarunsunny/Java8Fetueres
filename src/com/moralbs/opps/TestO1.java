package com.moralbs.opps;

class O {
	O() {
		System.out.println("C++ is interesting subject");
	}
}

class TestO1 extends O {
	TestO1(int i) {
		System.out.println("java is very interesting subject");
	}

	public static void main(String[] args) {
		O obj = new O();
	}
}


