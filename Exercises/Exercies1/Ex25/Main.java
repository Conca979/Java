// 25. Write a program in Java that reads n integer numbers (n > 1) from the command-line argument, then prints the number that occurs most frequently.

public class Main {
  public static void main(String[] args) {
    int[] nums = new int[args.length];
    for (int i = 0; i < args.length; i++) {
      nums[i] = Integer.parseInt(args[i]);
      // System.out.println(nums[i]);
    }
    // sortting
    for (int i = 0; i < nums.length-1; i++) {
      for (int j = 0; j < nums.length-1-i; j++) {
        if (nums[j] > nums[j+1]) {
          int temp = nums[j];
          nums[j] = nums[j+1];
          nums[j+1] = temp;
        }
      }
    }
    //
    int count;
    if (nums.length == 0) {
      count = 0;
    } else {
      count = 1;
      for (int i = 0; i < nums.length-1; i++) {
        if (nums[i] != nums[i+1])
          count++;
      }
    }
    System.out.println("Unique numbers = "+count);
    //
    int index = 0;
    int[] frequency = new int[count*2];
    frequency[0] = nums[0];
    frequency[1] = 1;
    index += 2;
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] != nums[i-1]) {
        frequency[index] = nums[i];
        frequency[index+1] = 1;
        index += 2;
      } else {
        frequency[index-1]++;
      }
    }
    //
    for (int i = 0; i < frequency.length; i += 2) {
      System.out.printf("[%d|%d]", frequency[i], frequency[i+1]);
    }
    //
    int maxIndex = 1;
    for (int i = 1; i < frequency.length; i += 2) {
      if (frequency[i] > frequency[maxIndex]) {
        maxIndex = i;
      }
    }
    System.out.println("\nthe number that occurs most frequently = "+frequency[maxIndex-1]);
  }
}