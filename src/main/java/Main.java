import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        introToTheGame();
    }

    private static void introToTheGame() {
        System.out.println("Welcome to Humans vs Goblins!\nWhat is your name?");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        Humans human = new Humans(100, 15);
        human.setName(name);
        System.out.print("\nWould you like to Play? Y or N:  ");
        String play;
        while (true) {
            try {
                play = in.nextLine().toLowerCase();
                if (play.equals("n")) {
                    System.out.println("\nYOU DO NOT WANT TO PLAY!");
                    System.out.println("Program exiting...");
                    System.exit(0);
                } else if (play.equals("y")) {
                    System.out.println("\nThank you for choosing to play the game!");
                    playTheGame(human);
                }
                else{
                    System.out.println("Invalid Input! Please only type y or n");
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid Input! Please only type y or n");
                in.nextLine(); //consume the input to prevent infinite loop
            }
        }
    }

    private static void playTheGame(Humans human) {
        System.out.println();
        String[][] defaultGrid = new String[10][10];
        for(int i = 0; i < defaultGrid.length; i++){
            for(int j = 0; j < defaultGrid[i].length; j++){
                defaultGrid[i][j] = "--";

            }
        }
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        int randomPosition = rand.nextInt(99);
        Land land = new Land(defaultGrid);
        land.setHumanPosition(randomPosition);
        land.currentPlayerPosition();
        land.getLandGrid();
        System.out.println("Humans Attributes: \nHealth: " + human.getHealth() + " Attack: " + human.getStrength());
        System.out.print("Which direction do you want to move "+ human.getName() + "? n,e,w,s : ");
        playerMovementInput(land, human, in);


    }

    private static void playerMovementInput(Land land, Humans human, Scanner in) {
        String userInput = in.nextLine().toLowerCase();
        try{
            if(userInput.equals("n")){
                land.playerMoveNorth();
                currentGameProgress(land, human);
            } else if (userInput.equals("e")) {
                land.playerMoveEast();
            }
            else if (userInput.equals("w")) {
                land.playerMoveWest();
            }
            else if (userInput.equals("s")) {
                land.playerMoveSouth();
            }
        }
        catch (InputMismatchException e) {
            System.out.println("Invalid Input! Please only type y or n");
            in.nextLine(); //consume the input to prevent infinite loop
        }
    }

    private static void currentGameProgress(Land land, Humans human) {
        Scanner in = new Scanner(System.in);
        System.out.println("Humans Attributes: \nHealth: " + human.getHealth() + " Attack: " + human.getStrength());
        System.out.print("Which direction do you want to move "+ human.getName() + "? n,e,w,s : ");
        playerMovementInput(land, human, in);
    }
}
