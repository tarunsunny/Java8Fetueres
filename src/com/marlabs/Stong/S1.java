package com.marlabs.Stong;

class S1 {
	public static void main(String[] args) {
		int i = 20;
		System.out.println("main1 :" + i);
		test(i);
		System.out.println("main2 :" + i);
	}

	static void test(int i) {
		System.out.println(i);
		i = 10;
		System.out.println(i);

	}

}
