package racingcar.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static camp.nextstep.edu.missionutils.test.Assertions.assertRandomNumberInRangeTest;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CarTest {
    @Test
    @DisplayName("자동차 생성 정상 작동")
    void createCar(){
        Car car = new Car("joni");
        assertThat(car.getCarName()).isEqualTo("joni");
        assertThat(car.getDistance()).isZero();
    }

    @Test
    @DisplayName("이름 5글자 이상 예외 처리")
    void exeptionLongName(){
        assertThatThrownBy(() -> new Car("abcdef")).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("빈 이름 예외 처리")
    void exeptionEmptyName(){
        assertThatThrownBy(() -> new Car("   ")).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("자동차 한칸 움직이기")
    void moveCarIfOverFour(){
        assertRandomNumberInRangeTest(
                () -> {
                    Car car = new Car("abc");
                    car.move();
                    assertThat(car.getDistance()).isEqualTo(1);
                },
                4
        );
    }
}