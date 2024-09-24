package com.bookshop.bookshopcatalogservice.web;


import com.bookshop.bookshopcatalogservice.config.BookShopProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final BookShopProperties bookShopProperties;

    public HelloController(BookShopProperties bookShopProperties) {
        this.bookShopProperties = bookShopProperties;
    }

    @GetMapping("/")
    public String sayHello() {
        return bookShopProperties.getGreeting();
    }
}
