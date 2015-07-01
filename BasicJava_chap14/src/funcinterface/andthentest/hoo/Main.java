package funcinterface.andthentest.hoo;

public class Main {
  public static void main(String[] args) {
    TestInterface<Member> test = (t) -> {
      t.showInfo();
    };
    
    TestInterface<Member> test2 = (t) -> {
      System.out.println("test2 호출");
    };
    
    TestInterface<Member> test12 = test.andThen(test2);
    test12.foo(new Member("후"));
    System.out.println(test12.toString());
  }
}
