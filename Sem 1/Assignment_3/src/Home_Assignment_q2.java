import java.util.Scanner;

// Write a java program that prompts the user to enter an integer for today’s day of the
// week (Sunday is 0, Monday is 1… and Saturday is 6). Also prompt the user to enter
// the number of days after today for a future day and display the future day of the week.
// Here is a sample run:
// Enter today's day: 1
// Enter the number of days elapsed since today: 3
// Today is Monday and the future day is Thursday
// Enter today's day: 0 Enter the number of days elapsed
// since today: 31
// Today is Sunday and the future day is Wednesday

public class Home_Assignment_q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Today's day: ");
        int date = sc.nextInt();
        System.out.print("Enter the number of days elapsed since today :");
        int elapsed = sc.nextInt();
        int futureDay = (date + elapsed)%7;

        String day = "";

        switch (date){
            case 0 : day = "Sunday";
                    break;
            case 1 : day = "Monday";
                    break;
            case 2 : day = "Tuesday";
                    break;
            case 3 : day = "Wednesday";
                    break;
            case 4 : day = "Thursday";
                    break;
            case 5 : day = "Friday";
                    break;
            case 6 : day = "Saturday";
                    break;
        }

        if (futureDay == 0)
            System.out.println("Today is " + day + " and future day is Sunday");
        else if (futureDay == 1)
            System.out.println("Today is " + day + " and future day is Monday");
        else if (futureDay == 2)
            System.out.println("Today is " + day + " and future day is Tuesday");
        else if (futureDay == 3)
            System.out.println("Today is " + day + " and future day is Wednesday");
        else if (futureDay == 4)
            System.out.println("Today is " + day + " and future day is Thursday");
        else if (futureDay == 5)
            System.out.println("Today is " + day + " and future day is Friday");
        else if (futureDay == 6)
            System.out.println("Today is " + day + " and future day is Saturday");

    }
}
