package vo;

import enums.BALL_STATE;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BaseballVO {
    private int number;
    private int position;

    public BALL_STATE getMatchResult(BaseballVO other) {
        if(this.number == other.number && this.position == other.position) return BALL_STATE.STRIKE;
        if(this.number == other.number && this.position != other.position) return BALL_STATE.BALL;
        return BALL_STATE.NOTHING;
    }
}