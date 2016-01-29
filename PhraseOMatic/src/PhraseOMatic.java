public class PhraseOMatic {
    public static void main (String[] args) {
        //make three sets of words to choose from
        String[] wordListOne = {"24/7", "multi-tier", "30,000 foot", "B2B", "win-win",
                "front-end", "web-based", "pervasive", "smart", "six-sigma",
                "critical-path" , "dynamic"};
        String[] wordListTwo = {"empowered", "sticky", "value-added", "oriented", "centric",
                "distributed", "clustered", "branded", "outaide-the-box",
                "positioned", "networked", "focused", "leveraged", "aligned",
                "targeted", "shared", "cooperative", "accelerated"};
        String[] wordListThree = {"process", "tipping-point", "solution", "architecture",
                "core competency", "strategy", "mindshare", "portal",
                "apace", "vision", "paradigm", "mission"};

        // find out how many words are in each list, storing that value in wordListXLength
        int wordListOneLength = wordListOne.length;
        int wordListTwoLength = wordListTwo.length;
        int wordListThreeLength = wordListThree.length;

        // generate three random numbers
        int randomNumberOne = (int) (Math.random() * wordListOneLength);
        int randomNumberTwo = (int) (Math.random() * wordListTwoLength);
        int randomNumberThree = (int) (Math.random() * wordListThreeLength);

        // new build a phrase
        String phrase = wordListOne[randomNumberOne] + " " + wordListTwo[randomNumberTwo] + " "
                + wordListThree[randomNumberThree];

        // print out the phrase
        System.out.println("What we need is a " + phrase + "!");

    } // end of main method

} // end of PhraseOMatic class
