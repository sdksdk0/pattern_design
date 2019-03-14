package cn.tf.pattern.strategy.pay.Payport;

public class WechatPay extends Payment {
    public String getName() {
        return "微信支付";
    }

    protected double queryBalance(String uid) {
        return 200;
    }
}
