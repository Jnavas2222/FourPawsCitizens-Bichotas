package co.edu.unbosque.FourPawsCitizens_Bichotas.resources.pojos;

public class OwnerPOJO {

    private String username;

    private String password;

    private String email;

    private Long personId;

    private String name;

    private String address;

    private String neighborhood;

    public OwnerPOJO() {
    }

    public OwnerPOJO(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public OwnerPOJO(String username, String password, String email, Long personId, String name, String address, String neighborhood) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.personId = personId;
        this.name = name;
        this.address = address;
        this.neighborhood = neighborhood;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public Long getPersonId() {
        return personId;
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
}