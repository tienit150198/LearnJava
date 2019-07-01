
public class fifteensntdau {
	public static void main(String[] args) {
		int gh = 0, dem, i;
		int sochay=0;
		while (gh < 16) {
			sochay++;
			dem = 0;
			for (i = 2; i <= sochay; i++) {
				if (sochay % i == 0) {
					dem++;
			}
			}
			if (dem == 1) {
				System.out.print(sochay+" ");
				gh++;
			}

		}
	}
}

