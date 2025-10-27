package racingcar.controller;

import racingcar.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

record CarStatus(String name, int distance) {}

public class CarController {
    private final List<Car> carList = new ArrayList<>();
    private static final int MINIMUM_POSSIBLE = -1;

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

    public List<String> getWinners(){
        int maxDistance = carList.stream().mapToInt(Car::getDistance).max().orElse(MINIMUM_POSSIBLE);
        List<String> winners = carList.stream().filter(car -> car.getDistance() == maxDistance).map(Car::getCarName).collect(Collectors.toList());
        return winners;
    }
}
