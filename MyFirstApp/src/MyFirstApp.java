public class MyFirstApp {

    public static void main (String[] args) {
        System.out.println("I Rule!");
        System.out.println("The World!");


        // do something
        int x = 3;
        String name = "Dirk";
        x = x * 17;
        System.out.println("x is " + x);
        double d = Math.random();


        // loops do things again and again
        while (x > 12) {
            x = x -1;

        } // end of while loop

        for (x = 0; x < 10; x = x + 1) {
            System.out.println("x is now " + x);
        }// end of for loop


        // do something under this condition
        if (x == 10) {
            System.out.println("x must be 10");

        } // end of if statement
        else {
            System.out.println("x isn't 10");
        } // end of else statement
        if ((x<3) & (name.equals("Dirk"))) {
            System.out.println("Gently");
        } // end of if statement
        System.out.println("This line runs no matter what");

        x = 4; // assign 4 to x
        while (x > 3) {
            // loop code will run because
            // x is greater than 3
            x = x - 1; // or we'd loop forever
        } // end of while loop

        int z = 27; //
        while (z == 17) {
            // loop code will not run because
            // z is not equal to 17
        }





    } // end of main method
} // end of class