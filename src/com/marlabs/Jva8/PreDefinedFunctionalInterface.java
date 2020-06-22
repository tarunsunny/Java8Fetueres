package com.marlabs.Jva8;

import java.util.function.IntBinaryOperator;

public class PreDefinedFunctionalInterface {

	public static void main(String[] args) {

		IntBinaryOperator sum = (a, b) -> a + b;
		System.out.println("sum of numberss  ::" + sum.applyAsInt(4, 2));
	}

}
