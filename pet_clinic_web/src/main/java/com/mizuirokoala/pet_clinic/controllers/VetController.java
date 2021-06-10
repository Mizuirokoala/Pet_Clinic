package com.mizuirokoala.pet_clinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    @RequestMapping({"/vets", "/vets/vetsHomepage", "/vets/vetsHomepage.html"})
    public String listOfVets() {

        return "vets/vetsHomepage";
    }

}
