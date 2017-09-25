/*
 * ArrayQueue
 * @author KuanWang
 */
public class ArrayQueue implements Queue{
	private Object[] arr = new Object[10];
	private int head = 0;
	private int tail = 0;
	private int count = 0;
	
	public Object dequeue() {
		if (empty()) {
			return null;
		}
		count--;
		return arr[head++];
	}
	
	public void enqueue(Object item) {
		if (count == arr.length - 1) {
			tail = arr.length;
			Object[] temp = new Object[arr.length * 2];
			System.arraycopy(arr, 0, temp, 0, arr.length);
			arr = temp;
		}
		if (count < arr.length - 1 && tail == arr.length - 1) {
			tail = 0;
		}
		count++;
		arr[tail++] = item;
	}
	public boolean empty() {
		if (count == 0) {
			tail = 0;
			head = 0;
			return true;
		}
		return false;
	}
}
