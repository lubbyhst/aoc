package com.github.lubbyhst.aoc.y2022.d4;

import org.junit.Test;

public class runD4 {

    @Test
    public void runD4Star1(){
        System.out.println("Total number of duplicated pairs: " + new Analyzer().getNumberOfDuplicatedNumberPairs(Data.rawData));
    }
}
