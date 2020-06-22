package com.morlabs.Exceptions;

public class Test {
	public static void main(String[] args) {
		try {
			int a=50/0;
			System.out.println(a);
		}catch(Exception e) {
			e.printStackTrace();
			
			System.out.println(e.toString());
			System.out.println(e.getMessage());
		}
	}

}
