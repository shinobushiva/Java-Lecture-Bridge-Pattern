package nopattern;

import static common.Utils.createRandomIntegerArray;
import static common.Utils.print;

public class TimedSortTest {

	public static void main(String[] args) {
		TimedBubbleSorter<Integer> bubbleSorter = new TimedBubbleSorter<Integer>();
		Integer[] array = createRandomIntegerArray(20, 10, 1000);

		// sortメソッドを呼び出し
		long time = bubbleSorter.sort(array);

		System.out.println("Bubble sort result :");
		print(array);
		System.out.printf("time = %d\n", time);
	}

}
