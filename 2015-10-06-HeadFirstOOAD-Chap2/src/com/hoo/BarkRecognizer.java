package com.hoo;

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

  public void recognize(String bark) {
    System.out.println("BarkRecognizer : Heard a '" + bark + "'");
    door.open();
  }

}
