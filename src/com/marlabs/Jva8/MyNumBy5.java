package com.marlabs.Jva8;

public class MyNumBy5 {

	public static void main(String[] args) {
		MyNumFunctionalInterface mynum = (num) -> num+5;
		System.out.println(mynum.numbyfive(22));
	}

}
