import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        // Inputs and Variables
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the bill amount: ");
        String numBill = s.nextLine();
        double newBill = Double.parseDouble(numBill);
        System.out.print("Enter the tip percentage (Whole Num): ");
        String tipPercent = s.nextLine();
        int tipPercentage = Integer.parseInt(tipPercent);
        System.out.print("How many people will be paying? ");
        String pplNum = s.nextLine();
        int numPeople = Integer.parseInt(pplNum);

        // Calculations
        double totalTip = newBill * (tipPercentage * .01);
        double totalBill = totalTip + newBill;
        double totalPerPerson = totalBill / numPeople;
        double tipPerPerson = totalTip / numPeople;

        // Outputs
        System.out.println("");
        System.out.println("The total bill came out to: " + String.format("%.2f", totalBill));
        System.out.println("The total tip was: " + String.format("%.2f", totalTip));
        System.out.println("The bill split up per person comes out to: " + String.format("%.2f", totalPerPerson));
        System.out.println("The tip split up per person comes out to: " + String.format("%.2f",tipPerPerson));





    }
}