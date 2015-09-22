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

  public void addGuitar(String serialNumber, double price, Builder builder,
                        String model, Type type, Wood backWood, Wood topWood) {

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

  public List<Guitar> search(GuitarSpec searchGuitarSpec) {
    List<Guitar> matchingGuitars = new LinkedList<Guitar>();
    for (Iterator<Guitar> i = guitars.iterator(); i.hasNext(); ) {
      Guitar guitar = i.next();
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
