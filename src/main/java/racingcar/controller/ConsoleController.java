package racingcar.controller;

import camp.nextstep.edu.missionutils.Console;
import racingcar.view.ConsoleView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConsoleController {
    private final ConsoleView consoleView;
    private boolean isPrintStatus = false;
    public ConsoleController(){
        this.consoleView = new ConsoleView();
    }

    public List<String> progressInputCarNamePhase(){
        try {
            consoleView.printPromptBeforeInputCarName();
            String inputNameList = Console.readLine();
            return parseName(inputNameList);
        } catch (Exception e){
            throw new IllegalArgumentException();
        }
    }

    public int progressInputNumberPhase(){
        try {
            consoleView.printPromptBeforeInputNumber();
            return Integer.parseInt(Console.readLine());
        }catch (Exception e){
            throw new IllegalArgumentException();
        }
    }

    public void showWinners(List<String> winnerNameList){
        consoleView.printWinnerNames(formatWinnerNames(winnerNameList));
    }

    public void showStatus(List<CarStatus> carStatusList){
        if(!isPrintStatus) {
            consoleView.printBlankLine();
            consoleView.printJustResultString();
            isPrintStatus = true;
        }

        for(CarStatus carStatus: carStatusList){
            consoleView.printCarStatus(carStatus.name(), carStatus.distance());
        }

        consoleView.printBlankLine();
    }

    private List<String> parseName(String userInput){
        return new ArrayList<>(Arrays.asList(userInput.split(",")));
    }

    private String formatWinnerNames(List<String> winnerNames){
        return String.join(", ", winnerNames);
    }
}
