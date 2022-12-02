package com.github.lubbyhst.aoc.y2022.d2;

public class Round{
    final Choice playerAChoice;
    final Choice playerBChoice;

    String winner;
    int scorePlayerA;
    int scorePlayerB;

    public Round(Choice playerAChoice, Choice playerBChoice) {
        this.playerBChoice = playerBChoice;
        this.playerAChoice = playerAChoice;

        if (playerAChoice.equals(playerBChoice)){
            winner = "";
            scorePlayerA = playerAChoice.score + 3;
            scorePlayerB = playerBChoice.score + 3;
        }
        if (playerAChoice.equals(Choice.SCISSORS) && playerBChoice.equals(Choice.PAPER)){
            winner = "A";
            scorePlayerA = playerAChoice.score + 6;
            scorePlayerB = playerBChoice.score;
        }
        if (playerAChoice.equals(Choice.SCISSORS) && playerBChoice.equals(Choice.ROCK)){
            winner = "B";
            scorePlayerA = playerAChoice.score;
            scorePlayerB = playerBChoice.score + 6;
        }
        if (playerAChoice.equals(Choice.PAPER) && playerBChoice.equals(Choice.SCISSORS)){
            winner = "B";
            scorePlayerA = playerAChoice.score;
            scorePlayerB = playerBChoice.score + 6;
        }
        if (playerAChoice.equals(Choice.PAPER) && playerBChoice.equals(Choice.ROCK)) {
            winner = "A";
            scorePlayerA = playerAChoice.score + 6;
            scorePlayerB = playerBChoice.score;
        }
        if (playerAChoice.equals(Choice.ROCK) && playerBChoice.equals(Choice.PAPER)){
            winner = "B";
            scorePlayerA = playerAChoice.score;
            scorePlayerB = playerBChoice.score + 6;
        }
        if (playerAChoice.equals(Choice.ROCK) && playerBChoice.equals(Choice.SCISSORS)){
            winner = "A";
            scorePlayerA = playerAChoice.score + 6;
            scorePlayerB = playerBChoice.score;
        }
    }

    public int getScorePlayerA(){
        return scorePlayerA;
    }

    public int getScorePlayerB() {
        return scorePlayerB;
    }

}
