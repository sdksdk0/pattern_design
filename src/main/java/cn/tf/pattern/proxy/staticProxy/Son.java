package cn.tf.pattern.proxy.staticProxy;

import cn.tf.pattern.proxy.Person;

public class Son implements Person {
    public int findLove() {
        System.out.println("找好看的对象");
        return 1;
    }

    public int findJob(){
        return 1;
    }


}
