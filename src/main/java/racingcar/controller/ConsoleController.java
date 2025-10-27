package racingcar.controller;

import camp.nextstep.edu.missionutils.Console;
import racingcar.view.ConsoleView;

public class ConsoleController {
    private final ConsoleView consoleView;
    public ConsoleController(){
        this.consoleView = new ConsoleView();
    }

    public void progressInputCarNamePhase(){
        try {
            consoleView.printPromptBeforeInputCarName();
            String inputNameList = Console.readLine();
        } catch (Exception e){
            throw new IllegalArgumentException();
        }
    }

    public void progressInputNumberPhase(){
        try {
            consoleView.printPromptBeforeInputNumber();
            int roundNumber = Integer.parseInt(Console.readLine());

        }catch (Exception e){
            throw new IllegalArgumentException();
        }
    }
}
