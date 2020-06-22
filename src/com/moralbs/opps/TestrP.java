package com.moralbs.opps;

class P {
//	
	
	P(int i) {
		System.out.println("P(int)");
	}
}

class TestrP extends P {
	TestrP() {
		System.out.println("Q()");
	}

	public static void main(String[] args) {
		TestrP q = new TestrP();
	}

	static {
		System.out.println("From sib");
	}
	{
		System.out.println("from iib");
	}
}

