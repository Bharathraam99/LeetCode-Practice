
public class Max {

	static int c = 1;

	public static void main(String[] args) {

		int p[] = { 2,341,4,4,13,31,13,2 };
		int k = 4;
		int max = Integer.MIN_VALUE;
		int i = 0;
		for (i = 0; i < p.length; i++) {

			if (i + 4 <= p.length) {

				for (int j = i; j < i + 4; j++) {
					if (p[j] > max) {
						max = p[j];
					}
				}
				System.out.print(max + " ");
				if (i + 1 != p.length)
					max = p[i + 1];
			}

			else {
				break;
			}
		}
		System.out.println(p[i]);
	}

}
