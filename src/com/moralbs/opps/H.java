package com.moralbs.opps;

class G {
	G(int i) {
		System.out.println("world cup already started");
	}
}

class H extends G {
	H() {
		//super(10);
		System.out.println("And india won the first match");
	}

	public static void main(String[] args) {
		H h1 = new H();
	}
}

