import exception.InvalidInputException;

import java.util.List;

public class BowlingGame {
    public int calculateTotalScore(List<Integer> scoreOfKnockingDownTheBall) {

        int totalScore = 0;
        int currentRounds = 0;

        for (int i = 0; i < scoreOfKnockingDownTheBall.size(); i++) {

            if (currentRounds == 10) {
                break;
            }

            if (i + 1 > scoreOfKnockingDownTheBall.size() || i + 2 > scoreOfKnockingDownTheBall.size()) {
                throw new InvalidInputException("the times of rounds less than 10");
            }

            if (scoreOfKnockingDownTheBall.get(i) > 10) {
                throw new InvalidInputException("score more than 10 points in once hit");
            } else if (scoreOfKnockingDownTheBall.get(i) == 10) {
                totalScore += (10 +
                        scoreOfKnockingDownTheBall.get(i + 1) +
                        scoreOfKnockingDownTheBall.get(i + 2));
                currentRounds++;
            } else if (scoreOfKnockingDownTheBall.get(i) + scoreOfKnockingDownTheBall.get(i + 1) > 10) {
                throw new InvalidInputException("score more than 10 points in twice hit");
            } else if (scoreOfKnockingDownTheBall.get(i) + scoreOfKnockingDownTheBall.get(i + 1) == 10) {
                totalScore += (10 + scoreOfKnockingDownTheBall.get(i + 2));
                currentRounds++;
                i++;
            } else {
                totalScore += (scoreOfKnockingDownTheBall.get(i) + scoreOfKnockingDownTheBall.get(i + 1));
                i++;
                currentRounds++;
            }
        }
        return totalScore;
    }
}
