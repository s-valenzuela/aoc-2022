package se.valenzuela.aoc.d01;

import java.util.Comparator;
import java.util.List;

public class FirstPuzzle {

    private static final List<Integer> elves = D01Util.elves();

    public static void main(String[] args) {
        Integer max = elves.stream().max(Comparator.naturalOrder()).orElse(-1);
        System.out.println("Highest load is: " + max + " carried by " + elves.indexOf(max));
    }

}
