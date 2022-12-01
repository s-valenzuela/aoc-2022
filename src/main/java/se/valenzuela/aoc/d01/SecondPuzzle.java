package se.valenzuela.aoc.d01;

import java.util.Comparator;
import java.util.List;

public class SecondPuzzle {

    private static final List<Integer> elves = D01Util.elves();

    public static void main(String[] args) {
        Integer sum = elves.stream().sorted(Comparator.reverseOrder()).limit(3).reduce(0, Integer::sum);
        System.out.println("Calories of three highest loaded elves is: " + sum);
    }

}
