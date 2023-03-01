// Write a method that returns the number of days in a year using the following header:
// public static int numberOfDaysInAYear(int year)
// Write a java program that displays the number of days in year from 2000 to 2020.

public class q4 {

  public static int numberOfDaysInAYear(int year) {
    int day = 365 * 20;
    return day;
  }

  public static void main(String[] args) {
    System.out.println(numberOfDaysInAYear(20));
  }
}
