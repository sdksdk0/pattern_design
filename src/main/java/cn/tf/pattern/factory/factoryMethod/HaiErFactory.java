package cn.tf.pattern.factory.factoryMethod;

import cn.tf.pattern.factory.GeLi;
import cn.tf.pattern.factory.HaiEr;
import cn.tf.pattern.factory.IAirCondition;

public class HaiErFactory implements IAirConditionFactory {

    public IAirCondition getName() {
        return new HaiEr();
    }
}
