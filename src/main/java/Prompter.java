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
        scanner.nextLine();
        promptForGuess();
    }

    public void promptForGuess() {
        System.out.print("Guess: ");
        int guess = scanner.nextInt();
        game.setNumGuesses((game.getNumGuesses() + 1));

        //this needs moved to diff method
        if (guess == jar.getNumItems()) {
            System.out.printf("Congratulations - You guessed that there are %d %s in the jar! " +
                    "It took you %d guess(es) to get it right.",
                    jar.getNumItems(), jar.getItemName(), game.getNumGuesses());
        } else if (guess < jar.getNumItems()) {
            System.out.println("Your guess is low");
            promptForGuess();
        } else if (guess > jar.getNumItems()) {
            System.out.println("Your guess is high");
            promptForGuess();
        }
    }

}
