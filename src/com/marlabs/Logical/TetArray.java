package com.marlabs.Logical;

public class TetArray {
	public static void trooplets(int[] array, int sum) {
		for (int i = 0; i < array.length; i++) {
			int forst = array[i];
			for (int j = i + 1; j < array.length; j++) {
				int second = array[j];
				for (int k = i + 1; j < array.length; k++) {
					int third = array[k];

					if ((forst + second + third == sum)) {
						System.out.printf("{%d , %d } %n ", forst, second);
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] numbers = { 0 , 5, 6, 7,8,9 ,11 };
		
		trooplets(numbers, 7);
	}

}
