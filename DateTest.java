package chapter3;
import java.util.Scanner;

public class DateTest {
    public static void main(String[] args) {

        Date myClock = new Date(04, 04, 1994);

        System.out.printf("month is: %d%n", myClock.getMonth());
        System.out.printf("day is: %d%n", myClock.getDay());
        System.out.printf("year is: %d%n", myClock.getYear());

        Scanner input = new Scanner(System.in);

        System.out.println("Enter month");
        myClock.setMonth(input.nextInt());
        System.out.println("Enter day");
        myClock.setDay(input.nextInt());
        System.out.println("Enter year");
        myClock.setYear(input.nextInt());

        System.out.printf("display date is %d", myClock.displayDate());

    }


}
