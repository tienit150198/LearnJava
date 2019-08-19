package OOP;

import java.util.Scanner;

public class Person { // tất cả phải làm trong lớp chứ không được làm ở ngoài
	// Đóng gói / Kế thừa (không có đa kế thừa)/ đa hình / trừu tượng
	// mức độ truy cập:

	static Scanner scn = new Scanner(System.in);
	private String name;
	private int age;
	static int count = 0;	// đếm số đối tượng được tạo
	int countTmp = 0;
	static int countName = 0;
	public Person() {
		count++;
		countTmp++;
	}

	public Person(String name, int age) {
		this();	// gọi Person()
		this.name = name;
		this.age = age;
	}

	// Tính đóng gói: bảo vệ dữ liệu
	
	// getter: lấy dữ liệu ra để hiển thị hoặc sử dụng gì đó
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	// setter: thay đổi giá trị của dữ liệu
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void input() {	// Trôi lệnh xảy ra khi: Nhập số trước rồi nhập string sau
		System.out.print("Nhập tên: ");
		name = scn.nextLine();
		System.out.print("Nhập tuổi: ");
		age =  Integer.parseInt(scn.nextLine());
		countName++;
	}
	
	public void display() {
		System.out.println("Tên: " + name);
		System.out.println("Tuổi: " + age);
	}
	
	public static void displayCount() {
		System.out.println("Count = " + Person.count + "\t CountName = " + countName);
	}
	
	public static void main(String[] args) {
		// Class ten_doi_tuong = new Class()

		Person xx = new Person(); // khởi tạo 1 đối tượng
		xx.name = "Chung";
		
		System.out.println(xx.name);
	}
}
