package org.example.strategy;

public class PaymentContext {
    private Payment payment;

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public void pay(Double money) {
        this.payment.pay();
        System.out.println("支付：" + money + "￥");
    }
}
