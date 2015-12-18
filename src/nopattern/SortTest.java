package nopattern;

import static common.Utils.createRandomIntegerArray;
import static common.Utils.print;

public class SortTest {

	public static void main(String[] args) {
		BubbleSorter<Integer> bubbleSorter = new BubbleSorter<Integer>();
		Integer[] array = createRandomIntegerArray(20, 10, 1000);

		// sortメソッドを呼び出し
		bubbleSorter.sort(array);

		System.out.println("Bubble sort result :");
		print(array);
	}

}
