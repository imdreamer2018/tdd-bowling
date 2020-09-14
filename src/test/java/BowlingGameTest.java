import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BowlingGameTest {

    @Test
    void should_return_current_score_for_knocking_down_the_ball_when_failed_twice() {

        BowlingGame bowlingGame = new BowlingGame();

        List<Integer> scoreOfKnockingDownTheBall = Arrays.asList(1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1);

        int result = bowlingGame.calculateTotalScore(scoreOfKnockingDownTheBall);

        assertEquals(20, result);
    }
}
