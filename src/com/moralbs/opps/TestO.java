package com.moralbs.opps;

public class TestO {

	TestO() {
		this(10);
		System.out.println("O()");
	}

	TestO(int i) {
		System.out.println("O(int)");
	}

	public static void main(String[] args) {
		TestO o1 = new TestO();
		System.out.println("------");
		TestO o2 = new TestO(20);
		System.out.println("------");
	}
}