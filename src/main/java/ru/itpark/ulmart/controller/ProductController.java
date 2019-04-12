package ru.itpark.ulmart.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.itpark.ulmart.domain.Product;
import ru.itpark.ulmart.repository.ProductRepository;
import ru.itpark.ulmart.service.ProductService;

@Controller
@AllArgsConstructor // сгенерирует конструктор
public class ProductController {
    private ProductService service;
    private ProductRepository repository;

    // mapping -> привязка метода к обработке URL'а
    @GetMapping("/details") // http://localhost:8080/add
    public String addPage() {
        return "details";
    }

    @GetMapping("/searchresult") // http://localhost:8080/add
    public String searchingPage() {
        return "searchresult";
    }

    @GetMapping
    public String index(Model model) {
        model.addAttribute("products", repository.getAll());
        return "index"; // строчка с именем шаблона (без расширения)
    }

    @PostMapping// RequestMapping: http://localhost:8080/ -> GET, POST, PUT, DELETE, @GetMapping только на GET
    public String frontpage(Model model, @RequestParam String name) {
        service.searchByName(name);
        model.addAttribute("products", service.searchByName(name));
        return "index"; // строчка с именем шаблона (без расширения)
    }
    @PostMapping("/details") // равносильно @RequestMapping(value = "/add", method = "POST")
    // title должен быть равен тому, что в форме name (name="title")
    public String add(@RequestParam Product product) {
        repository.add(product);
        return "details"; // "редиректим на главную"
    }

}
