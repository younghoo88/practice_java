package com.hoo;

/**
 * 2015-09-22-HeadFirstOOAD-Chap1
 * com.hoo
 * <p/>
 * Created by Hoo on 2015. 9. 22..
 */
public enum Type {
  ACOUSTIC, ELECTRIC;

  @Override
  public String toString() {

    switch (this) {
      case ACOUSTIC: return "acoustic";
      case ELECTRIC: return "electric";
      default: return "unspecified";
    }

  }
}
