package com.mizuirokoala.pet_clinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomepageController {

    @RequestMapping({"", "/","index", "index.html"})
    public String index() {
        return "index.html";
    }
}
