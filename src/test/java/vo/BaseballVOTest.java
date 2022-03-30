package vo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class BaseballVOTest {
    @Test
    @DisplayName("공 두 개가 주어지면 수와 위치가 일치하는지 확인한다.")
    void two_ball_is_equal(){
        int randNum = new Random().nextInt(100);
        int randPos = new Random().nextInt(100);

        Assertions.assertThat(new BaseballVO(randNum, randPos).isMatch(new BaseballVO(randNum, randPos))).isEqualTo(true);
        Assertions.assertThat(new BaseballVO(randNum, randPos).isMatch(new BaseballVO(randNum + 1, randPos))).isEqualTo(false);
        Assertions.assertThat(new BaseballVO(randNum, randPos).isMatch(new BaseballVO(randNum, randPos + 1))).isEqualTo(false);
        Assertions.assertThat(new BaseballVO(randNum, randPos).isMatch(new BaseballVO(randNum + 1, randPos + 1))).isEqualTo(false);
    }
}
