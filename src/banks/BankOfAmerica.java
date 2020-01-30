package banks;

// TODO 01 - Modify this class to implement IBank interface
//         - MODIFY THE EXISTING METHODS TO FULFILL THE INTERFACE CONTRACT
//         - DO NOT ADD NEW METHODS
//         - Remember to user @Override when appropriate
public class BankOfAmerica
{
  private double balance;

  public String putMoneyIn(double amount) {
    balance += amount;
    return "success";
  }

  public String withdraw(double amount) {
    if (amount > balance) {
      return "err"; // insufficient funds
    }
    balance -= amount;
    return "success";
  }

  public double getCurrentBalance() {
    return balance;
  }
}
