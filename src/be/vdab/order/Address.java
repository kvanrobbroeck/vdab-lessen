package be.vdab.order;

public class Address {
    private String recipient;
    private String street;
    private String numbersdfsdf;
    private String city;
    private String postalCode;

    public Address(String recipient, String street, String numbersdfsdf, String city, String postalCode) {
        this.recipient = recipient;
        this.street = street;
        this.numbersdfsdf = numbersdfsdf;
        this.city = city;
        this.postalCode = postalCode;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getStreet() {
        return street;
    }

    public String getNumbersdfsdf() {
        return numbersdfsdf;
    }

    public String getCity() {
        return city;
    }

    public String getPostalCode() {
        return postalCode;
    }
}
