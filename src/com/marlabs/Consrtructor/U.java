package com.marlabs.Consrtructor;

public class U {
	U() {
		this(10);
		System.out.println("U()");
	}

	U(int i) {
		for (i = 0; i <= 5; i++)
			;
	}
}
