package cn.tf.pattern.factory.factoryMethod;

import cn.tf.pattern.factory.GeLi;
import cn.tf.pattern.factory.IAirCondition;

public class GeLiFactory implements IAirConditionFactory {

    public IAirCondition getName() {
        return new GeLi();
    }
}
