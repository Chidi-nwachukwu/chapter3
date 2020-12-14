
package chapter3;/*(Date Class) Create a class called Date that includes three instance variables—a month (type int),
 a day (type int) and a year (type int). Provide a constructor that initializes the three instance variables and
  assumes that the values provided are correct. Provide a set and a get method for each instance variable. Provide a
  method displayDate that displays the month, day and year separated by forward slashes (/). Write a test app named
  DateTest that demonstrates class Date’s capabilities*/

public class Date {
  private int month;
  private int day;
  private int year;
  private String displayDate;

    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String displayDate() {

        System.out.printf("displayDate is %d/%d/%d\n", getMonth(), getDay(), getYear());
        return displayDate;
    }
}
