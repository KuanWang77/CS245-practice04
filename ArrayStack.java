/*
 * ArrayQueue
 * @author KuanWang
 */
public class ArrayStack implements Stack {
	
	private Object[] arr = new Object[10];
	private int top = 0;
	
	public void push(Object item) {
		if (top > arr.length - 1) {
			Object[] temp = new Object[arr.length * 2];
			System.arraycopy(arr, 0, temp, 0, arr.length);
			arr = temp;
		}
		arr[top++] = item;
	}
	
	public Object pop() {
		if (!empty()) {
			return arr[--top];
		}
		return null;
	}
	
	public Object peek() {
		if (empty()) {
			return null;
		}
		return arr[top - 1];
	}

	public boolean empty() {
		if (top == 0) {
			return true;
		}
		return false;
	}
}
