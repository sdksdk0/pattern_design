package cn.tf.pattern.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 容器式单例，容器式写法适用于创建实例非常多的情况，便于管理。但是，是非线程安全的。
 */
public class ContainerSingleton {

    private ContainerSingleton(){}
    private static Map<String,Object> ioc = new ConcurrentHashMap<String, Object>();
    public static Object getInstance(String className){
        synchronized (ioc){
            if(!ioc.containsKey(className)){
                Object obj = null;
                try{
                    obj = Class.forName(className).newInstance();
                    ioc.put(className,obj);
                }catch (Exception e){
                    e.printStackTrace();
                }
                return obj;
            }else{
                return ioc.get(className);
            }
        }
    }

}
