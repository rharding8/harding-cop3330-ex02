/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Harding
 */

package ex02.base;

import java.util.Scanner;

public class StringCount {
  Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    StringCount count = new StringCount();
    String inputString = count.inString();
    System.out.println(count.outString(inputString));
  }

  public String inString() {
    System.out.print("Enter an input string: ");
    return input.nextLine();
  }

  public String outString(String in) {
    return String.format("%s has %d characters.", in, in.length());
  }
}
