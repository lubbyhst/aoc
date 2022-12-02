package com.github.lubbyhst.aoc.y2022.d2;

public enum Choice {

    ROCK(1,"A", "X"),
    PAPER(2, "B", "Y"),
    SCISSORS(3, "C", "Z");

    final int score;
    final String codeA;
    final String codeB;

    Choice(int score, String codeA, String codeB) {
        this.score = score;
        this.codeA = codeA;
        this.codeB = codeB;
    }

    public int getScore() {
        return score;
    }

    public String getCodeA() {
        return codeA;
    }

    public String getCodeB() {
        return codeB;
    }

    public static Choice findByCode(final String code){
        if(code.equals(ROCK.getCodeA()) || code.equals(ROCK.getCodeB())){
            return Choice.ROCK;
        }
        if(code.equals(PAPER.getCodeA()) || code.equals(PAPER.getCodeB())){
            return Choice.PAPER;
        }
        if(code.equals(SCISSORS.getCodeA()) || code.equals(SCISSORS.getCodeB())){
            return Choice.SCISSORS;
        }
        return null;
    }
}
