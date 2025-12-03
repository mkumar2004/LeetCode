import java.util.*;

public class Leapyear {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int yr = scan.nextInt();

        if ((yr % 400 == 0) || (yr % 4 == 0 && yr % 100 != 0)) {
            System.out.println("leap year");
        } else {
            System.out.println("not a leap year");
        }
    }
}