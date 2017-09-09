public class GuessingGame {
    public static void main(String[] args) {

        Game game = new Game();
        game.start();
        Prompter prompter = new Prompter(game, game.getJar());
        prompter.start();
//        while (!game.isWon()) {
//            prompter.displayProgress();
//            prompter.promptForGuess();
//        }

    }
}
