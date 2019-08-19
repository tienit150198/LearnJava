package OOP;

public class People {
	String name;
	int age;
	static String college = "Bưu Chính Viễn Thông Hà Nội";

	public People() { // constructor không tham số
		this.name = "";
		this.age = 0;
	}

	public People(String name) { // constructor 1 tham số
		this();// gọi constructor không tham số
		this.name = name;
		this.age = 0;
	}

	public People(String name, int age) { // constructor 2 tham số
		this(); // gọi constructor không tham số
		this.name = name;
		this.age = age;
	}

	public void display() {
		System.out.println(name + " - " + age + " - " + college);

	}

	static public void changeCollege() {
		college = "Kiến Trúc Đà Nẵng";
	}

	public static void main(String[] args) {
		People p1 = new People("Chung", 22);

		p1.display(); // cần phải gọi instance

		changeCollege(); // hoặc có thể gọi People.changeCollege(); | không cần gọi instance

		People p2 = new People("Tien", 22);

		p2.display();
	}
}
