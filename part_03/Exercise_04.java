package part_03;


import java.util.Scanner;

/**

 Code a "Rock Paper Scissors" Game

 */
//class
public class Exercise_04 {

    //main method
    public static void main(String[] strings) throws java.io.IOException {

        //scanner to enter a number 0-2
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 0 for scissor, 1 for rock, 2 for paper: ");

        //variable playerHand that takes user input
        int playerHand = input.nextInt();

        //variable computerHand that generates a random number 0-2
        int computerHand = (1 + (int) (Math.random() * (3 - 1)));

        //returns a string argument from the getHand method called on playerHand
        String playerString = getHand(playerHand);

        //returns a string argument from the getHand method called on computerHand
        String computerString = getHand(computerHand);

        //variable winner returns a string from the determineWinner method with parameters computerHand and playerHand
        String winner = determineWinner(computerHand, playerHand);

        //prints out the player hand and computer hand
        System.out.println("Player hand = " + playerString + " and computer hand = "  + computerString);
        //prints out the winner
        System.out.println(winner);


    }

    // getHand method
    public static String getHand(int hand){
        // switch statement to determine each players hand
        // 0 = scissor, 1 = rock, 2 = paper
        switch(hand){
            case 0:
                return "scissors";
            case 1:
                return "rock";
            case 2:
                return "paper";
            default:
                return "error";
        }
    }

    //determineWinner method returns string given the
    public static String determineWinner(int computer, int player) {

        String status = "";


        if(computer == player){
            status = " you tied";
        } else {
            switch (player) {
                // use conditional ("?") operator
                case 0:
                    status = (computer != 1) ? "You won!" : "You lost :(";
                    break;
                case 1:
                    status = (computer != 2) ? "You won!" : "You lost :(";
                    break;
                case 2:
                    status = (computer != 0) ? "You won!" : "You lost :(";
                    break;
            }
        }
        return status;
            // implement the two remaining cases;
    }
}






//
//
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter 0 for scissor, 1 for rock, 2 for paper: ");
//        int playerHand = input.nextInt();
//
//        // call getHand(int hand) to determine the computers hand
//
//        // call getHand(int hand) to determine the players hand
//
//        // call determineWinner(int computerHand, int playerHand) to determine who one
//
//        // print out a message to the console stating which hand the computer had, which hand
//        // the play had and who won.
//
//    }
//
//    public static String getHand(int hand) {
//
//        // use a switch statement to determine each players hand
//        // 0 = scissor, 1 = rock, 2 = paper
//
//        // return hand
//    }
//
//
