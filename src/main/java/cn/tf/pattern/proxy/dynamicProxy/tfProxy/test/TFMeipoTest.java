package cn.tf.pattern.proxy.dynamicProxy.tfProxy.test;

import cn.tf.pattern.proxy.Person;
import cn.tf.pattern.proxy.dynamicProxy.jdkProxy.Son;

public class TFMeipoTest {

    public static void main(String[] args) throws Exception {
        Person obj = (Person)new TFMeipo().getInstance(new Son());
        obj.findLove();
    }
}
