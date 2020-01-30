package lionpay;

import banks.BankOfAmerica;
import banks.PNC;
import cards.MasterCard;
import cards.Visa;

public class LionPay
{
  // TODO 21 - Delete this method
  public void payMasterCardViaPnc(MasterCard card, PNC bank, double payment) {
    int status;
    if ((status = bank.takeMoneyOut(payment)) == 0) {
      card.makePayment(payment);
    } else {
      System.out.println("Error: " + status);
    }
  }

  // TODO 22 - Delete this method
  public void payMasterCardViaBankOfAmerica(MasterCard card, BankOfAmerica bank, double payment) {
    String status;
    if ((status = bank.withdraw(payment)) == "success") {
      card.makePayment(payment);
    } else {
      System.out.println("Error: " + status);
    }
  }

  // TODO 23 - Delete this method
  public void payVisaViaPnc(Visa card, PNC bank, double payment) {
    int status;
    if ((status = bank.takeMoneyOut(payment)) == 0) {
      card.payTowardsBalance(payment);
    } else {
      System.out.println("Error: " + status);
    }
  }

  // TODO 24 - Delete this method
  public void payVisaViaBankOfAmerica(Visa card, BankOfAmerica bank, double payment) {
    String status;
    if ((status = bank.withdraw(payment)) == "success") {
      card.payTowardsBalance(payment);
    } else {
      System.out.println("Error: " + status);
    }
  }

  public void payCardViaBank(CreditCard card, IBank bank, double payment) {
    BankActionStatus status;
    if ((status = bank.withdraw(payment)) == BankActionStatus.SUCCESS) {
      card.payBill(payment);
    } else {
      System.out.println("Error: " + status);
    }
  }
}
