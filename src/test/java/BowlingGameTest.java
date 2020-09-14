import exception.InvalidInputException;
import org.junit.jupiter.api.Assertions;
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

    @Test
    void should_return_correct_score_when_in_the_mixture_above_three_situation_tests() {

        BowlingGame bowlingGame = new BowlingGame();

        List<Integer> scoreOfKnockingDownTheBall = Arrays.asList(4,6,10,4,6,4,3,4,6,4,4,2,4,6,4,6,4,6,4,6);

        int result = bowlingGame.calculateTotalScore(scoreOfKnockingDownTheBall);

        assertEquals(137, result);
    }

    @Test
    void should_throw_invalid_input_exception_when_score_more_than_10_in_once_hit() {

        BowlingGame bowlingGame = new BowlingGame();

        List<Integer> scoreOfKnockingDownTheBall = Arrays.asList(4,6,11,4,6,4,3,4,6,4,4,2,4,6,4,6,4,6,4,6);

        Assertions.assertThrows(InvalidInputException.class, () -> {
            bowlingGame.calculateTotalScore(scoreOfKnockingDownTheBall);
        });

    }

    @Test
    void should_throw_invalid_input_exception_when_score_more_than_10_in_twice_hit() {

        BowlingGame bowlingGame = new BowlingGame();

        List<Integer> scoreOfKnockingDownTheBall = Arrays.asList(4,4,10,4,6,4,3,4,6,4,7,2,4,6,4,6,4,6,4,6);

        Assertions.assertThrows(InvalidInputException.class, () -> {
            bowlingGame.calculateTotalScore(scoreOfKnockingDownTheBall);
        });

    }
}
