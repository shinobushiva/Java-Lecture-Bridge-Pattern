package patterned;

public class TimedSorter<T> {
	private SortImpl<T> impl;

	public TimedSorter(SortImpl<T> impl) {
		this.impl = impl;
	}

	public long timedSort(T[] array) {

		long time = System.currentTimeMillis();
		impl.sort(array);
		return System.currentTimeMillis() - time;

	}
}
