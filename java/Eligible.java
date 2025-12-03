import java.util.*;

public class Eligible{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        if(age>=18){
            System.out.println("Eligible to Vote");
        }
        else{
            System.out.println("Not eligible");
        }
    }
}