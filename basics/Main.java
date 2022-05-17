public class Main {
  public static void main(String[] args) {
    String greeting = "Hello World!";
    System.out.println(greeting);

    String pluralizedResult = pluralize(dog, 2);
    System.out.println(pluralizedResult);

  }

  // function accepts a string and an int and returns the string concatenated
  // with an "s" if the int is 0 or more than 1, otherwise returns word as-is
  public static String pluralize(String word, int numTimes) {
    if (numTimes == 1) {
      return word;
    }
    if (numTimes == 0 || numTimes > 1) {
      return (word + "s");
    }
  }

  //  function returns nothering so type is "void"
  public static void loopTo(int max) {
    for (int i=0; i<max; i++) {
      System.out.println("Loop #: " + i);
    }
  }

  //  this function has a return type of "int"
  public static int multiplyByTwo(int n) {
    return n * 2;
  }
}