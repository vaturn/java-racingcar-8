package racingcar.controller;

import camp.nextstep.edu.missionutils.Console;

public class GameController {
    private final ConsoleController consoleController;

    public GameController(){
        consoleController = new ConsoleController();
    }

    public void runGame(){
        consoleController.progressInputCarNamePhase();

        consoleController.progressInputNumberPhase();

        //System.out.println(inputNameList + roundNumber);
    }
}
