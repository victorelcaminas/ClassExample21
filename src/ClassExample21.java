import java.util.Scanner;
class Example20bis {
    public static void main (String argv[]) {
        int year;
        boolean leap = false;
        System.out.println("Enter year:");
//Reading the value
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        year = inputValue.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    leap = true;
                }
            } else {
                leap = true;
            }
        }
        if (leap) {
            System.out.println("LEAP year");
        } else {
            System.out.println("NOT leap year");
        }
    }
}
