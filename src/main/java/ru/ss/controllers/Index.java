package ru.ss.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/")
public class Index {

    @GetMapping()
    public String IndexPage() {
        return "index/index";
    }
}
