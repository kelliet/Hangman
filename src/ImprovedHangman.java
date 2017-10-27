import java.util.Scanner;

public class ImprovedHangman {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String puzzle;
        //get input from user
        boolean continueToPlay = true;
        while(continueToPlay) {
            puzzle = getUserInput(scanner);
            //  System.out.println("This is the puzzle " + puzzle);
            String[] hangman = new String[puzzle.length()];
            populateHangman(puzzle, hangman);
            printHangman(hangman);
            //ask for letter, solve, or quit
            userMenu(scanner, puzzle);
        }

    }

    public static void userMenu(Scanner scanner, String puzzle) {
        String input;
        System.out.println("Enter a letter or SOLVE to solve the puzzle or QUIT to quit");
        input = scanner.nextLine();
        if(input.equalsIgnoreCase("quit")) {

        } else if(input.equalsIgnoreCase("solve")) {

        } else {

            if(puzzle.contains(input)) {
                //checkIfLetterIsInPuzzle
                //ifExistsInPuzzleChangeHangman
            } else {
                //checkIfLetterIsInPuzzle
                //ifNotExistsInPuzzleAddToGallows
            }
            checkLettersGuessed();
        }

    }

    public static String getUserInput(Scanner scanner1) {

        boolean cont = true;
        String input = "";
        String[] input1;
        while(cont) {
            System.out.println("Please enter a word or phrase for hangman.");
            System.out.println("At least one word but no more than 8.");
            input = scanner1.nextLine();
            input1 = input.split(" ");
            if(!input.equals("") && input1.length <= 8  && input1.length > 0) {
                cont = false;
            }
        }
        return input;
    }

    public static void printHangman(String[] hangman) {
        for(int i=0 ; i< hangman.length;i++) {
            System.out.print(hangman[i]);
        }
        System.out.println("");
    }
    public static void populateHangman(String value, String[] hangman) {

        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for(int i =0; i<value.length();i++) {
            if(alphabet.contains(Character.toString(value.charAt(i))))
                hangman[i] =  "_ ";
            else
                hangman[i] = Character.toString(value.charAt(i));
        }
    }

    public static void checkLettersGuessed() {

        boolean found = false;
//        for(int i=0; i<lettersGuessed.length; i++) {
//                if(lettersGuessed[i] != null) {
//                    if(lettersGuessed[i].equals(input)) {
//                        found = true;
//                    }
//                }
//        }
    }

}
