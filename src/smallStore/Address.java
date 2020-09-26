package smallStore;

public class Address {

    private String cityName;
    private String countryName;
    private String houseNumber;
    private String stateName;

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    @Override
    public String toString() {
        return "Address{" +
                "cityName='" + cityName + '\'' +
                ", countryName='" + countryName + '\'' +
                ", houseNumber='" + houseNumber + '\'' +
                ", stateName='" + stateName + '\'' +
                '}';
    }

}
