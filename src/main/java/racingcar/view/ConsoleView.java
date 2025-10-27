package racingcar.view;

public class ConsoleView {
    public void printPromptBeforeInputCarName(){
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
    }
    public void printPromptBeforeInputNumber(){
        System.out.println("시도할 횟수는 몇 회인가요?");
    }
    public void printJustResultString(){
        System.out.println("실행 결과");
    }
    public void printCarStatus(String carName, int distance){
        System.out.println(carName + " : " + "-".repeat(distance));
    }
}
