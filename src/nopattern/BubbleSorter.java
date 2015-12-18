package nopattern;

import java.util.Arrays;

public class BubbleSorter<T> implements Sorter<T> {

	@Override
	public void sort(T[] array) {
		// 説明のためにJava SDKが持っているソートを用いる
		Arrays.sort(array);

		// BubbleSortは早いので1500ms待つ
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
