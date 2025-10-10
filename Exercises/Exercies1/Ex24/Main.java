// 24. Write a program in Java that finds the string "OOP" in a string given by the user from a command-line argument.

public class Main {
  public static void main(String[] args) {
    int count = 0;
    int index = 0;
    String oop = "OOP";
    for (int i = 0; i < args[0].length(); i++) {
      if (args[0].charAt(i) == oop.charAt(index)) {
        count++;
        index++;
        if (count == 3) {
          System.out.println("OOP found");
          break;
        }
      } else {
        count = 0;
        index = 0;
      }
    }
  }
}