package cn.tf.pattern.proxy.dynamicProxy.jdkProxy;

import cn.tf.pattern.proxy.Person;

public class Son implements Person {
    public int findLove() {
        System.out.println("长的好看");
        return 1;
    }

    public int findJob() {
        return 1;
    }
}
