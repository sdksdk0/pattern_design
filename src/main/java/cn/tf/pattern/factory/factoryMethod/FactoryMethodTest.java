package cn.tf.pattern.factory.factoryMethod;

import cn.tf.pattern.factory.IAirCondition;

public class FactoryMethodTest {

    public static void main(String[] args) {
        IAirConditionFactory factory = new GeLiFactory();
        IAirCondition airCondition = factory.getName();
        System.out.println(airCondition.getName());

        factory=new MiDeaFactory();
        airCondition = factory.getName();
        System.out.println(airCondition.getName());

    }
}
