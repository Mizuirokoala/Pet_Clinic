package com.mizuirokoala.pet_clinic.services;

import com.mizuirokoala.pet_clinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
