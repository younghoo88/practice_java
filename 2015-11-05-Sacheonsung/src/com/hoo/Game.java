package com.hoo;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;

/**
 * 2015-11-05-Sacheonsung
 * com.hoo
 * <p/>
 * Created by Hoo on 2015. 11. 14..
 */
public class Game {

  private final String[] POSITION = {
      "왼쪽으로 이동",
      "위쪽으로 이동",
      "오른쪽으로 이동",
      "아래쪽으로 이동"
  };

  private String[][] map = {

      {"0", "0", "0", "0", "0"},
      {"0", "!", "@", "#", "0"},
      {"0", "@", "#", "%", "0"},
      {"0", "!", "$", "$", "0"},
      {"0", "%", "0", "*", "0"}

  };

  private final int[] dx = {0, -1, 0, 1};
  private final int[] dy = {-1, 0, 1, 0};

  public boolean findPath(String[][] map, int srcX, int srcY, int dstX, int dstY) {

    if (map[srcX][srcY].equals("0")) {
      Log.i("문자가 존재하지 않습니다.");
      return false;
    }

    if ((srcX == dstX) && (srcY == dstY)) {
      Log.i("같은 좌표입니다.");
      return false;
    }

    if (!map[srcX][srcY].equals(map[dstX][dstY])) {
      Log.i("서로 다른 모양입니다.");
      return false;
    }

    // 방문했는지 안했는지를 기록하는 boolean형 이차원 배열
    boolean[][] visited = new boolean[5][5];

    // visited[][] 배열을 false값으로 초기화해준다.(처음엔 모든 곳에 방문을 안한 상태이므로)
    for (int i = 0; i < visited.length; i++) {
      Arrays.fill(visited[i], false);
    }

    // 찾고자 하는 모양
    String target = map[srcX][srcY];
    // 커브 판별을 위한 배열(왼쪽, 위쪽, 오른쪽, 아래쪽)
    // 한번 움직일 때마다 배열값중 하나의 값이 증가하게 된다.
    // 2번의 커브 이내라는 말은 이 배열값 중 하나라도 0값인 경우를 의미한다.
    // 그림을 그려보면 이해가 쉽다!
    int[] direction = {0, 0, 0, 0};
    // 지나온 경로를 담는 스택
    Stack<Integer> stack = new Stack<Integer>();

    // 실제 탐색은 go()메소드에서 진행된다.
    if (go(map, visited, target, srcX, srcY, dstX, dstY, direction, stack)) {
      map[srcX][srcY] = "0";
      map[dstX][dstY] = "0";
      showMap();
      return true;
    } else {
      return false;
    }
  }

  private boolean go(String[][] map, boolean[][] visited, String target,
                     int x, int y, int dstX, int dstY, int[] direction, Stack<Integer> stack) {

    boolean isFind = true;

    // (x, y)좌표가 map을 벗어났는지 체크한다.
    if (!(x >= 0 && x < map.length) || !(y >= 0 && y < map.length)) {
      return false;
    }

    // 해당 (x, y)좌표에 이미 방문한 적이 있는지 확인한다.
    if (visited[x][y]) {
      return false;
    }

    // "0"이 아니고 target이 아닌 경우(즉, 다른 모양이 있는 경우를 의미한다.)
    // 다시 이전 좌표로 돌아가야 하므로 return
    if (!map[x][y].equals(target) && !map[x][y].equals("0")) {
      return false;
    }

    if ((x == dstX && y == dstY) && !visited[x][y] && map[x][y].equals(target)) {
      Log.i("( " + x + " , " + y + " )");
      Log.i("Target \'" + target + "\'을 찾았습니다.");
      for (int i : direction) {
        if (i == 0) {
          Log.i("2번의 커브 이내에 연결");
          Log.i("이동 경로");
          Iterator<Integer> itr = stack.iterator();
          while (itr.hasNext()) {
            System.out.print(POSITION[itr.next()] + " -> ");
          }
          System.out.println();
          return true;
        }
      }
      Log.i("커브 횟수 초과");
      return false;
    }

    visited[x][y] = true;

    // 4가지 방향(왼쪽, 위쪽, 오른쪽, 아래쪽) 이동을 위한 반복문 수행
    for (int i = 0; i < 4; i++) {
      // Log.i(POSITION[i]);
      direction[i]++;
      stack.push(i);
      isFind = go(map, visited, target, x + dx[i], y + dy[i], dstX, dstY, direction, stack);
      if (isFind) {
        return isFind;
      }
      direction[i]--;
      stack.pop();
    }
    visited[x][y] = false;
    return isFind;
  }

  public void showMap() {

    System.out.println(">> Map");

    for (String[] i : map) {
      for (String j : i) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }

  public String[][] getMap() {
    return map;
  }
}
