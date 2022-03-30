package vo;

import enums.BALL_STATE;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BaseballVOTest {
    @Test
    @DisplayName("공 두 개가 주어지면 수와 위치가 일치하는지 확인한다.")
    void get_two_ball_match_result(){
        int randNum = new Random().nextInt(100);
        int randPos = new Random().nextInt(100);

        Assertions.assertThat(new BaseballVO(randNum, randPos).getMatchResult(new BaseballVO(randNum, randPos))).isEqualTo(BALL_STATE.STRIKE);
        Assertions.assertThat(new BaseballVO(randNum, randPos).getMatchResult(new BaseballVO(randNum, randPos + 1))).isEqualTo(BALL_STATE.BALL);
        Assertions.assertThat(new BaseballVO(randNum, randPos).getMatchResult(new BaseballVO(randNum + 1, randPos))).isEqualTo(BALL_STATE.NOTHING);
        Assertions.assertThat(new BaseballVO(randNum, randPos).getMatchResult(new BaseballVO(randNum + 1, randPos + 1))).isEqualTo(BALL_STATE.NOTHING);
    }

    @Test
    @DisplayName("공 하나와 상대방의 공 목록(공 3개)이 있을 때 스트라이크/볼/낫싱을 판별한다.")
    void decide_ball_state(){
        int myBallNum = 1;
        int myBallPos = 2;

        BaseballVO myBall = new BaseballVO(myBallNum, myBallPos);
        BaseballCollection otherBallsWhenStrike = new BaseballCollection(){{
            add(new BaseballVO(myBallNum, myBallPos));
            add(new BaseballVO(myBallNum + 2, myBallPos + 2));
            add(new BaseballVO(myBallNum + 3, myBallPos + 3));
        }};

        BaseballCollection otherBallsWhenBall = new BaseballCollection(){{
            add(new BaseballVO(myBallNum, myBallPos + 1));
            add(new BaseballVO(myBallNum + 2, myBallPos + 2));
            add(new BaseballVO(myBallNum + 3, myBallPos + 3));
        }};

        BaseballCollection otherBallsWhenNothing = new BaseballCollection(){{
            add(new BaseballVO(myBallNum + 1, myBallPos + 1));
            add(new BaseballVO(myBallNum + 2, myBallPos + 2));
            add(new BaseballVO(myBallNum + 3, myBallPos + 3));
        }};

        Assertions.assertThat(otherBallsWhenStrike.match(myBall)).isEqualTo(BALL_STATE.STRIKE);
        Assertions.assertThat(otherBallsWhenBall.match(myBall)).isEqualTo(BALL_STATE.BALL);
        Assertions.assertThat(otherBallsWhenNothing.match(myBall)).isEqualTo(BALL_STATE.NOTHING);
    }
}
