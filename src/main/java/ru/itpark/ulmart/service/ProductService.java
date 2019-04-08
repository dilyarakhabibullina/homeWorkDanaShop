package ru.itpark.ulmart.service;

import org.springframework.stereotype.Service;
import ru.itpark.ulmart.domain.Product;
import ru.itpark.ulmart.repository.ProductRepository;

@Service
public class ProductService { // new BookService(-> <-);
    private ProductRepository repository;
    private int nextId = 1;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public Product[] getAll() {
        return repository.getAll();
    }
    public Product[] searchByName(String name) {
        Product[] result = new Product[10];
        int resultIndex = 0;
        Product[] product = repository.getAll();
        for (Product items : product) {
            if (items == null) {
                continue;
            }

            //for (Product product : products) {
            //if (product == null) {
            //continue;

            if (!items.getName().contains(name)) {
                continue;
            }
            result[resultIndex] = items;
            resultIndex++;
        }
        return result;
    }

}
