package banks;

import lionpay.BankActionStatus;
import lionpay.IBank;

// TODO 01 - Modify this class to implement IBank interface
//         - MODIFY THE EXISTING METHODS TO FULFILL THE INTERFACE CONTRACT
//         - DO NOT ADD NEW METHODS
//         - Remember to user @Override when appropriate
public class BankOfAmerica implements IBank
{
  private double balance;

  public BankActionStatus putMoneyIn(double amount) {
    balance += amount;
    return BankActionStatus.SUCCESS;
  }

  public double withdraw(double amount) {
    if (amount > balance) {
      return "err"; // insufficient funds
    }
    balance -= amount;
    return "success";
  }

  @Override
  public BankActionStatus deposit(double amount) {
    return null;
  }

  @Override
  public double getBalance() {
    return 0;
  }

  public double getCurrentBalance() {
    return balance;
  }
}
