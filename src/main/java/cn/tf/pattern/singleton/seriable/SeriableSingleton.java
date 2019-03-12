package cn.tf.pattern.singleton.seriable;

import java.io.Serializable;
//序列化单例
public class SeriableSingleton implements Serializable {

    public final static SeriableSingleton INSTANCE = new SeriableSingleton();
    private SeriableSingleton(){};

    public static SeriableSingleton getInstance(){
        return INSTANCE;
    }
    //防止被序列化破坏
    private Object readResolve(){
        return INSTANCE;
    }

}
