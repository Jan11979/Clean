package de.neuefische.shoppingcart_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("shopping")
public class MainController {

    @GetMapping
    public String getHelloWorld() {
        return "Hello World";
    }

}
