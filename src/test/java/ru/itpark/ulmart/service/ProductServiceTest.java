package ru.itpark.ulmart.service;

import org.junit.Test;
import ru.itpark.ulmart.domain.IPhone;
import ru.itpark.ulmart.domain.Product;
import ru.itpark.ulmart.domain.Slime;
import ru.itpark.ulmart.domain.TShirt;
import ru.itpark.ulmart.repository.ProductRepository;

import static org.junit.Assert.*;

public class ProductServiceTest {

    @Test
    public void searchByName() {
        ProductRepository repository = new ProductRepository();
        ProductService service = new ProductService(repository);
        service.create("iphone", 64000);
        service.create ("юбка", 8000);
        service.create("happy iphone pie", 300);

        Product[] items = service.searchByName("iphone");
        assertEquals("iphone", items[0].getName());
        assertEquals("happy iphone pie", items[1].getName());

    }
}