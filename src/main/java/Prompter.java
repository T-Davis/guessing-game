import java.util.Scanner;

public class Prompter {

    private Game game;
    private Jar jar;
    private Scanner scanner;

    public Prompter(Game game, Jar jar) {
        this.game = game;
        this.jar = jar;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("PLAYER");
        System.out.println("========");
        System.out.printf("Your goal is to guess how many %s are in the jar. " +
                "Your guess should be between 1 and %d.", jar.getItemName(), jar.getMaxNumItems());
        System.out.printf("%nReady?  (press ENTER to start guessing)");
    }

    public boolean promptForGuess() {
        do {
            System.out.print("Guess: ");
            int guess = scanner.nextInt();
            game.setNumGuesses((game.getNumGuesses() + 1));

            if (guess == jar.getNumItems()) {
                System.out.printf("Congratulations - You guessed that there are %d %s in the jar! " +
                        "It took you %d guess(es) to get it right.");
            }
        } while ()
    }

}
