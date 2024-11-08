package service;

public class CreditCardPayment implements IPayment  {
    public String payment(double amount)
    {
        TotalPayment   totalPayment = new TotalPayment();
        totalPayment.testOfTotalPay();
        return "credit Card Payment";
    }


}
