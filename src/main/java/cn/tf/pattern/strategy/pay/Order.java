package cn.tf.pattern.strategy.pay;

import cn.tf.pattern.strategy.pay.Payport.PayStrategy;
import cn.tf.pattern.strategy.pay.Payport.Payment;

public class Order {
    private String uid;
    private String orderId;
    private int amount;  //以分为单位，这样可以避免精度丢失

    public Order(String uid, String orderId, int amount) {
        this.uid = uid;
        this.orderId = orderId;
        this.amount = amount;
    }

    public MsgResult pay(String payKey){
        Payment payment = PayStrategy.get(payKey);
        System.out.println("--欢迎━(*｀∀´*)ノ亻!使用---"+payment.getName());
        System.out.println("付款金額"+amount+",开始扣款");
        return payment.pay(uid,amount);
    }
}
