package com.hoo;

/**
 * 2015-09-22-HeadFirstOOAD-Chap1
 * com.hoo
 *
 * search하는데 필요한 기타 사양에 관련된 속성 및 메서드를
 * GuitarSpec이라는 클래스를 만들어 캡슐화한다.
 *
 * Created by Hoo on 2015. 9. 23..
 */
public class GuitarSpec {

  // Guitar를 찾는데 필요한 정보
  private Builder builder;
  private String model;
  private Type type;
  private Wood backWood;
  private Wood topWood;

  public GuitarSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood) {
    this.builder = builder;
    this.model = model;
    this.type = type;
    this.backWood = backWood;
    this.topWood = topWood;
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
}
