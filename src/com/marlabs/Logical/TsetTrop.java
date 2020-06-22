package com.marlabs.Logical;

public class TsetTrop {

	public static void main(String[] args) {
		TsetTrop s = new TsetTrop();

		int[] a = { 1, 1, 2, 3, 4, 5, 6, 8, 9 };
		int sum = 7;
		int size = a.length;
		//System.out.println("size:" +size);

		s.sum(a, sum, size);
	}

	void sum(int[] a, int sum, int size) {

		for (int i = 0; i < size ; i++) {
		//	System.out.println(size);

			for (int j = i + 1; j < size ; j++) {
				//System.out.println(size);

				for (int k = j + 1; k < size; k++) {
					//System.out.println(size);
           //   System.out.println(a[i] + a[j] + a[k] );
					if (a[i] + a[j] + a[k] == sum) {

						System.out.println(a[i] + "+ " + a[j] + " +" + a[k] + " =" + sum);
					}
				}
			}

		}

	}
}
