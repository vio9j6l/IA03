/*
 * Course: IST 311
 * Semester: Spring 2020
 * Instructor: Phil O'Connell (pxo4)
 * Student: JiaJia liu
 * Email: jpl5840@psu.edu
 * Assignment: IA03
 */

package lionpay;

public class LionPay
{
  // TODO 21 + Delete this method

  // TODO 22 + Delete this method

  // TODO 23 + Delete this method

  // TODO 24 + Delete this method

  // Get the BankActionStatus status by declared it
  // Assign the result from withdraw method in the withdraw method
  // And if the result equals to success, call the payBill method to pay the bill
  // Otherwise, print out the Error and the returned status
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
