package com.ecommerce.Home;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HomeController {

    @GetMapping("/home")
    public String home(){
        return "Welcome to ManvaKart";
    }

    @GetMapping("/category")
    public List<String> categories(){
        List<String> categoryList=new ArrayList<>();
        categoryList.add("Electronics");
        categoryList.add("Fashion");
        categoryList.add("Home Appliances");
        categoryList.add("Groceries");
        return categoryList;
    }
}
