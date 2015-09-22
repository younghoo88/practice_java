package com.hoo;

/**
 * 2015-09-22-HeadFirstOOAD-Chap1
 * com.hoo
 * <p/>
 * Created by Hoo on 2015. 9. 22..
 */
public class Guitar {

  private String serialNumber;
  private double price;
  private GuitarSpec guitarSpec;

  public Guitar(String serialNumber, double price, Builder builder,
                String model, Type type, Wood backWood, Wood topWood) {
    this.serialNumber = serialNumber;
    this.price = price;
    this.guitarSpec = new GuitarSpec(builder, model, type, backWood, topWood);
  }

  public String getSerialNumber() {
    return serialNumber;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public GuitarSpec getGuitarSpec() {
    return guitarSpec;
  }
}
