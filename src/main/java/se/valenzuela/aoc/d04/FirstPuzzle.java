package se.valenzuela.aoc.d04;

import java.util.List;

public class FirstPuzzle {

    private static final List<Assignment> assignments = D04Util.assignments();

    public static void main(String[] args) {
        List<Assignment> fullyContainedAssignments = assignments.stream().filter(Assignment::isFullyContained).toList();
        System.out.println("Assignments that are fully contained in one another: " + fullyContainedAssignments.size());
    }

}
