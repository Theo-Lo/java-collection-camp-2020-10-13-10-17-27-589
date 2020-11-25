package com.thoughtworks.collection;

import org.apache.commons.lang3.NotImplementedException;

import java.util.List;
import java.util.stream.Collectors;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public double getAverage() {
        return arrayList.stream()
                        .mapToDouble(i -> i)
                        .reduce(Double::sum)
                        .getAsDouble()/arrayList.size();
    }

    public int getMaxValue() {
        return arrayList.stream()
                .reduce(0, Integer::max);
    }

    public int getLastOdd() {
        return arrayList.stream()
                .filter(item -> item%2 != 0)
                .reduce((first,second)->second)
                .orElse(null);
    }
}
