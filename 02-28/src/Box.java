//Exercise: Change the definition of Box so that it can hold any type rather than just integers

public class Box<T> {
	private T value;

	public Box(T value) {
		this.value = value;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
}
