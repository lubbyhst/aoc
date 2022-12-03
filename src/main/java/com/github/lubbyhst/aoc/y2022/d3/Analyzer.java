package com.github.lubbyhst.aoc.y2022.d3;

import com.github.lubbyhst.aoc.y2022.d2.Round;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Analyzer {

    private static final String charPositions = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public int findTotalSumOfDuplicates(final String rawData){
        final Scanner scanner = new Scanner(rawData);
        int totalSumOfPriorities = 0;
        while (scanner.hasNext()) {
            final String[] compartments = splitter(scanner.nextLine());
            final String duplicate = findDuplicate(compartments);
            totalSumOfPriorities = totalSumOfPriorities + getPriorityOfItem(duplicate);
        }
        return totalSumOfPriorities;
    }

    private int getPriorityOfItem(final String item){
        return charPositions.indexOf(item) + 1;
    }

    private String findDuplicate(final String[] compartments){
        final String[] compart1 = compartments[0].split("");
        final String[] compart2 = compartments[1].split("");
        return Arrays.stream(compart2).filter(item -> Arrays.asList(compart1).contains(item)).collect(Collectors.toList()).stream().findFirst().get();
    }
    private String[] splitter(final String rawLine){
        return new String[]{rawLine.substring(0, rawLine.length() / 2),rawLine.substring(rawLine.length() / 2)};
    }
}
