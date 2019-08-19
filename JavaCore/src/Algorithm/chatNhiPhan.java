package Algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class chatNhiPhan {

	static public int binarySearch(int dau, int cuoi, int a[], int x) {
		// sapxep
		Arrays.sort(a);

		int mid = (dau + cuoi) / 2;

		while (dau <= cuoi) {
			mid = (dau + cuoi) / 2;

			if (a[mid] == x)
				return mid;

			if (a[mid] > x)
				cuoi = mid - 1;
			else
				dau = mid + 1;
		}

		return -1; // không tìm thấy: tại vì chỉ số của mảng bắt đầu từ 0
	}

	static void insertsort(int a[], int n) {
		for (int i = 1; i < n; i++) {
			for (int j = i; j > 0; j--) {
				if (a[j] < a[j - 1]) {
					int hv = a[i];
					a[i] = a[j];
					a[j] = hv;
				}
			}
		}
	}

	static int a[];
	static int x;
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int n;

		n = scn.nextInt();

		a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = scn.nextInt();
		}

		System.out.print("Nhap x: ");
		x = scn.nextInt();

		// binarySearch
		int index = binarySearch(0, n - 1, a, x);

		if (index == -1) {
			System.out.println("Khong tim thay");
		} else {
			System.out.println("Tim thay o vi tri: " + index);
		}

	}
}
