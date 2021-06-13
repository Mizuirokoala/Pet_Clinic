package com.mizuirokoala.pet_clinic.controllers;

import com.mizuirokoala.pet_clinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"", "/", "/ownersHomepage", "/ownersHomepage.html"})
    public String listOfOwners(Model m) {

        m.addAttribute("owners",ownerService.findAll());
        return "owners/ownersHomepage";
    }


}
