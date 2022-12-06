package com.github.lubbyhst.aoc.y2022.d6;

import org.junit.Test;

public class runD6 {

    @Test
    public void runD6Star1(){
        System.out.println(new Analyzer().findFirstPacketMarkerPosition(Data.rawDataInput));
    }
}
