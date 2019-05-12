package ru.itpark.ulmart.domain;

import ru.itpark.ulmart.domain.Product;

public class Skirts extends Product {
    private int size;
    private String color;
    private String length;
    private String style;
    private String brand;

    public Skirts(int id, String name, int price, String type, int size, String color, String length, String style, String brand) {
        super(id, name, price, type);
        this.size = size;
        this.color = color;
        this.length = length;
        this.style = style;
        this.brand = brand;
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

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    //    @Override
////    public String getType() {
////        return null;
////    }
}
