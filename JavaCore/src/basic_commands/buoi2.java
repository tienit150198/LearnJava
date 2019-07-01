package basic_commands;

import java.util.Scanner;

public class buoi2 {

	public static boolean isOdd(int x) {
		return (x % 2 == 1);
	}

	public static boolean isEven(int x) {
		return (x % 2 == 0);
	}

	public static int isSum(int n) {
		int result = 0;

		for (int i = 1; i <= n; i++)
			result += i;

		return result;
	}

	/*
	 * Kiểu dữ liệu không trả về: void trả về: int, long ; float, double ; boolean ;
	 * string,...
	 */
	static Scanner scn = new Scanner(System.in);

	static void nhapMatran(int a[][], int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++)
				a[i][j] = scn.nextInt();
		}
	}

	static void xuatMatran(int a[][], int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++)
				System.out.print(a[i][j] + " ");

			System.out.println();
		}
	}

	public static void main(String[] args) {

		String x = "123";

		// Biến đổi từ String -> Int, float và ngược lại
		int a = Integer.parseInt(x);

		float b = Float.parseFloat(x);
		System.out.println(b);

		// ------------------
		int aa = 12345;
		x = String.valueOf(aa);

//		x = "abxcfe1f56as1d6";
//		
//		if(x.startsWith("abc")) {	// bắt đầu với xâu "abc" phải không.
//			System.out.println("true");
//		}else
//			System.out.println("false");
		
		int xx = 1;
		int count = (int) (Math.log10(xx) + 1);

		
		System.out.println(count);
		// collections: Linked List, Array List, Vector, Queue, Stack, Map, HashMap, TreeMap, Set,...
	}
}
