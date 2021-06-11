package co.edu.unbosque.FourPawsCitizens_Bichotas.resources.pojos;
import co.edu.unbosque.FourPawsCitizens_Bichotas.jpa.entities.Pet;

import java.util.ArrayList;
import java.util.List;

public class Owner {

    private String username;

    private int person_id;

    private String name;

    private String address;

    private String neighborhood;

    private List<Pet> pets = new ArrayList<Pet>();

    public Owner(String user, int person, String name, String address, String neighborhood){
        this.username = user;
        this.person_id = person;
        this.name = name;
        this.address = address;
        this.name = neighborhood;
    }

    public Owner(String username, int person_id, String name, String address, String neighborhood, List<Pet> pets) {
        this.username = username;
        this.person_id = person_id;
        this.name = name;
        this.address = address;
        this.neighborhood = neighborhood;
        this.pets = pets;
    }

    public String getUsername() {
        return username;
    }

    public int getPerson_id() {
        return person_id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }
}
