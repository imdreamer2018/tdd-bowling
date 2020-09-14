import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BowlingGameTest {

    @Test
    void should_return_current_score_when_not_hit_all_ball_use_twice() {

        BowlingGame bowlingGame = new BowlingGame();

        List<Integer> scoreOfKnockingDownTheBall = Arrays.asList(1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1);

        int result = bowlingGame.calculateTotalScore(scoreOfKnockingDownTheBall);

        assertEquals(20, result);
    }

    @Test
    void should_return_current_score_plus_last_two_scores_when_hit_all_ball_use_once() {

        BowlingGame bowlingGame = new BowlingGame();

        List<Integer> scoreOfKnockingDownTheBall = Arrays.asList(10,10,10,10,10,10,10,10,10,10,10,10);

        int result = bowlingGame.calculateTotalScore(scoreOfKnockingDownTheBall);

        assertEquals(300, result);
    }

    @Test
    void should_return_current_score_plus_last_once_score_when_hit_all_ball_use_twice() {

        BowlingGame bowlingGame = new BowlingGame();

        List<Integer> scoreOfKnockingDownTheBall = Arrays.asList(4,6,4,6,4,6,4,6,4,6,4,6,4,6,4,6,4,6,4,6,4,6);

        int result = bowlingGame.calculateTotalScore(scoreOfKnockingDownTheBall);

        assertEquals(140, result);
    }
}
