package bridge;

import bridge.position.Latitude;
import bridge.position.Position;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class JudgeTest {

    private final List<String> bridge = Arrays.asList("U", "D", "D");
    private final Judge judge = new Judge(bridge);

    @Test
    @DisplayName("목표지점을 조회하는 기능이 정상 동작하는지 확인한다.")
    void findGoalPosition() {
        Position position = judge.findGoalPosition();
        Position expect = new Position(2, Latitude.DOWN);
        Assertions.assertThat(position).isEqualTo(expect);
    }

    @Test
    @DisplayName("목표지점을 조회하는 기능이 정상 동작하는지 확인한다.")
    void findGoalPositionFail() {
        Position position = judge.findGoalPosition();
        Position expect = new Position(0, Latitude.UP);
        Assertions.assertThat(position).isNotEqualTo(expect);
    }
}
