package entities;

public class Adress {
    
    private String district;
    private String streetName;
    private Integer number;
    private Integer zipcode;

    public Adress() {
    }

    public Adress(String district, String streetName, Integer number, Integer zipcode) {
        this.district = district;
        this.streetName = streetName;
        this.number = number;
        this.zipcode = zipcode;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getZipcode() {
        return zipcode;
    }

    public void setZipcode(Integer zipcode) {
        this.zipcode = zipcode;
    }
    
}
