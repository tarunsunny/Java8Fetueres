package com.morlabs.Exceptions;

public class TestZ {
	public static void main(String[] args) {
		try {
			int a[] = new int[5];
			System.out.println(a[6]);
			a[5] = 30 / 0;

		}

		catch (NullPointerException ne) {
			System.out.println("null");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("task 2 completed");
		} catch (ArithmeticException e) {
			System.out.println("task1 is completed");
		}

		catch (Exception e) {
			System.out.println("common task completed");
		}
		System.out.println("rest of the code...");
	}
}
