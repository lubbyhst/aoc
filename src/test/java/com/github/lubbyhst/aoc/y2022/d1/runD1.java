package com.github.lubbyhst.aoc.y2022.d1;

import org.junit.Test;

public class runD1 {

    @Test
    public void testD1(){
        final Elf elf = new Finder().findElfWithMostCalories(Data.raw_data);
        System.out.println("Elf ("+elf.getIndex()+") carries the most weight with ("+elf.getSumOfItemWeights()+")");
    }
}
