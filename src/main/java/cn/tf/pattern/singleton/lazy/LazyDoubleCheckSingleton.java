package cn.tf.pattern.singleton.lazy;

//双重检查式单例
public class LazyDoubleCheckSingleton {
    //防止指令重排序
    private volatile static LazyDoubleCheckSingleton lazy = null;
    private LazyDoubleCheckSingleton(){}
    public static LazyDoubleCheckSingleton getInstance(){
        if(lazy == null){
            synchronized (LazyDoubleCheckSingleton.class){
                if(lazy == null){
                    lazy = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazy;
    }

}
