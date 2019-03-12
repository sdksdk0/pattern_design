package cn.tf.pattern.proxy.staticProxy;

import cn.tf.pattern.proxy.Person;

public class Father implements Person{

    private Son person;

    public Father(Son person){
        this.person = person;
    }

    public int findLove() {
        System.out.println("父亲开始帮忙找对象");
        this.person.findLove();
        System.out.println("确定关系");
        return 1;
    }

    public int findJob() {
        return 1;

    }
}
