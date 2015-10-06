package com.hoo;

/**
 * 2015-10-06-HeadFirstOOAD-Chap2
 * com.hoo
 * <p/>
 * Created by Hoo on 2015. 10. 6..
 */
public class DogDoorSimulator {

  public static void main(String[] args) {
    DogDoor door = new DogDoor();
    Remote remote = new Remote(door);

    System.out.println("Fido barks to go outside...");
    remote.pressButton();

    System.out.println("\nFido has gone outside...");
    System.out.println("\nFido's all done...");
    System.out.println("\nFido's back inside...");
    // main thread 종료, timer 설정된 thread 실행 후, 5초 후 종료
  }
}
