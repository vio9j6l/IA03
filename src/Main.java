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
    // TODO 8 + Declare as CreditCard type
    CreditCard visa = new Visa();
    // TODO 9 + Call the right method
    visa.chargeCard(123.45);

    // TODO 10 + Declare as CreditCard type
    CreditCard masterCard = new MasterCard();
    // TODO 11 + Call the right method
    masterCard.charge(135.79);

    // TODO 12 + Declare as IBank type
    IBank pnc = new PNC();
    // TODO 13 + Call the right method
    pnc.deposit(100);
    // TODO 14 + Declare as IBank type
    IBank bankOfAmerica = new BankOfAmerica();
    // TODO 15 + Call the right method
    bankOfAmerica.deposit(200);

    LionPay lionPay = new LionPay();

    System.out.println("Choose card");
    System.out.println("1) Visa");
    System.out.println("2) MasterCard");
    System.out.print("Enter choice: ");
    String userInput = keyboard.nextLine();
    int cardChoice = Integer.parseInt(userInput);

    System.out.println("Choose bank");
    System.out.println("1) PNC");
    System.out.println("2) Bank Of America");
    System.out.print("Enter choice: ");
    userInput = keyboard.nextLine();
    int bankChoice = Integer.parseInt(userInput);

    System.out.print("Card Balance: ");
    // TODO 16 + Delete this switch statement


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
