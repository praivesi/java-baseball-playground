package vo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BaseballVO {
    private int number;
    private int position;

    public boolean isMatch(BaseballVO other) {
        return this.number == other.number && this.position == other.position;
    }
}