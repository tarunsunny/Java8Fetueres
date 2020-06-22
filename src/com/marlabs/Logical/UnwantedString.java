package com.marlabs.Logical;

public class UnwantedString {

	public static void main(String[] args) {

		String str="tarunKumar%^$%&*(hj";
		str = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str);
	}

}
