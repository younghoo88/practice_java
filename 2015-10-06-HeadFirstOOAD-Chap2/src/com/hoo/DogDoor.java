package com.hoo;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 2015-10-06-HeadFirstOOAD-Chap2
 * com.hoo
 *
 * Created by Hoo on 2015. 10. 6..
 */
public class DogDoor {

  private boolean open;
  private List<Bark> allowedBark = new ArrayList<Bark>();

  public DogDoor() {
    this.open = false;
  }

  public void open() {
    System.out.println("The dog door opens.");
    open = true;

    final Timer timer = new Timer();
    timer.schedule(new TimerTask() {
      @Override
      public void run() {
        close();
        timer.cancel();
      }
    }, 5000);
  }

  public void close() {
    System.out.println("The dog door closes.");
    open = false;
  }

  public boolean isOpen() {
    return open;
  }

  public List<Bark> getAllowedBark() {
    if (!allowedBark.isEmpty()) {
      return allowedBark;
    } else {
      System.out.println("allowedBark list has not been set.");
      return null;
    }
  }

  public void addAllowedBark(Bark bark) {
    System.out.println("allowedBark is added in list.");
    allowedBark.add(bark);
  }

}
