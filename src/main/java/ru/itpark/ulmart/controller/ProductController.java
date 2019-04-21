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


    @GetMapping
    public String index(Model model) {
        model.addAttribute("products", repository.getAll());//добавляю в модель products для вьюшки, в качестве значения-
        // список из всех продуктов
        return "index"; // строчка с именем шаблона (без расширения)
    }

    @GetMapping("/searchresult") // http://localhost:8080/add
    public String searchingPage(@RequestParam String search, Model model) {
        model.addAttribute("products", service.searchByName(search));
        model.addAttribute("search", search);
        return "searchresult";
    }

    @PostMapping// RequestMapping: http://localhost:8080/ -> GET, POST, PUT, DELETE, @GetMapping только на GET
    public String frontpage(Model model, @RequestParam String name) {
        service.searchByName(name);
        model.addAttribute("products", service.searchByName(name));
        return "index"; // строчка с именем шаблона (без расширения)
    }
//
//    @PostMapping(params = "search") // params указали, чтобы не было конфликта с предыдущим маппингом
//    public String searchPage(@RequestParam String search, Model model) {
//
//        return "searchresult";
//    }

    @PostMapping(params = "name")// равносильно @RequestMapping(value = "/add", method = "POST")
    // title должен быть равен тому, что в форме name (name="title")
    public String add(Model model, @RequestParam String name, @RequestParam int price) {
        service.create(name, price);
        model.addAttribute("products", service.getAll());
        return "searchresult";
    }

    @GetMapping("/view/{id}")
    public String details(@PathVariable int id, Model model) {
        model.addAttribute("product", service.getById(id));
        return "details";
    }
}














