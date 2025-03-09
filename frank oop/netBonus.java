//FRANKLIN KARIUKI
//CT 101/G/22924/24
//THIS PROGRAM CALCULATES THE NET BONUS OF AN EMPLOYEE BASEDON THE YEARS OF SERVICE

//IMPORTING SCANNER FOR USER INPUT
import java.util.Scanner;

//  Creating Main class
public class netBonus {
    
    public static void main(String[] args) {

        // Creating Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompting the user to input salary and years served
        System.out.print("Enter your salary: ");
        int salary = scanner.nextInt();

        System.out.print("Enter your years of service: ");
        int years = scanner.nextInt();

        // Initializing variables
        double bonusPercentage = 0.0;
        double netBonusAmount;

        //using conditional if statement to award bonus based on user input
        if (years > 10) {
            bonusPercentage = 0.12; 
        } else if (years >= 6) {
            bonusPercentage = 0.10;
        } else {
            bonusPercentage = 0.08; 
        }

        // Calculating the net bonus amount
        netBonusAmount = salary * bonusPercentage;

        // Outputing the calculated bonus
        System.out.println("Bonus awarded: " + (int)(bonusPercentage * 100) + "%");
        System.out.println("Net bonus amount: " + netBonusAmount);

        // Closing the scanner
        scanner.close();
    }
}