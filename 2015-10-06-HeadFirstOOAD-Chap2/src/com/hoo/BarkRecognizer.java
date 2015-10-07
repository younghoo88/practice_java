package com.hoo;

import java.util.Iterator;

/**
 * 2015-10-06-HeadFirstOOAD-Chap2
 * com.hoo
 *
 * Created by Hoo on 2015. 10. 7..
 */
public class BarkRecognizer {

  private DogDoor door;

  // 어떤 문을 열어야할지 알아야하므로
  public BarkRecognizer(DogDoor door) {
    this.door = door;
  }

  public void recognize(Bark bark) {
    System.out.println("BarkRecognizer : Heard a '" + bark.getSound() + "'");
    Iterator<Bark> iterator = door.getAllowedBark().iterator();
    while (iterator.hasNext()) {
      if (iterator.next().equals(bark)) {
        door.open();
        return;
      }
    }
    System.out.println("This dog is not allowed.");
  }

}
