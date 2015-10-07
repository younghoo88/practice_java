package com.hoo;

/**
 * 2015-10-06-HeadFirstOOAD-Chap2
 * com.hoo
 *
 * Created by Hoo on 2015. 10. 6..
 */
public class Remote {

  private DogDoor door;

  public Remote(DogDoor door) {
    this.door = door;
  }

  public void pressButton() {
    System.out.println("Pressing the remote control button...");
    if (door.isOpen()) {
      door.close();
    } else {
      door.open();
    }
  }
}
