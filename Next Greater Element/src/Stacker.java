import java.util.*;

public class Stacker {

	public static void main(String[] args) {

		int[] arr = new int[6];
		arr[0] = 2;
		arr[1] = 4;
		arr[2] = 0;
		arr[3] = 3;
		arr[4] = 12;
		arr[5] = 13;

		Stack<Integer> s = new Stack<>();
		int arr2[] = new int[6];
		s.push(arr[5]);
		arr2[5] = -1;
		for (int i = 4; i >= 0; i--) {
			while (!s.isEmpty() && arr[i] >= s.peek())

				s.pop();

			if (s.isEmpty()) {
				arr2[i] = -1;
			} else {
				arr2[i] = s.peek();
			}

			s.push(arr[i]);
		}

		System.out.println(Arrays.toString(arr2));
	}

}
