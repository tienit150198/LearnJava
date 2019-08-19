package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class collection_Map {
	public static void main(String[] args) {
		// Map<Key, Value> : Key là duy nhất ( không trùng nhau), value có thể trùng nhau
		Map<String, String> x = new HashMap<>();
		
//		x.put("a", "97");
		
		String ab = "userName-->sa";	// xâu ban đầu ( có thể đọc từ file vào)
		
		String split[] = ab.split("-->");	// tách xâu ra, kí tự tách là -->
		// sau khi tách thì split[0] = userName, split[1] = sa
		
		x.put(split[0], split[1]);	// đưa vào Map
		
		System.out.println(x.get("userName"));	// lấy ra đơn giản
		
		System.out.println( x.containsValue("sa") );	// check xem có value là "sa" trong map hay không
		
		// Khi key đã có trong Map rồi, thì nó sẽ nhận value cuối cùng được đưa vào
		x.put(split[0], "sa1");
		
		System.out.println(x.get("userName")); // lấy value của userName
		
		if(x.isEmpty()) {
			x.put(split[0], split[1]);
		}
		
		x.put("1", "10");// lúc này nó có 2 key: 1 và userName
		
		System.out.println("-------------------------------");
		// chuyển nó thành set để xuất ra
		Set<String> xx = x.keySet();	// ketSet : chuyển tất cả các Key của Map sang kiểu dữ liệu Set
		
		// xuất ra ở vòng lặp này
		for (String textTmp : xx) {
			System.out.println(textTmp);
		}
		System.out.println("-------------------------------");
		
		// xóa key 1 ra khỏi map
		x.remove("1");
		
		// tiếp tục xuất lại xem Map nó còn cái gì
		//xx = x.keySet();	// ketSet : chuyển tất cả các Key của Map sang kiểu dữ liệu Set
		
		for (String text : xx) {
			System.out.println(text);
		}
		
		
		System.out.println("#################################################");
		
		x.forEach((key, value)->{
			System.out.println(key + " = " + value);
		});
		
	}
}
