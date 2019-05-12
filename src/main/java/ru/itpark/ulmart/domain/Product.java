package ru.itpark.ulmart.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter // сгенерировать get'еры для всех полей
@Setter // сгенерировать set'еры для всех полей
@NoArgsConstructor // сгенерировать конструктор без параметров
//@AllArgsConstructor // сгенерировать конструктор со всеми параметрами
public class Product {
    private int id;
    private String name;
    private int price;
    private String type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Product(int id, String name, int price, String type) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.type = type;
    }
}
