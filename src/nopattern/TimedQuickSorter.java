package nopattern;

import java.util.Arrays;

public class TimedQuickSorter<T> implements TimedSorter<T> {

	@Override
	public long sort(T[] array) {

		long time = System.currentTimeMillis();

		// 説明のためにJava SDKが持っているソートを用いる
		Arrays.sort(array);

		// QuickSortは早いので100msだけ待つ
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		return System.currentTimeMillis() - time;
	}

}
