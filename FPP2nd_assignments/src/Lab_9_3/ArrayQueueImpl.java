package Lab_9_3;

public class ArrayQueueImpl {
	private int[] arr = new int[10];
	private int size = 0;
	private int front = 0;
	private int rear = 0;

	public boolean isEmpty() {
		return size == 0;
	}

	private void resize() {
		System.out.println("Resizing..." + this.arr.length + " to " + this.arr.length * 2);
		int[] strArrayEnlarged = new int[this.arr.length * 2];
		System.arraycopy(arr, 0, strArrayEnlarged, 0, arr.length);

		arr = strArrayEnlarged;
	}

	public void enqueue(int e) {
		if (front == arr.length - 1) // if there is no space in array
			resize();

		arr[++front] = e;
		size++;
	}

	public int dequeue() {
		if (isEmpty()) // can't dequeue empty array
			throw new IllegalStateException("Cannot dequeue because queue is empty!");
		
		return arr[++rear];
	}

	public int size() {
		return size;
	}

	public int peek() {
		if (isEmpty())
			throw new IllegalStateException("Cannot peek because Queue is empty!");
		
		return arr[rear+1];
	}

	public static void main(String[] args) {
		ArrayQueueImpl q = new ArrayQueueImpl();

		for (int i = 0; i <= 20; i++)
			q.enqueue(i);
		for (int i = 0; i < 14; i++)
			System.out.println("dequeue " + q.dequeue());

		System.out.println("size = " + q.size());
		System.out.println("peeking from queue:" + q.peek());
		System.out.println("pop from queue:" + q.dequeue());
	}
}
