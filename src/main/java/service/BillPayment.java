package service;

public class BillPayment {
    private  IPayment ipayment;


    public void setIpayment(IPayment payment) {
        this.ipayment = payment;
    }

    public void billCollector(double billAmount) {
        String Status=ipayment.payment(billAmount);
        System.out.println(Status);
    }

}
