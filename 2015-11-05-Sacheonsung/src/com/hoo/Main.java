package com.hoo;

import java.util.Scanner;

/**
 * 2015-11-05-Sacheonsung
 * com.hoo
 * <p/>
 * Created by Hoo on 2015. 11. 6..
 */
public class Main {

  public static void main(String[] args) {

    Game game = new Game();
    game.showMap();

    Scanner sc = new Scanner(System.in);
    /**
     * 테스트예제
     *
     * input#1 : (1, 1) (3, 1)
     *
     * input#2 : (2, 1) (1, 2)
     *
     * input#3 : (2, 2) (1, 3)
     *
     */
    while (true) {
      Log.i("시작점의 (x , y) 좌표 : ");
      Coordinate srcCoord = new Coordinate(sc.nextLine());

      Log.i("도착점의 (x , y) 좌표 : ");
      Coordinate dstCoord = new Coordinate(sc.nextLine());

      boolean isFind = game.findPath(game.getMap(), srcCoord.getCoordinateX(), srcCoord.getCoordinateY(),
          dstCoord.getCoordinateX(), dstCoord.getCoordinateY());
      if (isFind) {
        Log.i("게임 성공");
      } else {
        Log.i("게임 실패");
      }
    }
  }
}
