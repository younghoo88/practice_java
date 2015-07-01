package test.hoo;

public class PrivateTestClass {
	private final PrivateClass privateClass;
	
	public PrivateTestClass(String name, int age) {
		this.privateClass = new PrivateClass(name, age);
	}
	
	public PrivateClass getPersonalInfo() {
		return this.privateClass;
	}
}
