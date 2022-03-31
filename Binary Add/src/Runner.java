
public class Runner {

	public static void main(String[] args) {

		String a = "11";
		String b = "1";

		StringBuilder ab = new StringBuilder();
		int i = a.length() - 1;
		int j = b.length() - 1;

		int carry = 0;
		int sum = 0;
		while (i >= 0 || j >= 0) {
			sum = carry;

			if (i >= 0)
				sum += a.charAt(i) - '0';

			if (j >= 0)
				sum += b.charAt(j) - '0';

			ab.append(sum % 2);

			carry = sum / 2;

			i--;
			j--;
		}

		if (carry >= 0)
			ab.append(carry);

		System.out.println("Binary Sum: " + ab.reverse().toString());
	}

}
