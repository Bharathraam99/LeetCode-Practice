import java.util.HashMap;
import java.util.Map;

public class Runner {

	private Node head;
	private int size;

	private class Node {
		private Node next;
		private int data;

		Node() {
		}

		Node(int data) {
			this.data = data;
		}
	}

	private void addNode(int val) {
		Node temp = head;
		Node k = new Node(val);
		if (head == null) {
			head = k;
			k.next = null;
			size += 1;
			return;
		}
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = k;
		k.next = null;
		size += 1;
	}

	private void display(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println("END");
	}

	private Node addNum(Node r1, Node r2) {

		Node t1 = r1;
		Node t2 = r2;
		int carry = 0;
		Node m = new Node();
		Node t = m;
		while (t1 != null || t2 != null || carry == 1) {
			int sum = 0;
			if (t1 != null) {
				sum += t1.data;
				t1 = t1.next;
			}

			if (t2 != null) {
				sum += t2.data;
				t2 = t2.next;
			}

			sum = sum + carry;
			Node k = new Node(sum % 10);
			carry = sum / 10;
			t.next = k;
			k.next = null;
			t = t.next;

		}
		return m.next;
	}

	public static void main(String[] args) {

		Runner r1 = new Runner();
		r1.addNode(5);
		r1.addNode(5);
		r1.addNode(5);
		r1.display(r1.head);

		Runner r2 = new Runner();
		r2.addNode(5);
		r2.addNode(6);
		r2.addNode(4);
		r2.display(r2.head);

		Runner r3 = new Runner();
		r3.display(r3.addNum(r1.head, r2.head));

	}

}
