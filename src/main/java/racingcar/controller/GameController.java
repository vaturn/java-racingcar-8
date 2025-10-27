package racingcar.controller;

import racingcar.model.Car;

import java.util.ArrayList;
import java.util.List;

public class GameController {
    private final ConsoleController consoleController;
    private final CarController carController;

    public GameController(){
        consoleController = new ConsoleController();
        carController = new CarController();
    }

    public void runGame(){
        List<String> carNameList =  consoleController.progressInputCarNamePhase();

        carController.createCarList(carNameList);

        int stepOfNumber = consoleController.progressInputNumberPhase();

        for(int curRound = 0; curRound <= stepOfNumber ; curRound++){
            carController.playRound();
            consoleController.showStatus(carController.getStatus());
        }

        System.out.println(carNameList);
        System.out.println(stepOfNumber);
    }
}
