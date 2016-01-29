/**
 * Created by frank on 1/3/16.
 */
public class GuessGamePlayer {
    int number = 0; //where the guess goes

    public void guess(){
        number = (int) (Math.random() * 10);
        System.out.println("I'm guessing " + number);

    } // end of guess method
} // end of GuessGamePlayer class
