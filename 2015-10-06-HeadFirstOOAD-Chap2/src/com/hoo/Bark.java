package com.hoo;

/**
 * 2015-10-06-HeadFirstOOAD-Chap2
 * com.hoo
 * <p/>
 * Created by Hoo on 2015. 10. 7..
 */
public class Bark {

  private String sound;

  public Bark(String sound) {
    this.sound = sound;
  }

  public String getSound() {
    return sound;
  }

  public boolean equals(Object bark) {
    if (bark instanceof Bark) {
      Bark otherBark = (Bark) bark;
      if (this.sound.equalsIgnoreCase(otherBark.getSound())) {
        return true;
      }
    }
    return false;
  }

}
