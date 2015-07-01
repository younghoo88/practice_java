package test.hoo;

public class Main {
	public static void main(String[] args) {
		PrivateTestClass privateTestClass = new PrivateTestClass("hoo", 11);
		System.out.println("객체 생성 후 정보 출력");
		System.out.println(privateTestClass.getPersonalInfo().getInfo());
		System.out.println("private 멤버 변수 접근");
		privateTestClass.getPersonalInfo().setInfo("foo", 99);
		System.out.println(privateTestClass.getPersonalInfo().getInfo());
		
		System.out.println("PrivateTestClass : " + privateTestClass);
		System.out.println("PrivateClass : " + privateTestClass.getPersonalInfo());
		
	}
}
