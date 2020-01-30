package banks;

// TODO 02 - Modify this class to implement IBank interface
//         - MODIFY THE EXISTING METHODS TO FULFILL THE INTERFACE CONTRACT
//         - DO NOT ADD NEW METHODS
//         - Remember to user @Override when appropriate
public class PNC
{
  private double remainingBalance;

  public int deposit(double amount) {
    if (amount < 1) {
      return -1; // insufficient deposit
    }
    remainingBalance += amount;
    return 0; // success
  }

  public int takeMoneyOut(double amount) {
    if (amount > remainingBalance) {
      return -1; // not enough funds
    }
    remainingBalance -= amount;
    return 0; // success
  }

  public double getBal() {
    return remainingBalance;
  }
}
