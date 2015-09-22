package com.hoo;

/**
 * 2015-09-22-HeadFirstOOAD-Chap1
 * com.hoo
 * <p/>
 * Created by Hoo on 2015. 9. 22..
 */
public class Guitar {

  private String serialNumber, model;
  private double price;
  private Builder builder;
  private Type type;
  private Wood backWood;
  private Wood topWood;

  public Guitar(String serialNumber, double price, Builder builder,
                String model, Type type, Wood backWood, Wood topWood) {
    this.serialNumber = serialNumber;
    this.builder = builder;
    this.type = type;
    this.model = model;
    this.backWood = backWood;
    this.topWood = topWood;
    this.price = price;
  }

  public String getSerialNumber() {
    return serialNumber;
  }

  public Builder getBuilder() {
    return builder;
  }

  public String getModel() {
    return model;
  }

  public Type getType() {
    return type;
  }

  public Wood getBackWood() {
    return backWood;
  }

  public Wood getTopWood() {
    return topWood;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }
}
