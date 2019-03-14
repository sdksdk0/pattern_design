package cn.tf.pattern.strategy.promotion;

public class PromotionActivity {

    PromotionStrategy promotionStrategy;
    public  PromotionActivity(PromotionStrategy promotionStrategy){
        this.promotionStrategy = promotionStrategy;
    }

    public void exection(){
        this.promotionStrategy.doPromotion();
    }

}
