package cn.tf.pattern.strategy.promotion;

public class CashbackStrategy implements  PromotionStrategy{
    public void doPromotion() {
        System.out.println("返现");
    }
}
