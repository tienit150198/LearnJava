package Collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class collection_set {
	 // những phần tử trong set không được trùng nhau.
	// Hash set, tree set
	static String x = new String();		// khởi tạo một string mới
	public static void xx(String[] args) {
		Set<String> s = new HashSet<String>();
		
		s.add("0");
		s.add("3");
		
		// một số hàm của Set
		
		
		// rỗng : có rổ mà chưa có trứng
		// null: không có trứng và không có rổ
		
		System.out.println("Size of Set = " + s.size());
		
//		for (String str : s) {
//			x = x.concat(str);
//		}
		
		s.forEach((a) -> { // do Set có kiểu dữ liệu là String --> a có kiểu dữ liệu là String
			// Vậy a có thể sài tất cả các hàm của kiểu dữ liệu String
			x = a.concat(x);
		});
		// Ở vương quốc phù thủy có một trò chơi dân gian rất hay. Trò chơi được mô tả như sau:
		// Tất cả mọi người phân thân và đứng vào một dãy có độ dài N.
		// Sau đó người quản trò sẽ chọn ra một con số bất kì và loại người đó khỏi trò chơi.
		// Hãy tìm người sống sót cuối cùng.
		// N = 10.
		// A B C sắp xếp như sau: A B A A B C A C C B ( 1 -> 10)
		// Sài List hoặc vector.
		// chọn 2 -> A A A B C A C C B 
		// Chọn 3 -> A A B C A C C B 
		
	}
	public static void main(String[] args) {
		Set<String> s1 = new TreeSet<String>();
		// băm: đưa vào một số hoặc một chuỗi gì đấy -> băm thành một dãy các kí tự ( gồm chữ và số )
		// Những dữ liệu lớn mà sau này có thể cần tìm kiếm -> ưu tiên sài hash

		s1.add("5");
		s1.add("3");	// kích cỡ tối đa của Set là INT_MAX = 2147483647
		s1.add("10");
		
		System.out.println("INT_MAX = " + Integer.MAX_VALUE);
		
		System.out.println("set before delete: " + s1);
		
		s1.clear();	// xóa dữ liệu
		
		System.out.println("Set after delete: " + s1);
		
	}
}
