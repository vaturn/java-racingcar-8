package racingcar.controller;

import camp.nextstep.edu.missionutils.Console;
import racingcar.view.ConsoleView;

public class GameController {
    private final ConsoleView consoleView;
    public GameController(){
        this.consoleView = new ConsoleView();
    }
    public void runGame(){
        consoleView.printPromptBeforeInputCarName();
        String inputNameList = Console.readLine();

        consoleView.printPromptBeforeInputNumber();
        int roundNumber = Integer.parseInt(Console.readLine());

        System.out.println(inputNameList + roundNumber);
    }
}
