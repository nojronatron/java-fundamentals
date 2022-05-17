import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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

    clock();
  }

  // method uses LocalDataTime object to print out current time to console by the second.
  // must be manually killed with CTRL + C (or "Stop" if running in an IDE).
  // each second should only be printd once, format is HH:mm:ss
  public static void clock() {
    LocalDateTime now = LocalDateTime.now();
    boolean display = true;
    int priorSecond = now.getSecond();
    int second = priorSecond;
    float hertz = 0f;

    while (true) {
      while (priorSecond == second) {
        hertz++;
        now = LocalDateTime.now();
        second = now.getSecond();
      }

      priorSecond = second;
      now = LocalDateTime.now();
      int hour = now.getHour();
      int minute = now.getMinute();
      
      String timeNow = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
      float MHz = hertz / 1_000_000f;
      System.out.println(timeNow + " " + MHz + " MHz");
      hertz = 0;
    }
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