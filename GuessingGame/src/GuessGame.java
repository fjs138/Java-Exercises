/**
 * Created by frank on 1/3/16.
 */
public class GuessGame {
    GuessGamePlayer player1;
    GuessGamePlayer player2;
    GuessGamePlayer player3;

    public void startGame() {
        player1 = new GuessGamePlayer();
        player2 = new GuessGamePlayer();
        player3 = new GuessGamePlayer();

        int player1guess = 0;
        int player2guess = 0;
        int player3guess = 0;

        boolean player1right = false;
        boolean player2right = false;
        boolean player3right = false;

        int correctNumber = (int) (Math.random() * 10);
        System.out.println("I'm thinking of a number between 0 and 9...");

        while (true) {
            player1.guess();
            player2.guess();
            player3.guess();

            player1guess = player1.number;
            System.out.println("Player one guessed " + player1guess);

            player1guess = player2.number;
            System.out.println("Player two guessed " + player2guess);

            player1guess = player3.number;
            System.out.println("Player three guessed " + player3guess);

            if (player1guess == correctNumber) {
                player1right = true;
            } // end of if

            if (player2guess == correctNumber) {
                player2right = true;
            } // end of if

            if (player3guess == correctNumber) {
                player3right = true;
            } // end of if

            if (player1right || player2right || player3right) {

                System.out.println();
                System.out.println("We have a winner!");
                System.out.println();
                System.out.println("Player 1 got it right? " + player1right);
                System.out.println("Player 2 got it right? " + player2right);
                System.out.println("Player 3 got it right? " + player3right);
                System.out.println();
                System.out.println("Game is over.");
                break; // game over, break out of loop

            }// end of if
            else {
                // we keep going because nobody got it right
                System.out.println("Players will have to try again.");

            } // end if else



            } // end of while

        } // end of startGame method
    } // end of GuessGame class
