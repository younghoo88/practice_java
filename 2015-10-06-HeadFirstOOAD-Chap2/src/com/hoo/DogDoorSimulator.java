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

    try {
      Thread.currentThread().sleep(10000);
    } catch (InterruptedException e) {

    }

    System.out.println("... but he's stuck inside!");
    System.out.println("\nFido starts barking");
    System.out.println("... so Todd grabs the remote control");
    remote.pressButton();
    System.out.println("\nFido's back inside...");
  }
}
