package com.marlabs.Corejava;

public final class Student {
	private int id;
	private final String name;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Student(int i, String s) {
		this.id = i;
		this.name = s;
	}

	public static void main(String[] args) {
		Student st = new Student(1, "TarunKumar");
		System.out.println(st.name="java");

	}

}
