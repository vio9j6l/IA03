package lionpay;

public class LionPay
{
  // TODO 21 + Delete this method

  // TODO 22 + Delete this method

  // TODO 23 + Delete this method

  // TODO 24 - Delete this method

  public void payCardViaBank(CreditCard card, IBank bank, double payment) {
    BankActionStatus status;
    if ((status = bank.withdraw(payment)) == BankActionStatus.SUCCESS) {
      card.payBill(payment);
    }
    else {
      System.out.println("Error: " + status);
    }
  }
}
