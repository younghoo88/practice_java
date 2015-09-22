package com.hoo;

/**
 * 2015-09-22-HeadFirstOOAD-Chap1
 * com.hoo
 * <p/>
 * Created by Hoo on 2015. 9. 22..
 */
public class Guitar {

  private String serialNumber, builder, model, type, backWood, topWood;
  private double price;

  public Guitar(String serialNumber, double price, String builder,
                String type, String model, String backWood, String topWood) {
    this.serialNumber = serialNumber;
    this.builder = builder;
    this.model = model;
    this.backWood = backWood;
    this.topWood = topWood;
    this.price = price;
  }

  public String getSerialNumber() {
    return serialNumber;
  }

  public String getBuilder() {
    return builder;
  }

  public String getModel() {
    return model;
  }

  public String getType() {
    return type;
  }

  public String getBackWood() {
    return backWood;
  }

  public String getTopWood() {
    return topWood;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }
}
