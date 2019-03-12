package cn.tf.pattern.proxy.dynamicProxy.tfProxy;

import java.lang.reflect.Method;

public interface TFInvocationHandler {
    public Object invoke(Object proxy, Method method,Object[] args) throws Exception;
}
