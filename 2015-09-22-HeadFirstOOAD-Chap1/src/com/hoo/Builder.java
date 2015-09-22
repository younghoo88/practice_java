package com.hoo;

/**
 * 2015-09-22-HeadFirstOOAD-Chap1
 * com.hoo
 * <p/>
 * Created by Hoo on 2015. 9. 22..
 */
public enum Builder {

  FENDER, MARTIN, GIBSON, COLLINGS, OLSON, RYAN, PRS, ANY;

  @Override
  public String toString() {
    switch (this) {
      case FENDER: return "Fender";
      case MARTIN: return "Martin";
      case GIBSON: return "Gibson";
      case COLLINGS: return "Collings";
      case OLSON: return "Olson";
      case RYAN: return "Ryan";
      case PRS: return "PRS";
      case ANY: return "ANY";
      default: return "unspecified";
    }
  }
}
