package com.app.petCareBE.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.app.petCareBE.model.Manager;
import com.app.petCareBE.model.Pet;
import com.app.petCareBE.model.PetCareCenter;
import com.app.petCareBE.model.PetOwner;
import com.app.petCareBE.model.Document;
import com.app.petCareBE.model.PetService;
import com.app.petCareBE.enums.PetServiceType;
import com.app.petCareBE.converter.PetServiceTypeConverter;

@Entity(name = "PetOwnerPets")
@Table(schema = "\"petcarebe\"", name = "\"PetOwnerPets\"")
@Data
public class PetOwnerPets{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"OwnerId\"")
	private Integer ownerId;

    
    @Column(name = "\"PetId\"")
    private Integer petId;
 
}