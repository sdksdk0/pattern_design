package cn.tf.pattern.factory.factoryMethod;

import cn.tf.pattern.factory.GeLi;
import cn.tf.pattern.factory.IAirCondition;
import cn.tf.pattern.factory.MiDea;

public class MiDeaFactory implements IAirConditionFactory {

    public IAirCondition getName() {
        return new MiDea();
    }
}
