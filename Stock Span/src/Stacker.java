import java.util.Arrays;
import java.util.Stack;

public class Stacker {

	public static void main(String[] args) {

		int[] arr = {2,5,9,3,1,12,6,8,7};
		

		Stack<Integer> s = new Stack<>();
		int arr2[] = new int[arr.length];
		s.push(0);
		arr2[0] = 1;
		for (int i = 1; i < arr.length; i++) {
			while (!s.isEmpty() && arr[i] > arr[s.peek()])

				s.pop();

			if (s.isEmpty()) {
				arr2[i] = i+1;
			} else {
				arr2[i] = i-s.peek();
			}

			s.push(i);
		}

		System.out.println(Arrays.toString(arr2));
	}

}
