package com.mizuirokoala.pet_clinic.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;
import java.io.Serializable;

@Getter
@Setter
public class BaseEntity implements Serializable {

    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;


}
