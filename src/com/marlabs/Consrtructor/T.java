package com.marlabs.Consrtructor;

public class T {
	T() {
		System.out.println("constructor T()");
	}

	T(int i)

	{
		T t1 = new T();
		System.out.println("T()");
	}

	public static void main(String[] args) {
      T tob = new T();
      System.out.println("===========");
      T tob1 = new T(10);
      System.out.println("===========");

	}
}
