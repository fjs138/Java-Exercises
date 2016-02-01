/**
 * Created by frank on 1/29/16.
 */
public class PoolPuzzleOne {
    public static void main (String [] args) {
        int x = 0; // compile test

        while ( x < 4 ) {

            System.out.print("a");
            if (x < 1 ) {
                System.out.print(" ");
            } // end of x<1 if
            System.out.print("n");

            if ( x > 1 ) {

                System.out.print(" oyster");
                x = x + 2;

            } // end of x>1 if

            if ( x == 1 ) {
                System.out.print("noys");
            } // end of x==1 if
            if ( x < 1) {
                System.out.print("oise");

            }
            System.out.print(" ");

            x = x + 1;

        } // end of while loop

    } // end of main method

} // end of PoolPuzzleOne class
