package com.github.lubbyhst.aoc.y2022.d6;

public class Analyzer {

    public String findFirstPacketMarkerPosition(final String rawData){
        String markerAndProcessedCharacters = "";
        int rangeToAnalyze = 4;
        for (int i = 0; i <= rawData.length(); i++){
            final String value = rawData.substring(i, rangeToAnalyze+i);
            if (!containsDuplicatedChars(value)){
                markerAndProcessedCharacters = value+ "," + (rangeToAnalyze+i);
                break;
            }
        }
        return markerAndProcessedCharacters;
    }

    private boolean containsDuplicatedChars(final String value){
        for (int i = 0; i < value.length(); i++) {
            for (int j = i + 1; j < value.length(); j++) {
                if (value.charAt(i) == value.charAt(j)) {
                    return true;
                }
            }
        }
        return false;
    }
}
