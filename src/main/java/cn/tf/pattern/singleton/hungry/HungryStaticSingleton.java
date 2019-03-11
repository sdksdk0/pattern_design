package cn.tf.pattern.singleton.hungry;

//饿汉式静态块单例，这样会造成一定的内存浪费，因为在静态块中直接加载，不管这个类以后有没有用到
public class HungryStaticSingleton {

    private static final HungryStaticSingleton hungryStaticSingleton;
    static{
        hungryStaticSingleton = new HungryStaticSingleton();
    }
    private HungryStaticSingleton(){}
    public static HungryStaticSingleton getInstance(){
        return hungryStaticSingleton;
    }
}
