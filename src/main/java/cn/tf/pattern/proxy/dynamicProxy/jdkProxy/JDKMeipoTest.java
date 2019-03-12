package cn.tf.pattern.proxy.dynamicProxy.jdkProxy;

import cn.tf.pattern.proxy.Person;

public class JDKMeipoTest {

    public static void main(String[] args) {
        Person obj = (Person)new JDKMeipo().getInstance(new Son());
        obj.findLove();
    }
}
