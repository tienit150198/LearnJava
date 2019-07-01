
public class bai10 {
	public static void main(String[] args) {
		int tong, k = 0, j = 0, i;
		while (j < 5) {
			k++;
			tong = 1;
			for (i = 2; i < k; i++) {
				if (k % i == 0) {
					tong = tong + i;
				}
			}
				if (tong == k) {
					System.out.println(k + " ");
					j++;
				}
			}
		}
	}

