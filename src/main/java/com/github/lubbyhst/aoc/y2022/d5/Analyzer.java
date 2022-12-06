package com.github.lubbyhst.aoc.y2022.d5;

import org.apache.tomcat.util.codec.binary.StringUtils;
import org.springframework.transaction.jta.ManagedTransactionAdapter;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Analyzer {

    final Pattern numbersOnlyPattern = Pattern.compile("([\\d]+[\\d]*).+(\\d).+(\\d)");


    public Map<Integer, LinkedList<String>> moveCrates(final String rawStacks, final String rawMovementData){
        final Map<Integer, LinkedList<String>> stacks = generateStacks(rawStacks);
        final Scanner scanner = new Scanner(rawMovementData);
        while (scanner.hasNext()) {
            final String rawMovement = scanner.nextLine();
            final Integer quantity = getPatternValueFromString(rawMovement, numbersOnlyPattern, 1);
            final Integer from = getPatternValueFromString(rawMovement, numbersOnlyPattern, 2);
            final Integer to = getPatternValueFromString(rawMovement, numbersOnlyPattern, 3);
            System.out.println(rawMovement);
            System.out.println("move "+quantity+" from "+from+" to "+ to);
            for (int i = 1; i<=quantity; i++){
                stacks.get(to).addLast(stacks.get(from).getLast());
                stacks.get(from).removeLast();
            }
        }
        return stacks;
    }

    private Integer getPatternValueFromString(final String value, final Pattern pattern, final int group){
        final Matcher matcher = pattern.matcher(value);
        if (!matcher.find()){
            throw new RuntimeException();
        }
        return Integer.parseInt(matcher.group(group));
    }



    private Map<Integer, LinkedList<String>> generateStacks(final String rawStacks){
        final String[] rawStackRows = rawStacks.split("\n");
        int numberOfStacks = (rawStackRows[0].length() / 4) + 1;
        final Map<Integer, LinkedList<String>> stacks = generateEmptyStackMap(numberOfStacks);
        for(int ri=rawStackRows.length-1; ri>=0; ri--){
            for(int i = 1; i<=numberOfStacks; i++){
                if (i == 1){
                    final String crate = rawStackRows[ri].substring(i, i+1);
                    if (!crate.trim().isEmpty()){
                        stacks.get(i).addLast(crate);
                    }
                }else {
                    final String crate = rawStackRows[ri].substring(i + (3 * (i-1)), i + (3 * (i-1))+1);
                    if(!crate.trim().isEmpty()){
                        stacks.get(i).addLast(crate);
                    }
                }
            }
        }
        return stacks;
    }

    private Map<Integer, LinkedList<String>> generateEmptyStackMap(final int numberOfStacks){
        final Map<Integer, LinkedList<String>> stacks = new HashMap<>();
        for (int i=0; i<numberOfStacks; i++){
            stacks.put(i+1, new LinkedList<>());
        }
        return stacks;
    }

}
