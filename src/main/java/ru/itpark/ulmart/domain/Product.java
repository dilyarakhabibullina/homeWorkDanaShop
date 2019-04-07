package ru.itpark.ulmart.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter // сгенерировать get'еры для всех полей
@Setter // сгенерировать set'еры для всех полей
@NoArgsConstructor // сгенерировать конструктор без параметров
@AllArgsConstructor // сгенерировать конструктор со всеми параметрами
public class Product {
  private int id;
  private String name;
  private int price;
}
