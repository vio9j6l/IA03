/*
 * Course: IST 311
 * Semester: Spring 2020
 * Instructor: Phil O'Connell (pxo4)
 * Student: JiaJia liu
 * Email: jpl5840@psu.edu
 * Assignment: IA03
 */

package cards;

import lionpay.CardActionStatus;
import lionpay.CreditCard;

// TODO 07 + Modify this class to extend the CreditCard abstract class
//         + MODIFY THE EXISTING METHODS TO FULFILL THE INTERFACE CONTRACT
//         + DO NOT ADD NEW METHODS
//         + REMOVE ANY METHODS THAT DO NOT NEED TO BE OVERRIDDEN
//         + REMOVE ANY FIELDS THAT ARE IN THE PARENT CLASS
//         + Remember to use @Override when appropriate
public class Visa extends CreditCard
{
  // If balance plus chargeAmount is greater then limit, it will return insufficient_funds from enum of CardActionStatus class
  // Otherwise, return success and add balance with the chargeAmount
  @Override
  public CardActionStatus charge(double chargeAmount) {
    if ((getBalance() + chargeAmount) > limit) {
      return CardActionStatus.INSUFFICIENT_FUNDS; // insufficient funds
    }
    else {
      balance = balance + chargeAmount;
    }
    return CardActionStatus.SUCCESS;  // Successful transaction
  }

  @Override
  public double getBalance() {
    return balance;
  }

  @Override
  public void payBill(double payment) {
    balance -= payment;
  }
}
