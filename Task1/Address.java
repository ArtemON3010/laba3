package Task1;

public class Address {
    private String nameOfCity;
    private String nameOfRegion;
    private String nameOfStreet;

    private int homeNumber;
    private int flatNumber;

    //Constructor
    public Address( final String nameOfCity, final String nameOfRegion, final String nameOfStreet,
                    final int homeNumber, final int flatNumber) {
        this.nameOfCity = nameOfCity;
        this.nameOfRegion = nameOfRegion;
        this.nameOfStreet = nameOfStreet;
        this.homeNumber = homeNumber;
        this.flatNumber = flatNumber;

    }

    //Getters
    public String getNameOfStreet() {
        return nameOfStreet;
    }

    public int getHomeNumber() {
        return homeNumber;
    }

    public String getNameOfCity() {
        return nameOfCity;
    }

    public String getNameOfRegion() {
        return nameOfRegion;
    }

    public int getFlatNumber() {
        return flatNumber;
    }

    //Setters
    public void setNameOfStreet(final String nameOfStreet) {
        this.nameOfStreet = nameOfStreet;
    }

    public void setHomeNumber(final int homeNumber) {
        this.homeNumber = homeNumber;
    }

    public void setNameOfCity(final String nameOfCity) {
        this.nameOfCity = nameOfCity;
    }

    public void setNameOfRegion(final String nameOfRegion) {
        this.nameOfRegion = nameOfRegion;
    }

    public void setFlatNumber(final int flatNumber) {
        this.flatNumber = flatNumber;
    }

    @Override
    public String toString() {
        return "Ось ваша адреса: " + '\'' +
                "Місто: " + getNameOfCity() + '\'' +
                "Область: " + getNameOfRegion() + '\'' +
                "Вулиця: " + getNameOfStreet() + '\'' +
                "Номер будинку: " + getHomeNumber() + '\'' +
                "Номер квартири: " + getFlatNumber();

    }

}
