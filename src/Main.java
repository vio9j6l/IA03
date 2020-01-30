import banks.BankOfAmerica;
import banks.PNC;
import cards.MasterCard;
import cards.Visa;
import lionpay.LionPay;

import java.util.Scanner;

public class Main
{

  private static final Scanner keyboard = new Scanner(System.in);

  public static void main(String[] args) {
    // TODO 8 - Declare as CreditCard type
    Visa visa = new Visa();
    // TODO 9 - Call the right method
    visa.chargeCreditCard(123.45);

    // TODO 10 - Declare as CreditCard type
    MasterCard masterCard = new MasterCard();
    // TODO 11 - Call the right method
    masterCard.chargeCard(135.79);

    // TODO 12 - Declare as IBank type
    PNC pnc = new PNC();
    // TODO 13 - Call the right method
    pnc.deposit(100);
    // TODO 14 - Declare as IBank type
    BankOfAmerica bankOfAmerica = new BankOfAmerica();
    // TODO 15 - Call the right method
    bankOfAmerica.putMoneyIn(200);

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
    // TODO 16 - Delete this switch statement
    switch (cardChoice) {
      case 1:
        System.out.println(visa.getBal());
        break;
      case 2:
        System.out.println(masterCard.balance());
        break;
    }

    // TODO 17 - Uncomment this code
    // CreditCard chosenCard = null;
    // switch (cardChoice) {
    //   case 1:
    //     chosenCard = visa;
    //     break;
    //   case 2:
    //     chosenCard = masterCard;
    //     break;
    // }
    // System.out.println(chosenCard.getBalance());

    System.out.print("Bank Balance: ");
    
    // TODO 18 - Delete this switch statement
    switch (bankChoice) {
      case 1:
        System.out.println(pnc.getBal());
        break;
      case 2:
        System.out.println(bankOfAmerica.getCurrentBalance());
        break;
    }

    // TODO 19 - Uncomment this code
    // IBank chosenBank = null;
    // switch (bankChoice) {
    //   case 1:
    //     chosenBank = pnc;
    //     break;
    //   case 2:
    //     chosenBank = bankOfAmerica;
    //     break;
    // }
    // System.out.println(chosenBank.getBalance());

    System.out.print("Enter amount to pay: ");
    userInput = keyboard.nextLine();
    double payment = Double.parseDouble(userInput);

    // TODO 20 - Remove all 9 lines of this entire if-else block
    if (cardChoice == 1 && bankChoice == 1) {
      lionPay.payVisaViaPnc(visa, pnc, payment);
    } else if (cardChoice == 1 && bankChoice == 2) {
      lionPay.payVisaViaBankOfAmerica(visa, bankOfAmerica, payment);
    } else if (cardChoice == 2 && bankChoice == 1) {
      lionPay.payMasterCardViaPnc(masterCard, pnc, payment);
    } else if (cardChoice == 2 && bankChoice == 2) {
      lionPay.payMasterCardViaBankOfAmerica(masterCard, bankOfAmerica, payment);
    }

    // TODO 25 - Uncomment this code
    // lionPay.payCardViaBank(chosenCard, chosenBank, payment);

    System.out.print("New Card Balance: ");
    // TODO 26 - Delete this switch statement
    switch (cardChoice) {
      case 1:
        System.out.println(visa.getBal());
        break;
      case 2:
        System.out.println(masterCard.balance());
        break;
    }

    // TODO 27 - Uncomment this line
    // System.out.println(chosenCard.getBalance());

    System.out.print("New Bank Balance: ");
    // TODO 28 - delete this switch statement
    switch (bankChoice) {
      case 1:
        System.out.println(pnc.getBal());
        break;
      case 2:
        System.out.println(bankOfAmerica.getCurrentBalance());
        break;
    }
    
    // TODO 29 - Uncomment this line
    // System.out.println(chosenBank.getBalance());
  }

}
