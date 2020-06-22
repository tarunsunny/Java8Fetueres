package com.marlabs.Stong;

class J {
	//must handle this..
//	J()
//	{
//	System.out.println("in JH constructor:");
//	}
	J(int i, int j) {
		System.out.println("success");
	}
}

class K extends J {
//	//super(10,20);
//	K()
//	{
//		
//	}
	
	K(int i, int j) {
		super(10,29);
		
		System.out.println("Very success");
	}

	public static void main(String[] args) {
		K k = new K(10, 20);
	}
}