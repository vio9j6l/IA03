package cards;

import lionpay.BankActionStatus;
import lionpay.CreditCard;

// TODO 07 + Modify this class to extend the CreditCard abstract class
//         - MODIFY THE EXISTING METHODS TO FULFILL THE INTERFACE CONTRACT
//         - DO NOT ADD NEW METHODS
//         - REMOVE ANY METHODS THAT DO NOT NEED TO BE OVERRIDDEN
//         - REMOVE ANY FIELDS THAT ARE IN THE PARENT CLASS
//         - Remember to use @Override when appropriate
public class Visa extends CreditCard
{
  private double creditLimit = 1000;
  private double bal;

  public BankActionStatus chargeCard(double chargeAmount) {
    if ((getBalance() + chargeAmount) > creditLimit) {
      return BankActionStatus.INSUFFICIENT_FUNDS; // insufficient funds
    }
    else {
      bal = bal + chargeAmount;
    }

    return BankActionStatus.SUCCESS;  // Successful transaction
  }

  public double getBalance() {
    return bal;
  }

  public void payBill(double payment) {
    bal = bal - payment;
  }
}
