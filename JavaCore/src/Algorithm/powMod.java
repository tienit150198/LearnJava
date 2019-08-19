package Algorithm;

import java.util.Scanner;

public class powMod {
//		hàm tính pow nó đúng với những trường hợp số nhỏ, nhưng có một số hạn chế như sau:
//		1. Khi tính mũ mà ra kết quả số lớn thì có thể bị sai số.
//		2. Giới hạn lớn nhất của hàm pow hệ thống chỉ tính tới max của kiểu int: 2147483647
	
	static long mod = 1000000007;
	
	static public long _pow (long a, long n) {	// a ^ n
		if(n == 0)
			return 1;
		if(n == 1) {
			return a;// mod khi nào? lúc mà mình cảm thấy khi mình thực hiện phép tính tại đó thì giá trị có thể vượt giới hạn
		}
		
		long res = _pow(a, n / 2);
		// có tồn tại thằng như thế này, gặp bài toán xx -> sử dụng cái đó.
		// nó để làm gì
		// chạy thế nào
		
		res = ( res * res );	// mod để chống tràn
		
		if(n % 2 == 1)	// nếu mũ là số lẻ
			res = (res * a);
		
		return res;
	}
	
	// BFS DFS, sinh, quy hoạch động, chặt nhị phân, cây nhị phân, trie, kmp ( hash), segment tree: 
	public static void main(String[] args) {

		long a, n;
		Scanner scn = new Scanner(System.in);
		
		a = scn.nextLong();
		n = scn.nextLong();
	
		long result = _pow(a,n);
		System.out.println(result);
		
		System.out.println(result % 10);
		
		scn.close();
		
		// kết quả của mình sẽ rất lớn, vì vậy cần phải đem mod cho 10^9 + 7
		// Số nguyên tố: 10^9+7
		// hash: sử dụng số nguyên tố
	}
}
