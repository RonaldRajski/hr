package PearsonChapter11.Assignment1;

//************************************
//    Name: Ronald Rajski
//    Class: Computer Science 1174-48L
//    Assignment: Minecraft Blocks
//    Date: 9/5/2021
//
//************************************

//        Finally, write a test class containing the main method, which creates a sand block, and asks the user if they have a shovel. If they do not, they cannot break the block, and they must move on, but if they do, they can start digging. Each digging action should reduce the sand’s hardness until it is below 1, in which case the user is given their sand, and they move on.

//need to import Scanner to talk to player
import java.util.Scanner;

public class Test {
    public static Scanner input = new Scanner(System.in);

    //    Ask the user if they would like to mind sand
    public static String digQuestion = "\nWould you like mine some sand like MineCraft? (Y/N)";

    //    Do you have a shovel
    public static String shovelQuestion = "\nDo you have a shovel? (Y/N)";

    //    exit phrase on negative answers
    public static String negGoodBye = "\nThat's all right, Move on to the the cabana for some boat drinks.";

    //  exit phrase on positive answers
    public static String posGoodbye = "\nBefore you Move on, Thanks for visiting! Remember to tell your friends about your Summer vacation adventure.";

    public static void main(String[] args) {

//        new sand object
        Sand sandBlock = new Sand();

        System.out.println(sandBlock.toString());
        System.out.println("\nPhineas and Ferb Welcome you the to the Backyard Beach MineCraft Block test");
        System.out.println("\nYou are standing in front of a block of sand.");
        System.out.println("\nThere is a plethora of sand, more than enough to build a sand castle.");
        System.out.println(digQuestion);

//        Do you want to continue?
        boolean shouldDig = decide(input.next(), digQuestion);

        if (shouldDig == false) {
            System.out.println(negGoodBye);
        } else {
            System.out.println(shovelQuestion);

//            Can you proceed?
            boolean canDig = (decide(input.next(), shovelQuestion));

            if (canDig == false) {
                System.out.println("\nYou need a shovel to mine the sand.");
                System.out.println(negGoodBye);
            } else {
                mine(sandBlock);
            }
        }
    }

//   Mines the given block

    static void mine(Sand sand) {

//         sets local value of block's hardness

        int currentHardness = sand.getHardness();

        System.out.println("\nThe sand scrapes against your shovel as it digs in.\n");

        sand.setHardness(currentHardness - 1);


//         sets local variable based on return of sand.isDestroyed()

        String diggingResult = sand.isDestroyed();


        if (sand.getHardness() <= 0) {
            // mining's done
            System.out.println("\nGreat work! You are now the proud owner of some " + diggingResult+ ". Now Move on!");
            //say goodbye
            System.out.println(posGoodbye);
        } else {
            // let user know block is not destroyed
            System.out.println("\nThis sand feels as hard as concrete.");

            /**
             * question to ask user for more than one mining attempt
             */
            String digAgainQuestion = "\nDo you want to keep digging?  (Y/N) ";

            System.out.print(digAgainQuestion);

            /**
             * return of digAgainQuestion
             */
            boolean willDigAgain = decide(input.next(), digAgainQuestion);

            if (willDigAgain == true) {
                // mine again
                mine(sand);
            } else {
                System.out.println(negGoodBye);
            }
        }

    }


//     * Handles Y/N answers
//     * reply    sets the string to use for deciding a return value
//     * question the question to ask if the reply does not meet usable criteria
//     * boolean  whether to proceed based on handled answer

    public static boolean decide(String reply, String question) {

//        user input is set to lowerCase and trimmed of trailing/leading whitespace

        String answer = reply.trim().toLowerCase();

        /**
         * value based on parsed user input
         */
        boolean decision = false;

        if (!answer.equals("y") && !answer.equals("n") && !answer.equals("yes") && !answer.equals("no")) {
            // answer is no.
            System.out.println("Y/N only please.");
            // prompt again
            System.out.println(question);
            //handle response
            decide(input.next(), question);
        } else if (answer.equals("n") || answer.equals("no")) {
            decision = false;
        } else if (answer.equals("y") || answer.equals("yes")) {
            decision = true;
        }
        return decision;

    }
}

