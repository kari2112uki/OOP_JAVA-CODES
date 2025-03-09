//FRANKLIN KARIUKI CT1010/G/22924/24
//this program calculates discount based on user input

//importing scanner class for user input
import java.util.Scanner; 

public class discounted {
    
    public static double getDiscount(int amount) {
        //declaring discount varriable
        double discount; 

          //using if conditionals
        if (amount > 5000) {
            discount = 0.1 * amount;
        } else if (amount >= 1000 && amount <= 5000) {
            discount = 0.05 * amount;
        } else {
            discount = 0; 
        }

        return discount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter the amount: ");
        
        //reading user input
        int amount = scanner.nextInt();
        
        //calculating discount
        double discount = getDiscount(amount); 
        System.out.println("Discount: " + discount);
        
        //closing the scanner class
        scanner.close(); 
    }
}

    