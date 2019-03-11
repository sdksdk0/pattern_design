package cn.tf.pattern.singleton.hungry;

/**
 * 饿汉式单例
 */
public class HungrySingleton {

    private static final HungrySingleton hungrySingleton =new HungrySingleton();
    private HungrySingleton(){}

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }

}
