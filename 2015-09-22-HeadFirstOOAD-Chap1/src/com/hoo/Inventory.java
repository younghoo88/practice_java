package com.hoo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * 2015-09-22-HeadFirstOOAD-Chap1
 * com.hoo
 * <p/>
 * Created by Hoo on 2015. 9. 22..
 */
public class Inventory {

  private List<Guitar> guitars;

  public Inventory() {
    this.guitars = new LinkedList<Guitar>();
  }

  public void addGuitar(String serialNumber, double price, Builder builder,
                        String model, Type type, Wood backWood, Wood topWood) {

    Guitar guitar = new Guitar(serialNumber, price, builder, model, type, backWood, topWood);
    guitars.add(guitar);
  }

  // serialNumber는 고유한 값이므로 하나의 guitar객체만을 반환한다.
  public Guitar getGuitar(String serialNumber) {
    for (Guitar guitar : guitars) {
      if (guitar.getSerialNumber().equals(serialNumber)) {
        return guitar;
      }
    }
    return null;
  }

  public List<Guitar> search(GuitarSpec searchGuitarSpec) {
    List<Guitar> matchingGuitars = new LinkedList<Guitar>();

    for (Guitar guitar : guitars) {
      GuitarSpec guitarSpec = guitar.getGuitarSpec();

      Builder builder = searchGuitarSpec.getBuilder();
      String model = searchGuitarSpec.getModel();
      Type type = searchGuitarSpec.getType();
      Wood backWood = searchGuitarSpec.getBackWood();
      Wood topWood = searchGuitarSpec.getTopWood();

      if ((builder != null) && (!builder.equals("") && (!builder.equals(guitarSpec.getBuilder())))) {
        continue;
      }

      if ((model != null) && (!model.equals("") && (!model.equals(guitarSpec.getModel())))) {
        continue;
      }

      if ((type != null) && (!type.equals("") && (!type.equals(guitarSpec.getType())))) {
        continue;
      }

      if ((backWood != null) && (!backWood.equals("") && (!backWood.equals(guitarSpec.getBackWood())))) {
        continue;
      }

      if ((topWood != null) && (!topWood.equals("") && (!topWood.equals(guitarSpec.getTopWood())))) {
        continue;
      }
      matchingGuitars.add(guitar);
    }
    return matchingGuitars;
  }
}
