import java.util.Scanner;

public class prob705A {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scn.nextInt();
		String a = "I hate it";
		String a1 = "I hate that";
		String b = "I love it";
		String b1 = "I love that";
		StringBuilder sb = new StringBuilder("");

		for (int i = 1; i < n; i++) {
			if (i % 2 == 1) {
				sb.append(a1 + " ");
			} else
				sb.append(b1 + " ");
		}
		if (n % 2 == 1)
			sb.append(a);
		else
			sb.append(b);

		System.out.println(sb);
	}
}
