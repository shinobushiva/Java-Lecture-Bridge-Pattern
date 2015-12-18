package patterned;

public class Sorter<T> {
	private SortImpl<T> impl;

	public Sorter(SortImpl<T> impl) {
		this.impl = impl;
	}

	public void sort(T[] array) {
		impl.sort(array);

	}

}
