package cn.tf.pattern.proxy.dynamicProxy.tfProxy.test;

import cn.tf.pattern.proxy.dynamicProxy.tfProxy.TFClassLoader;
import cn.tf.pattern.proxy.dynamicProxy.tfProxy.TFInvocationHandler;
import cn.tf.pattern.proxy.dynamicProxy.tfProxy.TFProxy;

import java.lang.reflect.Method;

public class TFMeipo implements TFInvocationHandler {

    private Object target;

    public Object getInstance(Object target) throws  Exception{
        this.target = target;
        Class<?> clazz = target.getClass();
        return TFProxy.newProxyInstance(new TFClassLoader(),clazz.getInterfaces(),this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Exception {
        System.out.println("代理之前的操作");
        Object obj = method.invoke(this.target,args);
        System.out.println("代理之后的操作");
        return obj;
    }
}
