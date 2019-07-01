import java.util.Scanner;

public class array1 {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int arr[] = new int[20];
		int dem = 0;
		int n = scn.nextInt();
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
			dem = 0;
			for (int x = 2; x <= arr[i]; x++) {
				if (arr[i] % x == 0)
					dem++;

			}
			if (dem == 1)
				System.out.println(arr[i] + " ");
		}

	}

}
