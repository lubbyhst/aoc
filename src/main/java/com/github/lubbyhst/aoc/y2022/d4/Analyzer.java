package com.github.lubbyhst.aoc.y2022.d4;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Analyzer {

    public int getNumberOfDuplicatedNumberPairs(final String rawData){
        final Scanner scanner = new Scanner(rawData);
        int totalNumberOfDuplicatedNumberPairs = 0;
        while (scanner.hasNext()) {
            final String[] rawNumberPairs = scanner.nextLine().split(",");
            if(containAllNumbersOfTheOther(rawNumberPairs[0], rawNumberPairs[1])){
                totalNumberOfDuplicatedNumberPairs++;
            }
        }
        return totalNumberOfDuplicatedNumberPairs;
    }

    private boolean containAllNumbersOfTheOther(final String rawNumberRangeOne, final String rawNumberRangerTwo){
        final Set<Integer> numberRangeSetOne = generateNumberSetFromNumberRange(rawNumberRangeOne);
        final Set<Integer> numberRangeSetTwo = generateNumberSetFromNumberRange(rawNumberRangerTwo);

        return numberRangeSetOne.containsAll(numberRangeSetTwo) || numberRangeSetTwo.containsAll(numberRangeSetOne);
    }

    private Set<Integer> generateNumberSetFromNumberRange(final String rawNumberRange){
        final Set<Integer> numberSet = new HashSet<>();
        final String[] range = rawNumberRange.split("-");
        int end = Integer.parseInt(range[1]);
        for (int i = Integer.parseInt(range[0]); i<=end; i++){
            numberSet.add(i);
        }
        return numberSet;
    }

}
