package com.github.lubbyhst.aoc.y2022.d2;

import org.junit.Test;

public class runD2 {

    @Test
    public void runStar1(){
        System.out.println("Total of player B is " + new GameAnalyzer().getTotalScorePlayerB(Data.raw_data));
    }
}
