import java.util.Scanner;

public class Game {

    private Jar jar;
    private int numGuesses;

    public Game() {
        jar = new Jar();
    }

    //this should be in prompter
    public void setup() {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("ADMINISTRATOR SETUP%n");
        System.out.println("=====================");

        System.out.print("Name of items in the jar: ");
        jar.setItemName(scanner.nextLine());

        System.out.printf("Maximum number of %s in the jar: ", jar.getItemName());
        jar.setMaxNumItems(scanner.nextInt());
        System.out.println();
        //need to sanitize input
    }

    public void start() {
        setup();
        jar.fill();
    }


    public Jar getJar() {
        return jar;
    }

    public void setJar(Jar jar) {
        this.jar = jar;
    }

    public int getNumGuesses() {
        return numGuesses;
    }

    public void setNumGuesses(int numGuesses) {
        this.numGuesses = numGuesses;
    }
}
