package org.example.strategy;

public enum Payment {
    AiliPayMent{
        @Override
        public void pay() {
            System.out.println("支付宝支付");
        }
    },
    WeChatPayMent{
        @Override
        public void pay() {
            System.out.println("微信支付");
        }
    },
    CreditCardMent{
        @Override
        public void pay() {
            System.out.println("信用卡支付");
        }
    };

    public abstract void pay();
}
