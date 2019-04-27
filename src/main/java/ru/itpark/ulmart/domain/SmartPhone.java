package ru.itpark.ulmart.domain;

public abstract class SmartPhone extends Product {
  private String os;

  public String getOs() {
    return os;
  }

  public void setOs(String os) {
    this.os = os;
  }
}
