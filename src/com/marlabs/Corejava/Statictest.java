package com.marlabs.Corejava;

public class Statictest {
	static int a =10 ;
	
	static void  change() {
		int a=5;
		System.out.println(a);
	}
	 void display(){System.out.println(a);}  
	

	public static void main(String[] args) {
		Statictest.change();
		
		Statictest t = new Statictest();
		t.display();
		
    
	}

}
