package com.marlabs.Stong;

import javax.print.attribute.standard.PDLOverrideSupported;

class O {
	O() {
		System.out.println("C++ is interesting subject");
	}
}

class P extends O {
	P(int i) {
		
		System.out.println("java is very interesting subject");
	}

	public static void main(String[] args) {
		O obj = new O();
		P pi = new P(1);
	}
}
