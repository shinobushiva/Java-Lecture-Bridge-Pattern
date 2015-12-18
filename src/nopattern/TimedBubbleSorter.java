package nopattern;

import java.util.Arrays;

public class TimedBubbleSorter<T> implements TimedSorter<T> {

	@Override
	public long sort(T[] array) {
		long time = System.currentTimeMillis();
		// 説明のためにJava SDKが持っているソートを用いる
		Arrays.sort(array);

		// BubbleSortは早いので1500ms待つ
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		return System.currentTimeMillis() - time;
	}

}
