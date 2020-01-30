package lionpay;

public interface IBank
{
  BankActionStatus withdraw(double amount);
  BankActionStatus deposit(double amount);
  double getBalance();
}
