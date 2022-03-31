
public class Runner {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 4, 5 };
		int target = 0;

		int left = 0;
		int right = arr.length - 1;

		while (left <= right) {

			int mid = (left + right) / 2;

			if (arr[mid] == target)
			{
				System.out.println("Index where target found: " + mid);
				return;
			}
			else if (arr[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}

		System.out.println("Index where target should be inserted: " + left);
	}

}
