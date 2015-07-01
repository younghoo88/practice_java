package funcinterface.andthentest.hoo;

public interface TestInterface<T> {
  
  public void foo(T t);
  public default TestInterface<T> andThen(TestInterface<T> after) {
    
    /**
     * 여기서 this는 현재 andThen을 호출한 Main.java의 test객체를 가리킨다.
     */
    
    // 람다식
    return (T t) -> {
      this.foo(t);
      after.foo(t);
    };
    
    // 익명 구현 객체방식
    /* return new TestInterface<T> () {
     *   public void foo(T t) {
     *     this.foo(t);
     *     after.foo(t);
     *   }
     * }
     */
    
  }
}
