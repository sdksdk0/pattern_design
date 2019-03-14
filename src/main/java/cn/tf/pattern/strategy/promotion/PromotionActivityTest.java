package cn.tf.pattern.strategy.promotion;

import org.springframework.util.StringUtils;

public class PromotionActivityTest {

    public static void main(String[] args) {
        /*PromotionActivity activity = new PromotionActivity(new CouponStrategy());
        activity.exection();

        activity = new PromotionActivity(new CashbackStrategy());
        activity.exection();*/


        String promotionKey = "COUPON";
        PromotionActivity promotionActivity = new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(promotionKey));
        promotionActivity.exection();



    }

}
