package co.edu.unbosque.FourPawsCitizens_Bichotas.jpa.repositories;

import co.edu.unbosque.FourPawsCitizens_Bichotas.jpa.entities.PetCase;
import co.edu.unbosque.FourPawsCitizens_Bichotas.resources.pojos.Case;

import java.util.List;
import java.util.Optional;

public interface CaseRepository {

    Optional<PetCase> save(PetCase petCase);
    List<PetCase> findByPrefence(String preference);


}
