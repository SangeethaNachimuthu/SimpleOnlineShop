package lexicon;

/*
The Address class represents the address of a customer with
attributes number, streetName, city, postCode and Country.
 */
public class Address {

    private String number;
    private String streetName;
    private String city;
    private int postCode;
    private String country;

    public Address(String number, String streetName, String city, int postCode, String country) {
        this.setNumber(number);
        this.setStreetName(streetName);
        this.setCity(city);
        this.setPostCode(postCode);
        this.setCountry(country);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPostCode() {
        return postCode;
    }

    public void setPostCode(int postCode) {
        this.postCode = postCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Shipping Address: " + number + ", " + streetName +
                ", " + city + "-" + postCode + ", " + country ;
    }
}
