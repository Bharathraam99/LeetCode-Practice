import java.util.HashMap;
import java.util.Map;

public class Runner {

	private Node head;
	private int size;

	private class Node {
		private Node next;
		private int data;

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

	private void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println("END");
	}

	private void addSum(int target) {

		Map<Integer, Integer> m = new HashMap<Integer, Integer>();

		Node temp = head;
		int ans[] = new int[2];
		for (int i = 0; i < size; i++) {
			if (m.containsKey(target - temp.data)) {
				ans[0] = m.get(target - temp.data);
				ans[1] = i;
				break;
			} else {
				m.put(temp.data, i);
			}
			temp = temp.next;
		}

		System.out.println("["+ans[0] + "," + ans[1]+"]");

	}

	public static void main(String[] args) {

		Runner r = new Runner();
		r.addNode(2);
		r.addNode(7);
		r.addNode(11);
		r.addNode(15);
		r.display();
		r.addSum(9);

	}

}
