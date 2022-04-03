
public class Runner {

	public static void main(String[] args) {

		int[] arr = { 7, 1, 3, 5, 6, 4 };

		int min = arr[0];
		int max = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] <= min) {
				min = arr[i];
			} else if (arr[i] - min > max) {
				max = arr[i] - min;
			}
		}
		System.out.println("Max Profit: " + max);
	}

}
