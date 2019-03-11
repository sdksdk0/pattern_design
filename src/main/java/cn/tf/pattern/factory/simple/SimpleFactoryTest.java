package cn.tf.pattern.factory.simple;

import cn.tf.pattern.factory.GeLi;
import cn.tf.pattern.factory.IAirCondition;

public class SimpleFactoryTest {

    public static void main(String[] args) {
        AirConditionFactory factory = new AirConditionFactory();
        IAirCondition airCondition = factory.create(GeLi.class);
        System.out.println(airCondition.getName());
    }
}
