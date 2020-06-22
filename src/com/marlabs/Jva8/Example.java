package com.marlabs.Jva8;

public class Example {

	public static void main(String[] args)
	{

		MyFunctionalInterface msg = () ->
		{
			return "hello this is tarun";
		};
		System.out.println(msg.SayHello());
		
		
		
	}
}