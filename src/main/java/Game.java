import java.util.Scanner;

public class Game {

    private Jar jar;
    private int guess;
    private int numGuesses;

    public Game() {
        jar = new Jar();
    }

    public boolean isWon() {
        return guess == jar.getNumItems();
    }

    public Jar getJar() {
        return jar;
    }

    public void setJar(Jar jar) {
        this.jar = jar;
    }

    public int getGuess() {
        return guess;
    }

    public void setGuess(int guess) {
        this.guess = guess;
    }

    public int getNumGuesses() {
        return numGuesses;
    }

    public void setNumGuesses(int numGuesses) {
        this.numGuesses = numGuesses;
    }
}
