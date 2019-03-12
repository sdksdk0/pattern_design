package cn.tf.pattern.singleton.ThreadLocal;

/**
 * 线程单例的实现
 */
//ThreadLocal 不能保证其创建的对象是全局唯一，但是能保证在单个线程中是唯一的，天生的线程安全。
public class ThreadLocalSingleton {

    private static final ThreadLocal<ThreadLocalSingleton> threadLocal =
            new ThreadLocal<ThreadLocalSingleton>(){
                @Override
                protected ThreadLocalSingleton initialValue() {
                    return new ThreadLocalSingleton();
                }
            };

    private ThreadLocalSingleton(){};

    public static ThreadLocalSingleton getInstance(){
        return threadLocal.get();
    }

}
