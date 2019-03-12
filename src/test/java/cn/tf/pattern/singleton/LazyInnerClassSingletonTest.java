package cn.tf.pattern.singleton;


import cn.tf.pattern.singleton.lazy.LazyInnerClassSingleton;

import java.lang.reflect.Constructor;


public class LazyInnerClassSingletonTest {

    public static void main(String[] args) {
        try{
            //对单例进行破坏
            Class<?> clazz = LazyInnerClassSingleton.class;
            //通过反射拿到私有的构造方法
            Constructor c = clazz.getDeclaredConstructor(null);
            c.setAccessible(true);

            //暴力初始化,调用两次构造方法，相当于new了两次
            Object o1 = c.newInstance();
            Object o2 = c.newInstance();
             //对比两个对象是否相同
            System.out.println(o1 ==o2);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
