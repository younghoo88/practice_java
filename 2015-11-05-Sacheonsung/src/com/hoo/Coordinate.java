package com.hoo;

import java.util.Scanner;

/**
 * 2015-11-05-Sacheonsung
 * com.hoo
 * <p/>
 * Created by Hoo on 2015. 11. 14..
 */
public class Coordinate {

  private int coordinateX;
  private int coordinateY;
  private String inputStr;

  public Coordinate(String inputStr) {
    inputStr.trim();
    this.inputStr = inputStr.replaceAll("\\s", "");
    split();
  }

  private void split() {
    coordinateX = Integer.parseInt(String.valueOf(inputStr.charAt(1))); // x좌표
    coordinateY = Integer.parseInt(String.valueOf(inputStr.charAt(3))); // x좌표
  }

  public int getCoordinateX() {
    return coordinateX;
  }

  public int getCoordinateY() {
    return coordinateY;
  }
}
