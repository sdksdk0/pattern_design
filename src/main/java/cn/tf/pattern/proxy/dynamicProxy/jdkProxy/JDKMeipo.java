package cn.tf.pattern.proxy.dynamicProxy.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKMeipo implements InvocationHandler {

    private Object target;
    public Object getInstance(Object object){
        this.target = object;
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理之前的操作");
        Object obj = method.invoke(this.target,args);
        System.out.println("代理之后的操作");
        return obj;
    }
}
