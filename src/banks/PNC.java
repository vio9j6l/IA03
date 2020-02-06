package banks;

import lionpay.BankActionStatus;
import lionpay.IBank;

// TODO 02 + Modify this class to implement IBank interface
//         + MODIFY THE EXISTING METHODS TO FULFILL THE INTERFACE CONTRACT
//         + DO NOT ADD NEW METHODS
//         + Remember to user @Override when appropriate
public class PNC implements IBank
{
  private double remainingBalance;

  // Put the money into the bank and bank balance and return Success
  @Override
  public BankActionStatus deposit(double amount) {
    if (amount < 1) {
      return BankActionStatus.DEPOSIT_FAILURE;
    }
    remainingBalance += amount;
    return BankActionStatus.SUCCESS;
  }

  // If entered number is greater than bank balance, return insufficient funds
  // Otherwise, return success and minus the amount from the bank balance
  @Override
  public BankActionStatus withdraw(double amount) {
    if (amount > remainingBalance) {
      return BankActionStatus.INSUFFICIENT_FUNDS; // not enough funds
    }
    remainingBalance -= amount;
    return BankActionStatus.SUCCESS; // success
  }

  @Override
  public double getBalance() {
    return remainingBalance;
  }
}
