package com.app.petCareBE.function;

import com.app.petCareBE.model.Manager;
import com.app.petCareBE.model.Pet;
import com.app.petCareBE.model.PetCareCenter;
import com.app.petCareBE.model.PetOwner;
import com.app.petCareBE.model.Document;
import com.app.petCareBE.model.PetService;
import com.app.petCareBE.enums.PetServiceType;
import com.app.petCareBE.converter.PetServiceTypeConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.app.petCareBE.repository.PetServiceRepository;
import com.app.petCareBE.repository.PetOwnerRepository;
import com.app.petCareBE.repository.PetCareCenterRepository;
import com.app.petCareBE.repository.ManagerRepository;
import com.app.petCareBE.repository.DocumentRepository;
import com.app.petCareBE.repository.PetRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
