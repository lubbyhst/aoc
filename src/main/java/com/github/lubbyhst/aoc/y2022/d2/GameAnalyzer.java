package com.github.lubbyhst.aoc.y2022.d2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GameAnalyzer {

    public int getTotalScorePlayerB(final String rawData){
        final Scanner scanner = new Scanner(rawData);
        final List<Round> rounds = new ArrayList<>();
        while (scanner.hasNext()) {
            rounds.add(generateRound(scanner.nextLine()));
        }
        return rounds.stream().mapToInt(Round::getScorePlayerB).sum();
    }

    private Round generateRound(final String rawLine){
        final String[] rawChoices = rawLine.split(" ");
        return new Round(Choice.findByCode(rawChoices[0]), Choice.findByCode(rawChoices[1]));
    }
}
