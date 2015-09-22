package com.hoo;

import java.util.Iterator;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    // 기타 재고 목록 셋업(초기화)
    Inventory inventory = new Inventory();
    initializeInventory(inventory);
    GuitarSpec whatHooLikes = new GuitarSpec(Builder.GIBSON, "2015Version", Type.ACOUSTIC,
        Wood.INDIAN_ROSEWOOD, Wood.ADIRONDACK);


    List<Guitar> matchingGuitars = inventory.search(whatHooLikes);
    if (!matchingGuitars.isEmpty()) {
      for (Iterator<Guitar> i = matchingGuitars.iterator(); i.hasNext(); ) {
        Guitar guitar = i.next();
        GuitarSpec guitarSpec = guitar.getGuitarSpec();
        System.out.println("Younghoo, you might like these guitars");
        System.out.println("Builder : " + guitarSpec.getBuilder());
        System.out.println("Model : " + guitarSpec.getModel());
        System.out.println("Type : " + guitarSpec.getType());
        System.out.println("BackWood : " + guitarSpec.getBackWood());
        System.out.println("TopWood : " + guitarSpec.getTopWood());
      }
    } else {
      System.out.println("Sorry, Younghoo, we have nothing for you");
    }
  }

  /**
   * Inventory에 Guitar를 추가한다.
   * @param inventory
   */
  private static void initializeInventory(Inventory inventory) {
    inventory.addGuitar("12345", 50000, Builder.GIBSON, "2015Version", Type.ACOUSTIC,
        Wood.INDIAN_ROSEWOOD, Wood.ADIRONDACK);
  }
}
