import java.util.Random;

public class Main {
  public static void main(String[] args) {
    String greeting = "Hello World!";
    System.out.println(greeting);

    // the following code was copied from the assignment as a means to test the function
    int dogCount = 1;
    System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

    int catCount = 2;
    System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

    int turtleCount = 0;
    System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

    flipNHeads(3);
  }

  // function accepts an int and "flips coins" until n heads are flipped in a row
  // random number generator should select floats between 0 and 1
  // anything below 0.5 are considered tails
  // numbers 0.5 and above are considered heads
  // print "head" or "tails" on one line for each flip
  // print "it took FLIPS flips to flip N heads in a row" once n heads in a row occurs
  public static void flipNHeads(int n) {
    Random rand = new Random();
    int headCount = 0;
    int totalFlips = 0;
    
    while (headCount < n) {
      float headTail = rand.nextFloat();
      totalFlips++;

      if (headTail > 0.5) {
        headCount++;
        System.out.println("heads!");
      } else {
        System.out.println("tails!");
        headCount = 0;
      }
    }

    System.out.println("It took " + totalFlips + " flips to flip " + headCount + "heads in a row.");
  }

  // function accepts a string and an int and returns the string concatenated
  // with an "s" if the int is 0 or more than 1, otherwise returns word as-is
  public static String pluralize(String word, int numTimes) {
    // string result = "";

    // if (numTimes == 1) {
    //   return word;
    // }
    if (numTimes == 0 || numTimes > 1) {
      return (word + "s");
    }

    return word;
  }

}