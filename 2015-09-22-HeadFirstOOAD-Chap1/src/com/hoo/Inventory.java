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

  private List guitars;

  public Inventory() {
    this.guitars = new LinkedList<Guitar>();
  }

  public void addGuitar(String serialNumber, double price, String builder,
                        String model, String type, String backWood, String topWood) {

    Guitar guitar = new Guitar(serialNumber, price, builder, model, type, backWood, topWood);
    guitars.add(guitar);
  }

  public Guitar getGuitar(String serialNumber) {
    for (Iterator<Guitar> i = guitars.iterator(); i.hasNext(); ) {
      Guitar guitar = (Guitar) i.next();
      if (guitar.getSerialNumber().equals(serialNumber)) {
        return guitar;
      }
    }
    return null;
  }

  public Guitar search(Guitar searchGuitar) {
    for (Iterator<Guitar> i = guitars.iterator(); i.hasNext(); ) {
      Guitar guitar = i.next();

      String builder = searchGuitar.getBuilder();
      String model = searchGuitar.getModel();
      String type = searchGuitar.getType();
      String backWood = searchGuitar.getBackWood();
      String topWood = searchGuitar.getTopWood();

      if ((builder != null) && (!builder.equals("") && (!builder.equals(guitar.getBuilder())))) {
        continue;
      }

      if ((model != null) && (!model.equals("") && (!model.equals(guitar.getModel())))) {
        continue;
      }

      if ((type != null) && (!type.equals("") && (!type.equals(guitar.getType())))) {
        continue;
      }

      if ((backWood != null) && (!backWood.equals("") && (!backWood.equals(guitar.getBackWood())))) {
        continue;
      }

      if ((topWood != null) && (!topWood.equals("") && (!topWood.equals(guitar.getTopWood())))) {
        continue;
      }
      return guitar;
    }
    return null;
  }
}
