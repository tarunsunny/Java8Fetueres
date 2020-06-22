package com.morlabs.Exceptions;

public class TestE {

	public static void main(String[] args) {

		try {
			int a[] = new int[5];
			a[3] = 50 / 0;
			System.out.println(a[3]);
		} catch (ArithmeticException ae) {

			ae.printStackTrace();
		}

	}

}
