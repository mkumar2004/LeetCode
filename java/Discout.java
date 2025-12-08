// Write a program discount calculation on bill amount. 
// The bill amount is Rs:5,000 and give discount (500 to 100) using Multiple if statement without else statement.
public class Discout {
    public static void main(String[] args) {

        int bill = 5000;
        int discount = 0;

        if (bill == 5000) {
            discount = 500;
        }
        if (bill == 4000) {
            discount = 400;
        }
        if (bill == 3000) {
            discount = 300;
        }
        if (bill == 2000) {
            discount = 200;
        }
        if (bill == 1000) {
            discount = 100;
        }

        System.out.println("Bill Amount: " + bill);
        System.out.println("Discount: " + discount);
        System.out.println((bill - discount));
    }
}
