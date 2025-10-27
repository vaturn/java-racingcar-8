package racingcar.controller;

import racingcar.model.Car;

import java.util.ArrayList;
import java.util.List;

record CarStatus(String name, int distance) {}

public class CarController {
    private final List<Car> carList = new ArrayList<>();

    public void createCarList(List<String> carNameList){
        for(String name : carNameList){
            carList.add(new Car(name));
        }
    }

    public void playRound(){
        for(Car car : carList){
            car.move();
        }
    }

    public List<CarStatus> getStatus(){
        List<CarStatus> statusList = new ArrayList<>();
        for(Car car : carList){
            statusList.add(new CarStatus(car.getCarName(), car.getDistance()));
        }
        return statusList;
    }
}
