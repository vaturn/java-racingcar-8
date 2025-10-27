package racingcar.controller;

import camp.nextstep.edu.missionutils.Console;

import java.util.List;

public class GameController {
    private final ConsoleController consoleController;

    public GameController(){
        consoleController = new ConsoleController();
    }

    public void runGame(){
        List<String> carNameList =  consoleController.progressInputCarNamePhase();

        int stepOfNumber = consoleController.progressInputNumberPhase();

        System.out.println(carNameList);
        System.out.println(stepOfNumber);
    }
}
