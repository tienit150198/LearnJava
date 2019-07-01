
import java.util.Scanner;

public class sort1 {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int min;

		int arr[] = new int[100];
		min = arr[0];
		int n = scn.nextInt();
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
			if (min > arr[i]) 
				min=arr[i];
				System.out.print(" min trong day la:");
				System.out.println(+min);
				if(arr[i]==min) {
			System.out.println(+arr[i]);
		}
	}
}
}


