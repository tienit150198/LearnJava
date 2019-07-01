package basic_commands;

import java.util.Scanner;

public class buoi1 {
	// ctrl + space
	// ctrl + D: xóa 1 dòng nhanh
	// ctrl + shift + F: auto format nhanh
	// biến cục bộ, biến toàn cục

	// những method static chỉ có thể gọi và sử dụng những biến có kiểu STATIC
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// i && ++
		// i trước và ++ sau : Giả sử i là câu lệnh, và ++ tăng giá trị.
		// Tùy theo vị trí của nó để biết thực hiện thằng nào trước.
		// VD: i++ : thực hiện lệnh trước và tăng sau.
		// ++i : tăng trước và thực hiện lệnh sau

//		int x = 1 , y = 4, z = 7;
//		
//		x = y++ + ++z + z++;
//		y = ++z;
//		z = ++z;
//		
//		System.out.println(x + " " + y + " " + z);

		int n;
		n = scn.nextInt();

		int res = (n / 2 + 1) * 30 + n / 2 * 3;

		if (n % 2 == 0)
			res = n / 2 * 30 + n / 2 * 3;
		
		System.out.println(res);
	}
}
