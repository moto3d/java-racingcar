package step3.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class MatchTest {
    @DisplayName("참가차랑수, 반복횟수에 맞게 결과를 생성한다")
    @Test
    public void matchTest() {
        //given
        List<Car> participates = Stream.of("a", "b", "c", "d", "e")
            .map(Car::new)
            .collect(Collectors.toList());
        int iterations = 7;
        //when
        List<List<String>> display = new Match(participates, iterations).display();
        //then
        assertThat(display).hasSize(participates.size());
        assertThat(display.get(0)).hasSize(iterations);
    }
}