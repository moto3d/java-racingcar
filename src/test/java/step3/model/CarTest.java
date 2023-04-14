package step3.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

public class CarTest {



    @DisplayName("자동차 이름은 5자를 초과할수 없다")
    @Test
    public void carNameLimitUnder5() {
        //given
        String input = "tooLongCarNameOver5";
        //when
        //then
        assertThatThrownBy(() -> {
            new Car(input);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("자동차에 이름을 부여할 수 있다")
    @Test
    public void carNameTag() {
        //given
        String input = "KIM";
        //when
        Car car = new Car(input);
        //then
        assertThat(input).isEqualTo(car.getName());
    }

}