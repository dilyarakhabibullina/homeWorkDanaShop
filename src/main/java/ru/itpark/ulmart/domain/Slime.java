package ru.itpark.ulmart.domain;

import ru.itpark.ulmart.domain.Product;

public class Slime extends Product {
    private String color;
    private int volume;
    private String scent;
    private String flavoring;
    private String supplements;

    public Slime(int id, String name, int price, String type, String color, int volume, String scent, String flavoring, String supplements) {
        super(id, name, price, type);
        this.color = color;
        this.volume = volume;
        this.scent = scent;
        this.flavoring = flavoring;
        this.supplements = supplements;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getScent() {
        return scent;
    }

    public void setScent(String scent) {
        this.scent = scent;
    }

    public String getFlavoring() {
        return flavoring;
    }

    public void setFlavoring(String flavoring) {
        this.flavoring = flavoring;
    }

    public String getSupplements() {
        return supplements;
    }

    public void setSupplements(String supplements) {
        this.supplements = supplements;
    }
}
