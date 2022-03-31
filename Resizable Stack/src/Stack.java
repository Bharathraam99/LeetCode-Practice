
public class Stack {

	int capacity = 2;
	int[] st = new int[capacity];
	int top = 0;

	int size = 0;

	public static void main(String[] args) {

		Stack s = new Stack();

		s.push(12);
		s.display();
		s.push(15);
		s.display();
		s.push(58);
		s.display();
		s.push(13);
		s.display();
		s.push(31);
		s.display();

		s.pop();
		s.display();
		s.pop();
		s.display();
		s.pop();
		s.display();
		s.pop();
		s.display();

	}

	private void push(int i) {

		if (size == capacity) {
			grow();
		}
		st[top] = i;
		top++;
		size += 1;

	}

	private void pop() {
		if (isEmpty()) {
			System.out.println("Empty");
			return;
		}
		top--;
		st[top] = 0;
		size -= 1;
		shrink();
	}

	private void peek() {
		System.out.println(st[top - 1]);
	}

	private void display() {
		for (Integer i : st) {
			System.out.print(i + ">");
		}
		System.out.println();
	}

	private boolean isEmpty() {

		if (top <= 0) {
			return true;
		}
		return false;

	}

	private boolean isFull() {

		if (top == 5)
			return true;
		return false;
	}

	private void grow() {
		int length = size;
		int[] k = new int[capacity * 2];
		System.arraycopy(st, 0, k, 0, length);
		st = k;
		capacity *= 2;
	}

	private void shrink() {

		int length = size;
		if (length <= (capacity / 2) / 2) {
			capacity /= 2;
		}
		int[] k = new int[capacity];
		System.arraycopy(st, 0, k, 0, length);
		st = k;
		capacity /= 2;

	}
}
