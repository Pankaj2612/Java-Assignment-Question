// Write a method that returns the number of days in a year using the following header:
// public static int numberOfDaysInAYear(int year)
// Write a java program that displays the number of days in year from 2000 to 2020.

public class q4 {

  public static int numberOfDaysInAYear(int fromyear, int toyear) {
    int days=0;
    for (int i = fromyear; i < toyear; i++) {
      if(i%4 == 0){
        days += 366;
      
      }
      else{
      days += 365;
      }
    }
    return days;
  }

  public static void main(String[] args) {
    System.out.println(numberOfDaysInAYear(2000,2020));
  }
}
