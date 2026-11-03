package wix1002.lab04;

import java.util.Scanner;

/**
 * @author User
 */
public class L4Q4_task {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // 1. Get the input from users Input
            System.out.print("Enter the year: ");
            int year = sc.nextInt();
            System.out.print("Enter the first day of the year (0-6): ");
            int firstDayOfYear = sc.nextInt();

            // 2. Perform required calculation Processing
            boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
            int dayUntilNovember = 31 + (isLeapYear ? 29 : 28) + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
            
            int firstDayOfNovember = (firstDayOfYear + dayUntilNovember) % 7;

            String columnFormat = "%4s";
            String format = "%4s%4s%4s%4s%4s%4s%4s%n"; // string formatting - different types of string formatting

            System.out.println("November"+year);
            // 3. Print the calendar of May Output
            System.out.printf(format, "Mon", "Tue", "Wed", "Thu", "Fri", "Sat","Sun");
            for (int i = 0; i < firstDayOfNovember; i++) {
                System.out.printf(columnFormat, "");
            }
            
            for (int i = 1; i <= 30; i++) {
                System.out.printf(columnFormat, i);
                if ((i + firstDayOfNovember) % 7 == 0) {
                    System.out.println();
                }
            }
            System.out.println("");
        }
    }
}