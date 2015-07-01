package test.hoo;

public class PrivateClass {
	String name;
	int age;
	
	public PrivateClass(String name, int age) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getInfo() {
		return getName() + " , " + getAge();
	}
	
	public void setInfo(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("setInfo 호출!");
	}
}