import java.util.List;

public class BowlingGame {
    public int calculateTotalScore(List<Integer> scoreOfKnockingDownTheBall) {

        int totalScore = 0;
        int currentFrame = 0;
        for (int i = 0; i < scoreOfKnockingDownTheBall.size(); i++) {
            if (currentFrame == 10) {
                break;
            }
            if (scoreOfKnockingDownTheBall.get(i) == 10) {
                totalScore += (scoreOfKnockingDownTheBall.get(i) +
                        scoreOfKnockingDownTheBall.get(i + 1) +
                        scoreOfKnockingDownTheBall.get(i + 2));
                currentFrame++;
            }
            totalScore += (scoreOfKnockingDownTheBall.get(i) + scoreOfKnockingDownTheBall.get(i + 1));
            i++;
            currentFrame++;
        }

        return totalScore;
    }
}
