package basic_commands;

import java.util.ArrayList;
import java.util.List;

public class buoi3_collectionBasic {
	/*
	 * List là interface. Array: Giống mảng, nhưng kích thước có thể thay đổi, mặc
	 * định là không đồng bộ Vector: Giống Array, nhưng mặc định là đã được đồng bộ
	 * Linkedlist: Giống Array, nhưng cách lưu trữ khác.
	 * 
	 * 
	 * Queue: Vào trước -> ra trước. Stack: Vào sau -> ra trước Dequeue: là một
	 * queue 2 đầu, có thể vào ra ở trước hoặc sau. PriorityQueue: Queue ưu tiên,
	 * khi đưa dữ liệu vào sẽ được tự động sắp xếp. ---------
	 * 
	 * Set: Dữ liệu lưu trữ không được trùng nhau HashSet: Dữ liệu lưu thế nào thì
	 * sẽ giữ như vậy ( vẫn không trùng nhau) TreeSet: Dữ liệu sẽ được sắp xếp, tốc
	 * độ thực thi nhanh hơn HashSet
	 * 
	 * -------
	 * 
	 * Map: Dữ liệu lưu theo Key, Value. Mỗi key sẽ có 1 value. Key không được trùng
	 * nhau ( key là duy nhất).
	 * 
	 * 
	 */

	public static void main(String[] args) {
//		List<Integer> x = new ArrayList<Integer>();

//		x.add(3);
//		x.add(5);

//		List<Integer> a = new ArrayList<>();

//		a.addAll(x);
//		a.add(7);

//		System.out.println(a.get(2));

//		for(int i = 0 ; i < a.size() ; i++)
//			System.out.println(a.get(i));

//		for (Integer integer : a) {
//			System.out.println(integer);
//		}

//		a.forEach((xx) -> { // lamda: rút gọn code
//			System.out.println(xx);
//		});

		// collection, kieu du lieu, class
		List<List<String>> b = new ArrayList<>();

		List<String> temp = new ArrayList<>();

		temp.add("ab");
		temp.add("bc");
		temp.add("cd");

		List<String> temp1 = new ArrayList<>();
		temp1.add("32");
		temp1.add("cbaaaaa");

		b.add(temp);
		b.add(temp1);

		b.forEach((xx) -> {

			System.out.println(xx); // in dữ liệu đã được lưu vào của xx
			
			xx.forEach((yy) -> {
				System.out.println("Hello " + yy);
			});
		});
		
		
		//		System.out.println(a);
	}
}
