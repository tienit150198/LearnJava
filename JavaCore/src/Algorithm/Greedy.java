package Algorithm;

import java.util.Scanner;

//		thuật toán tham lam: greedy
// Thuật toán tham lam: tại một thời điểm -> ưu tiên lấy những thằng ngon nhất

// Bài toán ATM: Người ta bỏ trong cây ATM những số tiền: 1, 5, 10, 20, 100.
// Yêu cầu: Khi có người chạy tới rút tiền, hãy trả lại cho người ta số tờ tiền ít nhất có thể.
// VD: 100 -> 1 tờ 100k
// Lấy 150k -> 1 tờ 100k, 2 tờ 20k, 1 tờ 10k.

// Giải: Lấy số tiền lớn nhất -> bé nhất.

public class Greedy {
	public static void ATM(String[] args) {
		int money[] = { 100, 20, 10, 5, 1 }; // đã sắp xếp từ lớn -> bé rồi, nếu chưa sắp xếp thì cần phải sort lại
		int payment;
		Scanner scn = new Scanner(System.in);

		int countPayment = 0;
		System.out.print("Nhập số tiền cần rút: ");
		payment = scn.nextInt();

		for (int i = 0; i < money.length; i++) {
			if (payment >= money[i]) { // Điều kiện để rút được tiền so với số tiền hiện tại

				int tmp = (payment / money[i]);	// Lấy được số tờ tiền
				payment = payment - (tmp * money[i]); // Số tiền sau khi rút tmp tờ
				countPayment += tmp;	// cộng số tờ tiền được rút vào
			}
		}

		System.out.println("Tổng cộng có tất cả : " + countPayment + " tờ tiền");

		scn.close();
	}
	
	public static void main(String[] args) {
		
	}
}
