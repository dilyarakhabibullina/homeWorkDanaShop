package ru.itpark.ulmart.repository;

import org.springframework.stereotype.Repository;
import ru.itpark.ulmart.domain.IPhone;
import ru.itpark.ulmart.domain.Product;
import ru.itpark.ulmart.domain.TShirt;
import ru.itpark.ulmart.domain.Skirts;
import ru.itpark.ulmart.domain.Slime;

@Repository
public class ProductRepository { // new BookRepository();
    private Product[] items = new Product[100]; // 10 - null
    private int nextIndex = 0;

    public ProductRepository(Product[] items, int nextIndex) {
        this.items = items;
        this.nextIndex = nextIndex;
    }

    public ProductRepository() {
        // FIXME: bad hack
        IPhone iPhone = new IPhone(1, "iPhone новое поступление", 64_000, "iOS", "XR", "Pink", 64);

        TShirt shirt = new TShirt(2, "Футболка Nike", 1000, 52, "Black", "Длинная");
//        shirt.setName("Футболка Nike");
//        shirt.setPrice(1_000);
//        shirt.setSize(52);
//        shirt.setColor("Black");
//        shirt.setLength("Длинная");
//        shirt.setId(2);
//        shirt.setType("tshirt");

//        Skirts skirts = new Skirts();
//        skirts.setPrice(3_000);
//        skirts.setName("Юбка");
//        skirts.setColor("dark blue");
//        skirts.setLength("midi");
//        skirts.setStyle("office");
//        skirts.setBrand("Prada");
//        skirts.setId(3);
//        skirts.setType("skirt");

//        Slime slime = new Slime();
//        slime.setName("Слайм");
//        slime.setPrice(200);
//        slime.setType("happy pie with waffles");
//        slime.setColor("white");
//        slime.setFlavoring("тирамису");
//        slime.setVolume(150);
//        slime.setSupplements("waffles");
//        slime.setId(4);
//        slime.setScent("лаванда");
//        slime.setType("slime");

        add(iPhone);
        add(shirt);
        //add(skirts);
//        add(slime);
    }

    public Product[] getAll() {
        return items;
    }

    public void add(Product product) {
        // TODO: проверить размер (items)
        items[nextIndex] = product;
        nextIndex++;
    }


    public Product getById(int id) {
        for (Product item : items) {
            if (item != null && item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    public void update(Product product) {
        for (int i = 0; i < items.length; i++) {
            Product item = items[i];
            if (item != null && item.getId() == product.getId()) {
                items[i] = product;
            }

        }

    }
    public void removeById (int id) {
        for (int i = 0; i < items.length; i++) {
            Product item = items[i];
            if (item !=null && item.getId()==id) {
                items[i]=null;
                return;
            }
        }
    }
}
