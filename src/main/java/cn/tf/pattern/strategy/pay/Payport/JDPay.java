package cn.tf.pattern.strategy.pay.Payport;

public class JDPay extends Payment {
    public String getName() {
        return "京东支付";
    }

    protected double queryBalance(String uid) {
        return 500;
    }
}
