package ru.itpark.ulmart.domain;

public class TShirt extends Product {
  private int size;
  private String color;
  private String length;

  public TShirt(int id, String name, int price, int size, String color, String length) {
    super(id, name, price, "tshirt");
    this.size = size;
    this.color = color;
    this.length = length;
  }

  public String getLength() {
    return length;
  }

  public void setLength(String length) {
    this.length = length;
  }

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

//    @Override
//    public String getType() {
//        return null;
//    }
}


//data-th-if="${product instanceOf T(ru.itpark.ulmart.domain.TShirt)}"