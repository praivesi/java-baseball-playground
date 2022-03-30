package vo;

import enums.BALL_STATE;

import java.util.ArrayList;
import java.util.List;

public class BaseballCollection extends ArrayList<BaseballVO> {
    public BALL_STATE match(BaseballVO otherBall){
        List<BALL_STATE> states = new ArrayList<>();

        for(BaseballVO myBall : this){
            states.add(myBall.getMatchResult(otherBall));
        }

        if(states.contains(BALL_STATE.STRIKE)) return BALL_STATE.STRIKE;
        if(states.contains(BALL_STATE.BALL)) return BALL_STATE.BALL;
        return BALL_STATE.NOTHING;
    }
}