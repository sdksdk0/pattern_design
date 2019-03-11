package cn.tf.pattern.factory.abstracFactory;

import cn.tf.pattern.factory.GeLi;
import cn.tf.pattern.factory.HaiEr;
import cn.tf.pattern.factory.IAirCondition;
import cn.tf.pattern.factory.MiDea;

/**
 * 生产空调的工厂
 */
public class AirConditionFactory extends AbstrAirConditionFactory {


    public IAirCondition createGeLi() {
        return new GeLi();
    }

    public IAirCondition createMiDea() {
        return new MiDea();
    }

    public IAirCondition createHaiEr() {
        return new HaiEr();
    }
}
