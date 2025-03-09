//FRANKLIN KARIUKI CT101/G/22924/24
//code to calculate discount based on user input

public class discountCalculator {
    
    public static double getDiscount(int amount) {
        double discount; // Declare the variable
        
        if (amount > 5000) {
            discount = 0.1 * amount;
        } else if (amount >= 1000 && amount <= 5000) {
            discount = 0.05 * amount;
        } else {
            discount = 0; // No discount case
        }

        return discount;
    }

    public static void main(String[] args) {
        double discount = getDiscount(7000);
        System.out.println("Discount: " + discount);
    }
}