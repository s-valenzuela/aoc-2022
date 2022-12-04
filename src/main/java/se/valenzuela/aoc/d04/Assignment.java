package se.valenzuela.aoc.d04;

import org.apache.commons.collections4.CollectionUtils;

import java.util.List;
import java.util.stream.IntStream;

public class Assignment {

    private final List<Integer> first;
    private final List<Integer> second;

    public Assignment(String line) {
        String[] assignedSections = line.split(",");
        first = listIntegers(assignedSections[0]);
        second = listIntegers(assignedSections[1]);
    }

    public boolean isFullyContained() {
        return CollectionUtils.containsAll(first, second) || CollectionUtils.containsAll(second, first);
    }

    public boolean doesOverlap() {
        return CollectionUtils.containsAny(first, second) || CollectionUtils.containsAny(second, first);
    }

    private List<Integer> listIntegers(String assignedSections) {
        String[] sections = assignedSections.split("-");
        return IntStream.rangeClosed(Integer.parseInt(sections[0]), Integer.parseInt(sections[1])).boxed().toList();
    }

    @Override
    public String toString() {
        return "Assignment{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
