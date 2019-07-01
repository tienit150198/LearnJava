
import java.util.Scanner;

public class chung1 {
	// ctrl + space
	// ctrl + D: xÃ³a 1 dÃ²ng nhanh
	// ctrl + F: auto format nhanh
	// biáº¿n cá»¥c bá»™, biáº¿n toÃ n cá»¥c

	// nhá»¯ng method static chá»‰ cÃ³ thá»ƒ gá»�i vÃ  sá»­ dá»¥ng nhá»¯ng biáº¿n cÃ³ kiá»ƒu STATIC
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int n, m;
		n = scn.nextInt();
		m = scn.nextInt();

		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
	}
}
