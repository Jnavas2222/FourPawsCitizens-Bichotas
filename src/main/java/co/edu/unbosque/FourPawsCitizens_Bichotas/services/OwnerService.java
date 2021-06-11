package co.edu.unbosque.FourPawsCitizens_Bichotas.services;

import co.edu.unbosque.FourPawsCitizens_Bichotas.jpa.entities.Owner;
import co.edu.unbosque.FourPawsCitizens_Bichotas.jpa.repositories.OwnerRepository;
import co.edu.unbosque.FourPawsCitizens_Bichotas.jpa.repositories.OwnerRepositoryImpl;
import co.edu.unbosque.FourPawsCitizens_Bichotas.resources.pojos.OwnerPOJO;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Optional;

@Stateless
public class OwnerService {

    OwnerRepository ownerRepository;

    public Optional<OwnerPOJO> createOwner(OwnerPOJO ownerPOJO) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tutorial");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        ownerRepository = new OwnerRepositoryImpl(entityManager);

        Owner owner = new Owner(ownerPOJO.getUsername(), ownerPOJO.getPassword(), ownerPOJO.getEmail(),
                 ownerPOJO.getPersonId(), ownerPOJO.getName(), ownerPOJO.getAddress(), ownerPOJO.getNeighborhood());
        Optional<Owner> persistedOwner = ownerRepository.save(owner);

        entityManager.close();
        entityManagerFactory.close();

        if (persistedOwner.isPresent()) {
            return Optional.of(new OwnerPOJO(persistedOwner.get().getUsername(),
                    persistedOwner.get().getPassword(),
                    persistedOwner.get().getEmail(),
                    persistedOwner.get().getPersonId(),
                    persistedOwner.get().getName(),
                    persistedOwner.get().getAddress(),
                    persistedOwner.get().getNeighborhood()));
        } else {
            return Optional.empty();
        }

    }

    public void modify (Integer ownerId, String addres, String neighborhood){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tutorial");
        EntityManager  entityManager = entityManagerFactory.createEntityManager();
        ownerRepository = new  OwnerRepositoryImpl(entityManager);
        entityManager.close();
        entityManagerFactory.close();
    }


}
