package com.morlabs.Exceptions;

public class TestNull {
	public static void main(String[] args) {
		try  {
			System.out.println(1);  
			String s=null; 
			System.out.println(s.length()); 
			} 
		catch(NullPointerException ex) 
		{  System.out.println(4); 
		try {  int i=23/0; 
		System.out.println(5);
		}  
		}
		finally 
		{  System.out.println(6); } 
		System.out.println(7); }
}
