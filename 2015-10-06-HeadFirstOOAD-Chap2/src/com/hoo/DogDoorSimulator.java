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
    BarkRecognizer recognizer = new BarkRecognizer(door);

    System.out.println("Fido barks to go outside...");
    Bark fidoBark = new Bark("Woof");
    recognizer.recognize(fidoBark);

    System.out.println("\nFido has gone outside...");
    System.out.println("\nFido's all done...");

    try {
      Thread.sleep(10000);
    } catch (InterruptedException e) {

    }

    System.out.println("... but he's stuck inside!");
    System.out.println("\nFido starts barking");
    recognizer.recognize(fidoBark);
    System.out.println("\nFido's back inside...");
  }
}
