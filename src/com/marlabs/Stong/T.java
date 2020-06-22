package com.marlabs.Stong;

class T {
	T() {
		System.out.println("B()");
	}

	{
		System.out.println("IIB");
	}

	public static void main(String[] args) {
		T b1 = new T();
		System.out.println("----------");
		T b2 = new T();
		System.out.println("----------");
	}
}
