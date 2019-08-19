package OOP;

public class People1 {
	private String name;
	private int age;

	public People1() {
		this.name = "";
		this.age = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
		People1 p1 = new People1();
		
		p1.setName("Hoàng Anh Chung");
		System.out.println("name = " + p1.getName());
		
	}
}
