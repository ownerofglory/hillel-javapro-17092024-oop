package ua.ithillel.oop.person;

public class Address implements Cloneable {
    private String street;
    private String city;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Address clone()  {
        Address otherAddress = new Address();
        otherAddress.setCity(city);
        otherAddress.setStreet(street);

        return otherAddress;
    }

}
