package cn.tf.pattern.singleton.lazy;

//在外部需要的时候才加载
public class LazySimpleSingleton {
    private LazySimpleSingleton(){}
    private static LazySimpleSingleton lazy = null;
    public synchronized static LazySimpleSingleton getInstance(){
        if(lazy == null){
            lazy = new LazySimpleSingleton();
        }
        return lazy;
    }
}
