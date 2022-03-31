
public class Runner {

	private void palindromeCheck(int r) {

		int num = r;
		int sum = 0;
		if (num < 0) {
			System.out.println("False");
			return;
		} else {
			while (num > 0) {
				int d = num % 10;
				sum = sum * 10 + d;
				num /= 10;
			}
			if (sum == r) {
				System.out.println("True");
				return;
			} else {
				System.out.println("False");
				return;
			}
		}
	}

	public static void main(String[] args) {
		Runner r = new Runner();
		r.palindromeCheck(211);
	}

}
