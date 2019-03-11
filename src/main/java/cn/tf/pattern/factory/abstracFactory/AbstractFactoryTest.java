package cn.tf.pattern.factory.abstracFactory;

import cn.tf.pattern.factory.IAirCondition;

public class AbstractFactoryTest {

    public static void main(String[] args) {
        AbstrAirConditionFactory factory = new AirConditionFactory();
        IAirCondition airCondition = factory.createGeLi();
        System.out.println(airCondition.getName());

        airCondition = factory.createHaiEr();
        System.out.println(airCondition.getName());

        airCondition = factory.createMiDea();
        System.out.println(airCondition.getName());

    }
}
