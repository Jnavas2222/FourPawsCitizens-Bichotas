package co.edu.unbosque.FourPawsCitizens_Bichotas.jpa.repositories;
import co.edu.unbosque.FourPawsCitizens_Bichotas.jpa.entities.Pet;
import co.edu.unbosque.FourPawsCitizens_Bichotas.jpa.entities.Vet;

import java.util.List;
import java.util.Optional;
public interface PetRepository {

    Optional <Pet> save(Pet pet);
    //   void modify(Vet vet);
    List<Pet> findById(String id);
}
