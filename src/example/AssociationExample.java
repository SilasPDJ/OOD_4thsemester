package example;

import example.CityClass;
import example.State;

import java.util.ArrayList;
import java.util.List;

public class AssociationExample {

    public static void main(String[] args) {
        State state = new State();
        state.setStateName("California");


        CityClass city = new CityClass();

        city.setCityName("Los Angeles");
        CityClass city2 = new CityClass();
        city2.setCityName("San Diago");

        List<CityClass> empList = new ArrayList<CityClass>();
        empList.add(city);
        empList.add(city2);


        state.setState(empList);


        System.out.println(state.getCities()+" are cities in the state "+
                state.getStateName());
    }


}