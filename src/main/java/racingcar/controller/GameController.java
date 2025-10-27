package racingcar.controller;

import racingcar.model.Car;

import java.util.ArrayList;
import java.util.List;

public class GameController {
    private final ConsoleController consoleController;
    private final List<Car> carList = new ArrayList<>();

    public GameController(){
        consoleController = new ConsoleController();
    }

    public void runGame(){
        List<String> carNameList =  consoleController.progressInputCarNamePhase();

        createCarList(carNameList);

        int stepOfNumber = consoleController.progressInputNumberPhase();

        System.out.println(carNameList);
        System.out.println(stepOfNumber);
    }

    private void createCarList(List<String> carNameList){
        for(String name : carNameList){
            carList.add(new Car(name));
        }
    }
}
