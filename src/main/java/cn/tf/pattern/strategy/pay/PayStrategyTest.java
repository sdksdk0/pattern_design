package cn.tf.pattern.strategy.pay;

import cn.tf.pattern.strategy.pay.Payport.PayStrategy;

public class PayStrategyTest {

    public static void main(String[] args) {
        Order order = new Order("1","201903130000",300);
        MsgResult result = order.pay(PayStrategy.UNION_PAY);
        System.out.println(result);
    }
}
