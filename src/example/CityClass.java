package example;

import java.util.*;

class CityClass {

    private String cityName;

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
    @Override
    public String toString() {
        return cityName;
    }
}

class State {

    private String stateName;

    List<CityClass> citys;

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }
    public List<CityClass> getCities() {
        return citys;
    }
    public void setState(List<CityClass> citys) {
        this.citys = citys;
    }

}
