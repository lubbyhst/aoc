package com.github.lubbyhst.aoc.y2022.d3;

import org.junit.Test;

public class runD3 {

    @Test
    public void runD3Star1(){
        System.out.println("Total of priorities: " + new Analyzer().findTotalSumOfDuplicates(Data.rawData));
    }
}
