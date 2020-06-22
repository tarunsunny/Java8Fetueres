package com.moralbs.opps;

class J1 {
//	J1(){
//		
//	}
	J1(int i) {
		System.out.println("success");
	}
}

class TestJ1 extends J1 {
	TestJ1(int i, int j) {
		System.out.println("Very success");
	}

	public static void main(String[] args) {
		TestJ1 k = new TestJ1(10, 20);
	}
}
