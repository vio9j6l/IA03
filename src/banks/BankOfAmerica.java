package banks;

import lionpay.BankActionStatus;
import lionpay.IBank;

// TODO 01 + Modify this class to implement IBank interface
//         + MODIFY THE EXISTING METHODS TO FULFILL THE INTERFACE CONTRACT
//         + DO NOT ADD NEW METHODS
//         + Remember to user @Override when appropriate
public class BankOfAmerica implements IBank
{
  private double balance;

  // Put the money into bank balance and return Success
  @Override
  public BankActionStatus deposit(double amount) {
    balance += amount;
    return BankActionStatus.SUCCESS;
  }

  // If entered number is greater than bank balance, return insufficient funds
  // Otherwise, return success and minus the amount from the bank balance
  @Override
  public BankActionStatus withdraw(double amount) {
    if (amount > balance) {
      return BankActionStatus.INSUFFICIENT_FUNDS; // insufficient funds
    }
    balance -= amount;
    return BankActionStatus.SUCCESS;
  }

  @Override
  public double getBalance() {
    return balance;
  }
}
