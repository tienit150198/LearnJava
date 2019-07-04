import java.util.Scanner;

public class prob1162A {

	static int n, h, m;
	
	static Scanner scn = new Scanner(System.in);
	static int a[];
	public static void main(String[] args) {
		n = scn.nextInt();
		h = scn.nextInt();
		m = scn.nextInt();
		
		a = new int[n+1];
		for(int i = 1 ; i <= n ; i++)
			a[i] = h;
		
		int l, r, x;
		for(int i = 0; i < m ; i++) {
			l = scn.nextInt();
			r = scn.nextInt();
			x = scn.nextInt();

			for(int j = l ; j <= r ; j++) {
				a[j] = Math.min(a[j], x);
			}
		}

		int res = 0;

		for (int i = 1; i <= n; i++)
			res += (a[i] * a[i]);

		System.out.println(res);
	}

}
