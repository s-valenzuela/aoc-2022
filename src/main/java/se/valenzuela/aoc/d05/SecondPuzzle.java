package se.valenzuela.aoc.d05;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class SecondPuzzle {

    private static final List<Movement> movements = D05Util.movements();
    private static final List<Stack<String>> stacks = new ArrayList<>();

    public static void main(String[] args) {
        getStacks();
        movements.forEach(f -> {
            Stack<String> tempStack = new Stack<>();
            for (int i = 0; i < f.quantity(); i++) {
                String poppedValue = stacks.get(f.from() - 1).pop();
                tempStack.push(poppedValue);
            }
            while (!tempStack.isEmpty()) {
                stacks.get(f.to() - 1).push(tempStack.pop());
            }
        });

        String topCrates = stacks.stream().map(Stack::peek).collect(Collectors.joining());
        System.out.println("Top crates in each stack: " + topCrates);
    }

    private static void getTestStacks() {
        Stack<String> first = new Stack<>();
        first.add("Z");
        first.add("N");
        stacks.add(first);
        Stack<String> second = new Stack<>();
        second.add("M");
        second.add("C");
        second.add("D");
        stacks.add(second);
        Stack<String> third = new Stack<>();
        third.add("P");
        stacks.add(third);
    }


    private static void getStacks() {
        Stack<String> first = new Stack<>();
        first.push("R");
        first.push("N");
        first.push("F");
        first.push("V");
        first.push("L");
        first.push("J");
        first.push("S");
        first.push("M");
        stacks.add(first);
        Stack<String> second = new Stack<>();
        second.push("P");
        second.push("N");
        second.push("D");
        second.push("Z");
        second.push("F");
        second.push("J");
        second.push("W");
        second.push("H");
        stacks.add(second);
        Stack<String> third = new Stack<>();
        third.push("W");
        third.push("R");
        third.push("C");
        third.push("D");
        third.push("G");
        stacks.add(third);
        Stack<String> fourth = new Stack<>();
        fourth.push("N");
        fourth.push("B");
        fourth.push("S");
        stacks.add(fourth);
        Stack<String> fifth = new Stack<>();
        fifth.push("M");
        fifth.push("Z");
        fifth.push("W");
        fifth.push("P");
        fifth.push("C");
        fifth.push("B");
        fifth.push("F");
        fifth.push("N");
        stacks.add(fifth);
        Stack<String> sixth = new Stack<>();
        sixth.push("P");
        sixth.push("R");
        sixth.push("M");
        sixth.push("W");
        stacks.add(sixth);
        Stack<String> seventh = new Stack<>();
        seventh.push("R");
        seventh.push("T");
        seventh.push("N");
        seventh.push("G");
        seventh.push("L");
        seventh.push("S");
        seventh.push("W");
        stacks.add(seventh);
        Stack<String> eighth = new Stack<>();
        eighth.push("Q");
        eighth.push("T");
        eighth.push("H");
        eighth.push("F");
        eighth.push("N");
        eighth.push("B");
        eighth.push("V");
        stacks.add(eighth);
        Stack<String> ninth = new Stack<>();
        ninth.push("L");
        ninth.push("M");
        ninth.push("H");
        ninth.push("Z");
        ninth.push("N");
        ninth.push("F");
        stacks.add(ninth);
    }
}
