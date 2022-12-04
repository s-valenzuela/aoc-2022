package se.valenzuela.aoc.d04;

import java.util.List;

public class SecondPuzzle {

    private static final List<Assignment> assignments = D04Util.assignments();

    public static void main(String[] args) {
        List<Assignment> overlappingAssignments = assignments.stream().filter(Assignment::doesOverlap).toList();
        System.out.println("Overlapping assignments: " + overlappingAssignments.size());
    }

}
