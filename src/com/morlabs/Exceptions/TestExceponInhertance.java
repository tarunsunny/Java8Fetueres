package com.morlabs.Exceptions;

import java.io.IOException;

class A {
	public void abc() {
		System.out.println("Inisde acc Method");
	}
}

//class B extends A {
//	public void def() throws IOException {
//		System.out.println("Inside def method");
//	}
//}

public class TestExceponInhertance extends A {
	public void abc() throws ArrayIndexOutOfBoundsException {
		System.out.println("Inside def method");
	}


	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		TestExceponInhertance b = new TestExceponInhertance();
		b.abc();
	}

}
