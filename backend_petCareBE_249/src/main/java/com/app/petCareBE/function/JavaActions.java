package com.app.petCareBE.function;

import com.app.petCareBE.model.Manager;
import com.app.petCareBE.model.Pet;
import com.app.petCareBE.model.PetCareCenter;
import com.app.petCareBE.model.PetOwner;
import com.app.petCareBE.model.Document;
import com.app.petCareBE.model.PetService;




import com.app.petCareBE.enums.PetServiceType;
import com.app.petCareBE.converter.PetServiceTypeConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmAction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataAction;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.transaction.Transactional;

@Component
public class JavaActions implements ODataAction {
    private final EntityManager entityManager;

    public JavaActions(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

	
	
}
  