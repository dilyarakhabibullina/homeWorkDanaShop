package ru.itpark.ulmart.domain;

public abstract class SmartPhone extends Product {
  private String os;

  public SmartPhone(int id, String name, int price, String type, String os) {
    super(id, name, price, type);
    this.os = os;
  }

  public String getOs() {
    return os;
  }

  public void setOs(String os) {
    this.os = os;
  }
}
