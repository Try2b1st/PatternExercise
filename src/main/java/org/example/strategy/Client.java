package org.example.strategy;

import java.util.HashMap;
import java.util.Map;

public class Client {
    public static void main(String[] args) {
        Map<String, Payment> map = new HashMap<>();
        //添加策略
        map.put("ali", Payment.AiliPayMent);
        map.put("wechat", Payment.WeChatPayMent);
        map.put("creditCard", Payment.CreditCardMent);

        PaymentContext paymentContext = new PaymentContext();

        paymentContext.setPayment(map.get("ali"));
        paymentContext.pay(20.0);

        paymentContext.setPayment(map.get("wechat"));
        paymentContext.pay(100.0);

        paymentContext.setPayment(map.get("creditCard"));
        paymentContext.pay(120.0);
    }
}
