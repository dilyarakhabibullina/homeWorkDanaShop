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

}
