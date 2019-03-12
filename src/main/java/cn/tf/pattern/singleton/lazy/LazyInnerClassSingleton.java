package cn.tf.pattern.singleton.lazy;

//内部类的方式实现
//这种形式兼顾饿汉式的内存浪费，也兼顾synchronized性能问题
public class LazyInnerClassSingleton {

    private static class LazyHolder{
        private static final LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
    }

    private  LazyInnerClassSingleton(){
        if(LazyHolder.LAZY!=null){
            throw  new RuntimeException("不允许创建多个实例");
        }
    };
    public static final LazyInnerClassSingleton getInstance(){
        return LazyHolder.LAZY;
    }
}
