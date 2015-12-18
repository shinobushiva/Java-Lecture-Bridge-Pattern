package common;

import java.util.Random;

public class Utils {

	public static Integer[] createRandomIntegerArray(int len, int min, int max) {
		Random rand = new Random();
		Integer[] intArray = new Integer[len];
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = rand.nextInt(max) + min;
		}
		return intArray;
	}

	public static void print(Integer[] ia) {
		for (Integer i : ia) {
			System.out.print(String.format("%5d", i));
		}
		System.out.println();
	}

}
