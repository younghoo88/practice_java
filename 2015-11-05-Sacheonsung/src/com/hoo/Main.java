package com.hoo;

import java.util.Arrays;

/**
 * 2015-11-05-Sacheonsung
 * com.hoo
 * <p/>
 * Created by Hoo on 2015. 11. 6..
 */
public class Main {

  public final static String[] POSITION = {
      "왼쪽으로 이동",
      "윗쪽으로 이동",
      "오른쪽으로 이동",
      "아래쪽으로 이동"
  };

  public static String[][] map = {

      {"0", "0", "0", "0", "0"},
      {"0", "!", "@", "#", "0"},
      {"0", "@", "#", "%", "0"},
      {"0", "!", "$", "$", "0"},
      {"0", "%", "0", "0", "0"}

  };

  public final static int[] dx = {0, -1, 0, 1};
  public final static int[] dy = {-1, 0, 1, 0};

  public static boolean findPath(String[][] map, boolean[][] visited, String target, int srcX, int srcY, int dstX, int dstY) {

    if ((srcX == dstX) && (srcY == dstY)) {
      return false;
    }

    if (!map[srcX][srcY].equals(map[dstX][dstY])) {
      return false;
    }

    go(map, visited, target, srcX, srcY, 0);

    return true;
  }

  public static void go(String[][] map, boolean[][] visited, String target, int x, int y, int depth) {

    // Log.i("depth : " + depth);

    if (!(x >= 0 && x < map.length) || !(y >= 0 && y < map.length)) {
      // Log.i("범위를 벗어났습니다.");
      return;
    }

    if (visited[x][y]) {
      // Log.i("이미 지났던 길입니다.");
      return;
    }

    if (!map[x][y].equals(target) && !map[x][y].equals("0")) {
      return;
    }

    if (!(x == 2 && y == 1) && !visited[x][y] && map[x][y].equals(target)) {
      Log.i("Target을 찾았습니다.");
      return;
    }

    visited[x][y] = true;
    depth++;

    // iteration for moving 4-directions
    for (int i = 0; i < 4; i++) {
      // Log.i(POSITION[i]);
      go(map, visited, target, x + dx[i], y + dy[i], depth);
    }

    visited[x][y] = false;
    depth--;
    return;
  }

  public static void showMap(String[][] map) {
    for (String[] i : map) {
      for (String j : i) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {

    boolean[][] visited = new boolean[5][5];
    boolean[] test = new boolean[3];
    for (int i = 0; i < visited.length; i++) {
      Arrays.fill(visited[i], false); // init array to false
    }
    showMap(map);
    System.out.println(findPath(map, visited, "@", 2, 1, 1, 2));
  }
}
