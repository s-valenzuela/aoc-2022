package se.valenzuela.aoc.d02;

public enum GameMove {

    ROCK(1),
    PAPER(2),
    SCISSOR(3);

    private final int score;

    GameMove(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }
}
