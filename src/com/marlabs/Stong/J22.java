package com.marlabs.Stong;

public class J22 {

	J22() {
		System.out.println("J()");
	}

	J22(int i) {
		System.out.println("J(int)");
	}



	public static void main(String[] args) {
		J22 j1 = new J22();
		System.out.println("==========");
		J22 j2 = new J22(20);
		System.out.println("==========");
	}

}