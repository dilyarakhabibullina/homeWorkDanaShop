package ru.itpark.ulmart.domain;

public class IPhone extends SmartPhone /*, Colored - множественное наследование запрещено */ {
  private String model;
  private String color;
  private int memorySize;

  public IPhone(int id, String name, int price, String os, String model, String color, int memorySize) {
    super(id, name, price, "iphone", os);
    this.model = model;
    this.color = color;
    this.memorySize = memorySize;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getMemorySize() {
    return memorySize;
  }

  public void setMemorySize(int memorySize) {
    this.memorySize = memorySize;
  }

  //@Override
  //public String getType() {
    //return "iphone";
  //}
}
