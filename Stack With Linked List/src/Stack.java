
public class Stack {

	private Node top;

	private class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	public static void main(String[] args) {

		Stack st = new Stack();
		st.push(12);
		st.push(31);
		st.push(58);
		st.push(53);

		st.display();

		st.pop();

		st.display();
	}

	private void pop() {

		if (isEmpty()) {
			System.out.println("NOTHING TO DELETE");
			return;
		}

		top = top.next;
	}

	private void display() {

		Node temp = top;
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println("END");
	}

	private void push(int i) {
		Node j = new Node(i);
		if (j == null) {
			System.out.println("OVERFLOW");
			return;
		}
		j.next = top;
		top = j;

	}

	private boolean isEmpty() {

		if (top == null)
			return true;
		return false;
	}

}
