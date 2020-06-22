package com.moralbs.opps;

class I {
	I() {
		System.out.println("I()");
	}
}

class J extends I {
	J() {
		super();
		System.out.println("J()");
	}
}

public class TestK {
	public static void main(String[] args) {
		I i1=new I();   System.out.println("------"); 
		J j = new J();
		
	}

}
