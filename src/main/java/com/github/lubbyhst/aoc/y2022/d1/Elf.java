package com.github.lubbyhst.aoc.y2022.d1;

import java.util.ArrayList;
import java.util.List;

public class Elf {

    private final List<Integer> itemWeights;
    private final Integer index;

    public Elf(final Integer index) {
        this.itemWeights = new ArrayList<>();
        this.index = index;
    }

    public Integer getIndex(){
        return this.index;
    }

    public void addItemWeight(Integer itemWeight){
        itemWeights.add(itemWeight);
    }

    public List<Integer> getItemWeights() {
        return itemWeights;
    }

    public Integer getSumOfItemWeights(){
        return itemWeights.stream().mapToInt(Integer::intValue).sum();
    }
}
