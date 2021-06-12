package com.mizuirokoala.pet_clinic.bootstrap;

import com.mizuirokoala.pet_clinic.model.Owner;
import com.mizuirokoala.pet_clinic.model.Vet;
import com.mizuirokoala.pet_clinic.services.OwnerService;
import com.mizuirokoala.pet_clinic.services.VetService;
import com.mizuirokoala.pet_clinic.services.map.OwnerServiceMap;
import com.mizuirokoala.pet_clinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {


    private final OwnerService ownerService;
    private final VetService vetService;


    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {

        Owner test1 = new Owner();
        test1.setId(1L);
        test1.setFirstName("Lorem");
        test1.setLastName("Ipsum");

        ownerService.save(test1);

        Owner test2 = new Owner();
        test2.setId(2L);
        test2.setFirstName("Andżej");
        test2.setLastName("Test");

        ownerService.save(test2);
        System.out.println("Load Owneeeers............");

        Vet testVet1 = new Vet();
        testVet1.setId(1L);
        testVet1.setFirstName("VetMaster");
        testVet1.setLastName("Test");

        vetService.save(testVet1);

        Vet testVet2 = new Vet();
        testVet2.setId(2L);
        testVet2.setFirstName("What");
        testVet2.setLastName("ToDo");

        vetService.save(testVet2);
        System.out.println("Load Vetttttttts...............");
    }
}
