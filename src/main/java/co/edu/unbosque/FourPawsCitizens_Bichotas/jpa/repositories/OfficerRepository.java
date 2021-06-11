package co.edu.unbosque.FourPawsCitizens_Bichotas.jpa.repositories;

import co.edu.unbosque.FourPawsCitizens_Bichotas.jpa.entities.Official;
import co.edu.unbosque.FourPawsCitizens_Bichotas.jpa.entities.Owner;

import java.util.List;
import java.util.Optional;

public interface OfficerRepository {

    Optional<Official> save(Official official);

    List<Owner> findAll();
}
