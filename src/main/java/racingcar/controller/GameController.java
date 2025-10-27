package racingcar.controller;

import racingcar.model.Car;

import java.util.ArrayList;
import java.util.List;

public class GameController {
    private final ConsoleController consoleController;
    private final CarController carController;
    private final List<Car> carList = new ArrayList<>();

    public GameController(){
        consoleController = new ConsoleController();
        carController = new CarController();
    }

    public void runGame(){
        List<String> carNameList =  consoleController.progressInputCarNamePhase();

        carList.addAll(carController.createCarList(carNameList));

        int stepOfNumber = consoleController.progressInputNumberPhase();

        System.out.println(carNameList);
        System.out.println(stepOfNumber);
    }
}
