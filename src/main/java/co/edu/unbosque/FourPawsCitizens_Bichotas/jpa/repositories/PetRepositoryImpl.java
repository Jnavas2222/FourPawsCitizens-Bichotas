package co.edu.unbosque.FourPawsCitizens_Bichotas.jpa.repositories;

import co.edu.unbosque.FourPawsCitizens_Bichotas.jpa.entities.Owner;
import co.edu.unbosque.FourPawsCitizens_Bichotas.jpa.entities.Pet;
import co.edu.unbosque.FourPawsCitizens_Bichotas.jpa.entities.Vet;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

public class PetRepositoryImpl implements PetRepository{

    private EntityManager entityManager;

    public PetRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public Optional<Pet> save(Pet pet) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(pet);
            entityManager.getTransaction().commit();
            return Optional.of(pet);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }


    @Override
    public List<Pet> findById(String id) {
        List<Pet> pets = entityManager.createQuery("SELECT b FROM Owner b WHERE b.id = :id", Pet.class)
                .setParameter("id", Integer.parseInt(id)).getResultList();
        return pets != null ? pets: null;
    }




}
