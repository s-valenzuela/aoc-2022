package se.valenzuela.aoc.d03;

import se.valenzuela.aoc.FileUtil;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class D03Util {

    public static List<Rucksack> rucksacks() {
        try {
            List<Rucksack> rucksacks = new ArrayList<>();
            File file = FileUtil.getFile("d03/input-1");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            for (String line; (line = reader.readLine()) != null; ) {
                rucksacks.add(new Rucksack(line.substring(0, line.length() / 2), line.substring(line.length() / 2)));
            }
            return rucksacks;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String findCommonItems(Rucksack rucksack) {
        List<Character> firstCompartment = rucksack.firstCompartment().chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        List<Character> secondCompartment = rucksack.secondCompartment().chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        firstCompartment.retainAll(secondCompartment);
        return firstCompartment.stream().distinct().map(String::valueOf).collect(Collectors.joining());
    }

    public static String findCommonItemsBetweenRucksacks(List<Rucksack> rucksacks) {
        ArrayList<Character> objects = new ArrayList<>();
        List<Character> commonItem = rucksacks.stream()
                .map(r -> String.join("", r.firstCompartment(), r.secondCompartment()))
                .map(s -> s.chars().mapToObj(c -> (char) c).collect(Collectors.toList()))
                .reduce(objects, (l1, l2) -> {
                    if (l1.isEmpty()) {
                        return l2;
                    }
                    l1.retainAll(l2);
                    return l1;
                });

        return commonItem.stream().distinct().map(String::valueOf).collect(Collectors.joining());
    }
}
