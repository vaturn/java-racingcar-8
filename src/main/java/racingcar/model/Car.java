package racingcar.model;

public class Car {
    private final String carName;
    private final int distance;
    private static final int UNIT_DISTANCE = 1;

    public Car(String carName){
        this.carName = carName;
        distance = 0;
    }

    public String getCarName() {
        return carName;
    }

    public int getDistance() {
        return distance;
    }
}
