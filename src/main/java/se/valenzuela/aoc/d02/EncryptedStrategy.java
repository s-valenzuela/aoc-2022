package se.valenzuela.aoc.d02;

import static se.valenzuela.aoc.d02.GameMove.*;

//A - X - ROCK
//B - Y - PAPER
//C - Z - SCISSOR
public class EncryptedStrategy {
    private final GameMove elf;
    private final GameMove me;

    private static final int WIN = 6;
    private static final int DRAW = 3;

    public EncryptedStrategy(String elf, String me) {
        this.elf = parse(elf);
        this.me = parse(me);
    }

    public int getScore() {
        return determineOutcome(elf, me);
    }

    public int decryptThenGetScore() {
        return determineOutcome(elf, neededMove());
    }

    public GameMove neededMove() {
        if (me == ROCK) {
            return elf == ROCK ? SCISSOR : elf == PAPER ? ROCK : PAPER;
        } else if (me == PAPER) {
            return elf == ROCK ? ROCK : elf == PAPER ? PAPER : SCISSOR;
        } else {
            return elf == ROCK ? PAPER : elf == PAPER ? SCISSOR : ROCK;
        }
    }

    public int determineOutcome(GameMove elfMove, GameMove me) {
        if (elfMove == me) {
            return me.getScore() + DRAW;
        } else if ((elfMove == ROCK && me == PAPER) || (elfMove == PAPER && me == SCISSOR) || (elfMove == SCISSOR && me == ROCK)) {
            return me.getScore() + WIN;
        } else {
            return me.getScore();
        }
    }

    public static GameMove parse(String character) {
        return switch (character) {
            case "A", "X" -> ROCK;
            case "B", "Y" -> PAPER;
            default -> SCISSOR;
        };
    }
}
