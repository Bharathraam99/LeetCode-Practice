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

	private void assignLast() {
		Node k = head.next.next;
		Node temp1 = head;
		while (temp1.next != null) {
			temp1 = temp1.next;
		}
		temp1.next = k;
	}

	private void discycle() {
		Node temp = head;
		for (int i = 0; i < 8; i++) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println("END");
	}

	public void removeCycle() {
		Node temp = head;
		Node slow = head;
		Node k = head;
		Node fast = head;
		while (temp != null && temp.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				break;
			}
		}
		while (k != fast) {
			if (k.next.data == fast.next.data) {
				fast.next = null;
				break;
			}
			k = k.next;
			fast = fast.next;
		}
	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println("END");
	}

	public static void main(String[] args) {

		Runner r1 = new Runner();
		r1.addNode(5);
		r1.addNode(1);
		r1.addNode(15);
		r1.addNode(24);
		r1.addNode(88);
		r1.display(r1.head);
		r1.assignLast();
		r1.discycle();
		r1.removeCycle();
		r1.display();
	}

}
