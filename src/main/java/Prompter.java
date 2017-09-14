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

    public void setupGame() {
        System.out.printf("ADMINISTRATOR SETUP%n");
        System.out.println("=====================");

        System.out.print("Name of items in the jar: ");
        jar.setItemName(scanner.nextLine());

        System.out.printf("Maximum number of %s in the jar: ", jar.getItemName());
        jar.setMaxNumItems(scanner.nextInt());
        System.out.println();
        jar.fill();
        //need to sanitize input
    }

    public void startGame() {
        System.out.println("PLAYER");
        System.out.println("========");
        System.out.printf("Your goal is to guess how many %s are in the jar. " +
                "Your guess should be between 1 and %d.", jar.getItemName(), jar.getMaxNumItems());
        System.out.printf("%nReady?  (press ENTER to start guessing)");
        scanner.nextLine();
    }

    //sanitize guesses
    public void promptForGuess() {
        System.out.print("Guess: ");
        game.setGuess(scanner.nextInt());
        game.setNumGuesses((game.getNumGuesses() + 1));
    }

    public void outcome() {
        if (game.isWon()) {
            System.out.printf("Congratulations - You guessed that there are %d %s in the jar! " +
                            "It took you %d guess(es) to get it right.%n",
                    jar.getNumItems(), jar.getItemName(), game.getNumGuesses());
        } else if (game.getGuess() < jar.getNumItems()) {
            System.out.printf("Your guess is low%n");
        } else if (game.getGuess() > jar.getNumItems()) {
            System.out.printf("Your guess is high%n");
        }
    }

}
