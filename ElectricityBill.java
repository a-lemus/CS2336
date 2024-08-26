/*
For first 50 units $ 0.50/unit
For next 100 units $ 0.75/unit
For next 100 units $ 1.20/unit
For unit above 250 $ 1.50/unit
An additional surcharge of 20% is added to the bill.
 */

import java.util.Scanner;
public class ElectricityBill {
    public static void main(String[] args) {
        int units;
        double bill = 0;

      
        // get units from scanner and calculate bill
        Scanner sc = new Scanner(System.in);
        units = sc.nextInt();

        if (units > 50) {
          bill+=25;
          units-=50;
        }
        else {bill+=units*.5; units=0;}
        if (units > 100) {
          bill+=75;
          units-=100;
        }
        else {bill+=units*.75; units=0;}
        if (units > 100) {
          bill+=120;
          units-=100;
        }
        else {bill+=units*1.2; units = 0;}
        bill+=units*1.5;
        bill*=1.2;
// WRITE YOUR CODE HERE
        System.out.printf("The electricity bill is $%.2f\n", bill);
    }
}
