package patterned;

import java.util.Arrays;

public class QuickSortImpl<T> implements SortImpl<T> {

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
