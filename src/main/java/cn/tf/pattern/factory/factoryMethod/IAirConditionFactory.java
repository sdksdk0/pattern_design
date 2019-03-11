package cn.tf.pattern.factory.factoryMethod;

import cn.tf.pattern.factory.IAirCondition;

public interface IAirConditionFactory {

    /**
     * 获取空调设备名称
     * @return
     */
    IAirCondition getName();


}
