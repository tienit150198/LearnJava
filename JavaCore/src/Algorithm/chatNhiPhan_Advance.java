package Algorithm;

public class chatNhiPhan_Advance {
	// http://ntucoder.net/Problem/Details/135
	// http://ntucoder.net/Problem/Details/1177
	// http://ntucoder.net/Problem/Details/4408
	// http://ntucoder.net/Problem/Details/66
	// http://ntucoder.net/Problem/Details/5574
	// http://vnoi.info/problems/MTWALK/

	// Tìm một điểm x trong một array ( danh sách )
	// Lớn hơn hoặc bằng
	// Bé hơn hoặc bằng

	static int binarySearch1(int a[], int dau, int cuoi, int key) { // tìm số bằng x
		int mid = (dau + cuoi) / 2;

		while (dau <= cuoi) {
			mid = (dau + cuoi) / 2;

			if (a[mid] == key)
				return mid;
			if (a[mid] > key)
				cuoi = mid - 1;
			else
				dau = mid + 1;
		}

		return -1;
	}

	static int binarySearch2(int a[], int dau, int cuoi, int key) { // tìm số lớn hơn x ( số lớn hơn gần nhất)
		int mid = (dau + cuoi) / 2;
		int answer = Integer.MAX_VALUE; // 2147483647
		while (dau <= cuoi) {
			mid = (dau + cuoi) / 2;

			if (a[mid] >= key) {
				answer = Math.min(answer, mid);
				cuoi = mid - 1;
			} else
				dau = mid + 1;
		}

		return answer;
	}

	static int binarySearch3(int a[], int dau, int cuoi, int key) { // tìm số bé hơn x ( số bé hơn gần nhất)
		int mid = (dau + cuoi) / 2;
		int answer = Integer.MIN_VALUE; // 2147483647
		while (dau <= cuoi) {
			mid = (dau + cuoi) / 2;

			if (a[mid] <= key) {
				answer = Math.max(answer, mid);
				dau = mid + 1;
			} else
				cuoi = mid - 1;
		}

		return answer;
	}

	public static void main(String[] args) {
		int a[] = { 5, 6, 7, 8, 10, 11, 12, 13 };
		// 0 -> n -1
		System.out.println(binarySearch3(a, 0, a.length - 1, 9));
	}
}
