package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {
    private final String carName;
    private int distance;
    private static final int UNIT_DISTANCE = 1;
    private static final int MAX_RANDOM_BOUND = 9;
    private static final int MIN_RANDOM_BOUND = 0;
    private static final int ACTION_THRESHOLD = 4;

    public Car(String carName){
        this.carName = carName;
        distance = 0;
    }

    public void move(){
        int randomNumber = Randoms.pickNumberInRange(MIN_RANDOM_BOUND, MAX_RANDOM_BOUND);

        if(randomNumber >= ACTION_THRESHOLD){
            this.distance += UNIT_DISTANCE;
        }
    }

    public String getCarName() {
        return carName;
    }

    public int getDistance() {
        return distance;
    }
}
