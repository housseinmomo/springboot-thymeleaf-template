package com.mugen.thymeleafspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homeController {

    @GetMapping("hello")
    public String home(Model model){
        model.addAttribute("message", "hello world");
        return "helloworld";
    }

    @GetMapping("style")
    public String style(){
        return "add-css-js-demo";
    }

    @GetMapping("bootstrap")
    public String bootstrap(){
        return "add-bootstrap-demo";
    }
}
