package com.marlabs.Consrtructor;

public class Modhu {
	static void display(String... values) {
		System.out.println("display method invoked ");
		for (String s : values) {
			System.out.println(s);
		}
	}
	// int ip;
	// String name;
	// String hold;
	//
	// @Override
	// public String toString() {
	// return "Modhu [id=" + id + ", name=" + name + "]";
	// }

	public static void main(String[] args) {

		display("tarun", "srikumer", "goinesh");
		Integer i = new Integer(6);
		System.out.println("Done");
		String s1 = "xyz";
		Integer obj1=10; 
		System.out.println(obj1);
		Integer obj2=new Integer(10);
		System.out.println(obj2);

	}

}
