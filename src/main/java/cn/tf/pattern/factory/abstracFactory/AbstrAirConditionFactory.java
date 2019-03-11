package cn.tf.pattern.factory.abstracFactory;

import cn.tf.pattern.factory.IAirCondition;

/**
 * 家用电器的工厂
 */
public abstract class AbstrAirConditionFactory {

    public abstract IAirCondition createGeLi();

    public abstract IAirCondition createMiDea();

    public abstract IAirCondition createHaiEr();

}
