
public class TennisGame1 implements TennisGame {
    
    private int scorePlayer1 = 0;
    private int scorePlayer2 = 0;
    private final String player1Name;
    private final String player2Name;

    public TennisGame1(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) {
        if (playerName != null && playerName.equals(this.player1Name))
            scorePlayer1 += 1;
        else
            scorePlayer2 += 1;
    }

    public String getScore() {
        String score = "";
        int tempScore=0;
        if (scorePlayer1 == scorePlayer2)
        {
            score = getString();
            return score;

        }
        return (scorePlayer1 >= 4 || scorePlayer2 >= 4) ? value(score) : valueFor(score,tempScore);
            }

    private String getString(String score, int tempScore) {
        switch(tempScore)
        {
            case 0:
                score +="Love";
                break;
            case 1:
                score +="Fifteen";
                break;
            case 2:
                score +="Thirty";
                break;
            case 3:
                score +="Forty";
                break;
        }
        return score;
    }

    private String getString() {
        String score;
        switch (scorePlayer1)
        {
            case 0:
                    score = "Love-All";
                break;
            case 1:
                    score = "Fifteen-All";
                break;
            case 2:
                    score = "Thirty-All";
                break;
            default:
                    score = "Deuce";
                break;

        }
        return score;
    }

    public String value(String score){
        int minusResult = scorePlayer1 - scorePlayer2;
        if (minusResult==1) score ="Advantage player1";
        else if (minusResult ==-1) score ="Advantage player2";
        else if (minusResult>=2) score = "Win for player1";
        else score ="Win for player2";
        return score;
    }

    public String valueFor(String score,int tempScore){
        for (int i=1; i<3; i++)
        {
            if (i==1) tempScore = scorePlayer1;
            else { score+="-"; tempScore = scorePlayer2;}
            score = getString
                    (score, tempScore);
        }
    return score;
    }
}
