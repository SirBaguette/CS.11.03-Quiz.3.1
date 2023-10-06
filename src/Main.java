import java.util.Locale;

public class Main {

    // Question 1 - calculateGrade
    public static char calculateGrade(int s) {
        if (s >= 90){
            return 'A';
        }
        else if (s >= 80) {
            return 'B';
        }
        else if (s >= 70) {
            return 'C';
        }
        else if (s >= 60) {
            return 'D';
        }
        else if (s >= 50) {
            return 'E';
        }
        else return 'F';
    }
    // Question 2 - fizzBuzz
    public static String fizzBuzz(int n) {
        if (n%3 == 0 && n%5 == 0) {
            return "fizzbuzz";
        }
        else if (n%3 == 0) {
            return "fizz";
        }
        else if (n%5 == 0) {
            return "buzz";
        }
        else return "unlucky";
    }
    // Question 3 - frontBack
    public static String frontBack(String ai) {
        if (ai.length() <= 1) {
            return ai;
        }
        else {
            return ai.substring(0,2) + ai + ai.substring(0,2);
        }
    }
    // Question 4 - twoAsOne
    public static boolean twoAsOne(int a, int b, int c) {
        if ( a+b == c || a+c == b|| b+c == a) {
            return true;
        }
        return false;
    }
    // Question 5 - endUp
    public static String endUp(String ep) {
        if (ep.length() <= 3) {
            return ep.toUpperCase();
        }
        else {
            String abs = ep.substring(ep.length()-3, ep.length());
            return ep.substring(0,ep.length()-3) + abs.toUpperCase();
        }
    }
}
