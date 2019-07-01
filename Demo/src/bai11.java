
public class bai11 {
	public static void main(String[] args) {
		int i, n;
		int dem0 = 0;
		for (i = 0; i < 100; i++) {
			switch (n = i % 5) {
			case 0:
				dem0++;

				if (i % 5 == 0) {
					System.out.println(+i);
				}
				break;

			}
		}
		System.out.println(+dem0);
	}
}
