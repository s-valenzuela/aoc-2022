package se.valenzuela.aoc.d02;

import java.util.List;

public class SecondPuzzle {

    private static final List<EncryptedStrategy> scores = D02Util.scores();

    public static void main(String[] args) {
        Integer sum = scores.stream().map(EncryptedStrategy::decryptThenGetScore).reduce(0, Integer::sum);
        System.out.println("Sum of all played games (... after decryption): " + sum);
    }

}
