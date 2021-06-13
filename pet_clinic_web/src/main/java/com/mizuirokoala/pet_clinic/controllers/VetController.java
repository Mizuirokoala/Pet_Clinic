package com.mizuirokoala.pet_clinic.controllers;

import com.mizuirokoala.pet_clinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"/vets", "/vets/vetsHomepage", "/vets/vetsHomepage.html"})
    public String listOfVets(Model m) {

        m.addAttribute("vets", vetService.findAll());
        return "vets/vetsHomepage";
    }

}
