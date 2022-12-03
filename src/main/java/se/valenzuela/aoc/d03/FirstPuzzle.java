package se.valenzuela.aoc.d03;

import java.util.List;

public class FirstPuzzle {

    private static final List<Rucksack> rucksacks = D03Util.rucksacks();
    private static final String PRIORITIES = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void main(String[] args) {
        List<String> commonItems = rucksacks.stream().map(D03Util::findCommonItems).toList();
        Integer sum = commonItems.stream().map(item -> PRIORITIES.indexOf(item) + 1).reduce(0, Integer::sum);
        System.out.println("Sum of common items: " + sum);
    }

}
