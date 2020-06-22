package com.marlabs.Logical;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class TestN {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number :");

		int inputNumber = sc.nextInt();

		HashMap<Integer, Integer> digitCountMap = new HashMap<Integer, Integer>();
		System.out.println("digit map first :" +digitCountMap);

		while (inputNumber != 0) {

			System.out.println("input  :" + inputNumber);

			int lastDigit = inputNumber % 10;
			System.out.println("lastDigit :" + lastDigit);
			System.out.println("keyset :" +digitCountMap.keySet());
			System.out.println("values :"+digitCountMap.values());
			System.out.println("digitCountMap before condition check:" + digitCountMap);
			if (digitCountMap.containsKey(lastDigit)) {
				System.out.println("digitCountMap :" + digitCountMap);
                 System.out.println("digitCountMap.get(lastDigit)  :" +digitCountMap.get(lastDigit));
				digitCountMap.put(lastDigit, digitCountMap.get(lastDigit) + 1);
				System.out.println("digitCountMap after put :" + digitCountMap);
			} else {

				digitCountMap.put(lastDigit, 1);
				System.out.println("else : " +digitCountMap);
			}

			inputNumber = inputNumber / 10;
			System.out.println("inputnumber after division  :" + inputNumber);
		}

		System.out.println("===================");

		System.out.println("Digits : Frequency");

		System.out.println("===================");

		Set<Integer> keys = digitCountMap.keySet();
		System.out.println("keys :"+keys);

		for (Integer key : keys) {
			System.out.println("   " + key + "   :   " + digitCountMap.get(key));
		}

		sc.close();
	}
}
