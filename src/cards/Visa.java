package cards;

// TODO 07 - Modify this class to extend the CreditCard abstract class
//         - MODIFY THE EXISTING METHODS TO FULFILL THE INTERFACE CONTRACT
//         - DO NOT ADD NEW METHODS
//         - REMOVE ANY METHODS THAT DO NOT NEED TO BE OVERRIDDEN
//         - REMOVE ANY FIELDS THAT ARE IN THE PARENT CLASS
//         - Remember to use @Override when appropriate
public class Visa
{
  private double creditLimit = 1000;
  private double bal;

  public int chargeCreditCard(double chargeAmount) {
    if ((getBal() + chargeAmount) > creditLimit) {
      return -1; // insufficient funds
    } else {
      bal = bal + chargeAmount;
    }

    return 0;  // Successful transaction
  }

  public double getBal() {
    return bal;
  }

  public void payTowardsBalance(double payment) {
    bal = bal - payment;
  }
}
