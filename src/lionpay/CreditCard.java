/*
 * Course: IST 311
 * Semester: Spring 2020
 * Instructor: Phil O'Connell (pxo4)
 * Student: JiaJia liu
 * Email: jpl5840@psu.edu
 * Assignment: IA03
 */

package lionpay;

public abstract class CreditCard
{
  // LEAVE THESE FIELDS AS PROTECTED so subclasses can access it
  protected double limit = 1000; // will be the same for all credit cards
  protected double balance = 0;

  //Methods are concrete since they will be used in Visa and MasterCard class
  // TODO 03 + Look at Visa.java and MasterCard.java.  If this method should be concrete, then write it
  public CardActionStatus charge(double chargeAmount) {
    if ((balance + chargeAmount) > limit) {
      return CardActionStatus.LIMIT_EXCEEDED;
    } else {
      balance += chargeAmount;
    }
    return CardActionStatus.SUCCESS;
  }

  // TODO 04 + Look at Visa.java and MasterCard.java.  If this method should be concrete, then write it
  public void payBill(double payment){
    balance -= payment;
  }

  // TODO 05 + Look at Visa.java and MasterCard.java.  If this method should be concrete, then write it
  public double getBalance() {
    return balance;
  }

}
