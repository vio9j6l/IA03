/*
 * Course: IST 311
 * Semester: Spring 2020
 * Instructor: Phil O'Connell (pxo4)
 * Student: JiaJia liu
 * Email: jpl5840@psu.edu
 * Assignment: IA03
 */

package lionpay;

public interface IBank
{
  BankActionStatus withdraw(double amount);

  BankActionStatus deposit(double amount);

  double getBalance();
}
