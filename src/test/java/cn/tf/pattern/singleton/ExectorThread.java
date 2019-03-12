package cn.tf.pattern.singleton;

import cn.tf.pattern.singleton.ThreadLocal.ThreadLocalSingleton;
import cn.tf.pattern.singleton.lazy.LazySimpleSingleton;


public class ExectorThread implements Runnable{
    @Override
    public void run() {
 //       LazySimpleSingleton singleton = LazySimpleSingleton.getInstance();
        ThreadLocalSingleton singleton = ThreadLocalSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + singleton);
    }
}
