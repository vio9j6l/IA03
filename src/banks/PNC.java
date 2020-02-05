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

  public BankActionStatus deposit(double amount) {
    if (amount < 1) {
      //return -1; // insufficient deposit
      return BankActionStatus.DEPOSIT_FAILURE;
    }
    remainingBalance += amount;
    //return 0; // success
    return BankActionStatus.SUCCESS;
  }

  @Override
  public BankActionStatus withdraw(double amount) {
    if (amount > remainingBalance) {
      return BankActionStatus.INSUFFICIENT_FUNDS; // not enough funds
    }
    remainingBalance -= amount;
    return BankActionStatus.SUCCESS; // success
  }

  public double getBalance() {
    return remainingBalance;
  }
}
