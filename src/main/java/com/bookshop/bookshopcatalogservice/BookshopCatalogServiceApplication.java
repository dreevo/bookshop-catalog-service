package com.bookshop.bookshopcatalogservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class BookshopCatalogServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookshopCatalogServiceApplication.class, args);
    }

}
