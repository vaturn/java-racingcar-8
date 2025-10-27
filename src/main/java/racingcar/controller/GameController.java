package racingcar.controller;

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

        int stepOfNumber = consoleController.progressInputNumberPhase();

        carController.createCarList(carNameList);

        for(int curRound = 0; curRound < stepOfNumber ; curRound++){
            carController.playRound();
            consoleController.showStatus(carController.getStatus());
        }

        consoleController.showWinners(carController.getWinners());
    }
}
