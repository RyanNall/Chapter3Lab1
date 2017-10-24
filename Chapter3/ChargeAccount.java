
/**
 * Write a description of class ChargeAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;
import java.text.NumberFormat;
public class ChargeAccount
{
    
   public static void main (String[] args){
       
   //Declare variables
   double previousBalance;
   double additionalCharges;
   double intrest;
   double newBalance;
   double intrestCost;
   double miniumPayment;
   Scanner scan = new Scanner(System.in);
   
   //Previous balance
   System.out.println ("Enter the previous balance: ");
   previousBalance = scan.nextDouble();
   
   //Additional charges
   System.out.println("Enter the total amount of additional charges (this month): ");
   additionalCharges = scan.nextDouble();
   
   //Compute Intrest
   if (previousBalance == 0){
       intrest = 0.00;
    }
   else{
        intrest = 0.02;
    }
   intrestCost = intrest * (previousBalance + additionalCharges);
   
   //Compute total new balance
   newBalance = (previousBalance + additionalCharges + intrestCost);
   
   //Calculate minium payment
   if (newBalance < 50){
       miniumPayment = newBalance;
    }
   else if ((newBalance <=300) && (newBalance >= 50)){
       miniumPayment = 50;
    }
   else if (newBalance > 300){
       miniumPayment = 0.20 * newBalance;
    }
   else{
        miniumPayment = 0;
    }
    
    
    
   System.out.println("CS CARD International Statement");
   System.out.println("===============================");
   System.out.println();
   System.out.println("Previous Balance: " + "\t" + previousBalance +"$");
   System.out.println("Additional Charges: " + "\t" + additionalCharges +"$");
   System.out.println("Intrest: " + "\t\t" + intrest);
   System.out.println();
   System.out.println("New Balance: " + "\t\t" + newBalance +"$");
   System.out.println();
   System.out.println("Minium Payment: " + "\t" + miniumPayment +"$");
  }
}
