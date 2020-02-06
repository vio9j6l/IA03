/*
 * Course: IST 311
 * Semester: Spring 2020
 * Instructor: Phil O'Connell (pxo4)
 * Student: JiaJia liu
 * Email: jpl5840@psu.edu
 * Assignment: IA03
 */

import banks.BankOfAmerica;
import banks.PNC;
import cards.MasterCard;
import cards.Visa;
import lionpay.CreditCard;
import lionpay.IBank;
import lionpay.LionPay;

import java.util.Scanner;

public class Main
{
  private static final Scanner keyboard = new Scanner(System.in);

  public static void main(String[] args) {
    // create an object called visa of CreditCard type and call the charge method
    // TODO 8 + Declare as CreditCard type
    CreditCard visa = new Visa();
    // TODO 9 + Call the right method
    visa.charge(123.45);

    //create an object called masterCard of CreditCard type and call the method named charge
    // TODO 10 + Declare as CreditCard type
    CreditCard masterCard = new MasterCard();
    // TODO 11 + Call the right method
    masterCard.charge(135.79);

    //create an object called pnc of IBank type and call the deposit method to put the money into PNC bank of $100
    // TODO 12 + Declare as IBank type
    IBank pnc = new PNC();
    // TODO 13 + Call the right method
    pnc.deposit(100);

    //create an object called bankOfAmerica of IBank type and call the deposit method to put the money into into the BankOfAmerica bank of $200
    // TODO 14 + Declare as IBank type
    IBank bankOfAmerica = new BankOfAmerica();
    // TODO 15 + Call the right method
    bankOfAmerica.deposit(200);

    // create an object of LionPay type
    LionPay lionPay = new LionPay();

    // Print out the instructions and options
    // Get the user input, convert it to int type, and assign it to integer variable called cardChoice
    System.out.println("Choose card");
    System.out.println("1) Visa");
    System.out.println("2) MasterCard");
    System.out.print("Enter choice: ");
    String userInput = keyboard.nextLine();
    int cardChoice = Integer.parseInt(userInput);

    // Print out the instructions and options
    // Get the user input, convert it to int type, and assign it to integer variable called bankChoice
    System.out.println("Choose bank");
    System.out.println("1) PNC");
    System.out.println("2) Bank Of America");
    System.out.print("Enter choice: ");
    userInput = keyboard.nextLine();
    int bankChoice = Integer.parseInt(userInput);

    System.out.print("Card Balance: ");

    // TODO 16 + Delete this switch statement

    // Declare a variable named chosenCard with the type of CreditCard
    // Then use the switch method to figure out which card and use getBalance() to get the balance of the card
    // Then print it out
    // TODO 17 + Uncomment this code
    CreditCard chosenCard = null;
    switch (cardChoice) {
      case 1:
        chosenCard = visa;
        break;
      case 2:
        chosenCard = masterCard;
        break;
    }
    System.out.println(chosenCard.getBalance());

    System.out.print("Bank Balance: ");

    // TODO 18 + Delete this switch statement

    // Declare a variable named chosenBank with the type of Ibank
    // Then use the switch method to figure out which bank and use getBalance() to get the balance of the certain bank
    // Then print it out
    // TODO 19 + Uncomment this code
    IBank chosenBank = null;
    switch (bankChoice) {
      case 1:
        chosenBank = pnc;
        break;
      case 2:
        chosenBank = bankOfAmerica;
        break;
    }
    System.out.println(chosenBank.getBalance());

    System.out.print("Enter amount to pay: ");
    userInput = keyboard.nextLine();
    double payment = Double.parseDouble(userInput);

    // TODO 20 + Remove all 9 lines of this entire if-else block

    // Call payCardViaBank method to pay the bill
    // TODO 25 + Uncomment this code
    lionPay.payCardViaBank(chosenCard, chosenBank, payment);

    System.out.print("New Card Balance: ");
    // TODO 26 + Delete this switch statement

    // TODO 27 + Uncomment this line
    System.out.println(chosenCard.getBalance());

    System.out.print("New Bank Balance: ");
    // TODO 28 + delete this switch statement

    // TODO 29 + Uncomment this line
    System.out.println(chosenBank.getBalance());
  }

}
