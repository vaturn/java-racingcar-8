package racingcar.controller;

import racingcar.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarController {
    public List<Car> createCarList(List<String> carNameList){
        List<Car> carList = new ArrayList<>();

        for(String name : carNameList){
            carList.add(new Car(name));
        }

        return carList;
    }
}
