package se.valenzuela.aoc.d03;

import org.apache.commons.collections4.ListUtils;

import java.util.List;

public class SecondPuzzle {

    private static final List<Rucksack> rucksacks = D03Util.rucksacks();
    private static final String PRIORITIES = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void main(String[] args) {
        var partitionedRucksacks = ListUtils.partition(rucksacks, 3);

        int sum = partitionedRucksacks.stream()
                .map(D03Util::findCommonItemsBetweenRucksacks)
                .map(badge -> PRIORITIES.indexOf(badge) + 1)
                .reduce(0, Integer::sum);
        System.out.println("Sum of priorities for badges: " + sum);
    }

}
