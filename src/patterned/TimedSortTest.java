package patterned;

import static common.Utils.createRandomIntegerArray;
import static common.Utils.print;

public class TimedSortTest {

	public static void main(String[] args) {

		{
			TimedSorter<Integer> bubbleSorter = new TimedSorter<Integer>(
					new BubbleSortImpl<Integer>());
			Integer[] array = createRandomIntegerArray(20, 10, 1000);

			// timedSortメソッドを呼び出し
			long time = bubbleSorter.timedSort(array);

			System.out.println("Bubble sort result :");
			print(array);
			System.out.printf("time = %d\n", time);
		}

		{
			TimedSorter<Integer> quickSorter = new TimedSorter<Integer>(
					new QuickSortImpl<Integer>());
			Integer[] array = createRandomIntegerArray(20, 10, 1000);

			// timedSortメソッドを呼び出し
			long time = quickSorter.timedSort(array);

			System.out.println("Quick sort result :");
			print(array);
			System.out.printf("time = %d\n", time);

		}
	}


}
