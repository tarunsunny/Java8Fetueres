package com.morlabs.Exceptions;

public class Test2 {
	void m() {
		int i = 50 / 0;

	}

	void n() {
		m();
	}

	void p() {
		try

		{
			n();
		} catch (Exception e) {
			System.out.println("exception handled");
		}

	}

	public static void main(String[] args) {
		Test2 obj = new Test2();
		obj.p();
		System.out.println("normal flow...");
	}

}
