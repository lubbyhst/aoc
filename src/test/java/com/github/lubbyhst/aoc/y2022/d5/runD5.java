package com.github.lubbyhst.aoc.y2022.d5;

import org.junit.Test;

import java.util.LinkedList;
import java.util.Map;

public class runD5 {

    @Test
    public void runD5Star1(){

        Map<Integer, LinkedList<String>> movedStacks = new Analyzer().moveCrates(Data.rawStacks, Data.rawMovements);
        System.out.print("Top level crates are: ");
        movedStacks.forEach((key, value) -> {
            if (value.size() > 0){
                System.out.print(value.getLast());
            }
        });
        System.out.println("");

    }
}
