package nopattern;

import java.util.Arrays;

public class QuickSorter<T> implements Sorter<T> {

	@Override
	public void sort(T[] array) {

		// 説明のためにJava SDKが持っているソートを用いる
		Arrays.sort(array);

		// QuickSortは早いので100msだけ待つ
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
