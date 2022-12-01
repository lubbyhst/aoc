package com.github.lubbyhst.aoc.y2022.d1;

import java.util.Arrays;
import java.util.Scanner;

public class Finder {

    public Elf findElfWithMostCalories(final String rawData){
        final Scanner scanner = new Scanner(rawData);
        Integer index = 0;
        Elf current = new Elf(index);
        Elf maxWeight = new Elf(index);
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            if(line.isEmpty()){
                if (maxWeight.getSumOfItemWeights() < current.getSumOfItemWeights()){
                    maxWeight = current;
                }
                index++;
                current = new Elf(index);
                continue;
            }
            current.addItemWeight(Integer.parseInt(line));
        }
        return maxWeight;
    }
}
