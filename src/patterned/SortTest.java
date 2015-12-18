package patterned;

import static common.Utils.createRandomIntegerArray;
import static common.Utils.print;

public class SortTest {

	public static void main(String[] args) {

		{
			Sorter<Integer> bubbleSorter = new Sorter<Integer>(
					new BubbleSortImpl<Integer>());
			Integer[] array = createRandomIntegerArray(20, 10, 1000);

			// sortメソッドを呼び出し
			bubbleSorter.sort(array);

			System.out.println("Bubble sort result :");
			print(array);
		}

		{
			Sorter<Integer> quickSorter = new Sorter<Integer>(
					new QuickSortImpl<Integer>());
			Integer[] array = createRandomIntegerArray(20, 10, 1000);

			// sortメソッドを呼び出し
			quickSorter.sort(array);

			System.out.println("Quick sort result :");
			print(array);
		}
	}

}
